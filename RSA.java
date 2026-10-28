import java.security.*;
import javax.crypto.Cipher;

class RSA {
    public static void main(String[] args) throws Exception {
        String text = "Hello";

        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(2048);
        KeyPair kp = kpg.generateKeyPair();

        Cipher c = Cipher.getInstance("RSA");

        c.init(Cipher.ENCRYPT_MODE, kp.getPublic());
        byte[] enc = c.doFinal(text.getBytes());

        c.init(Cipher.DECRYPT_MODE, kp.getPrivate());
        String dec = new String(c.doFinal(enc));

        System.out.println("Encrypted: " + new String(enc) +
                           "\nDecrypted: " + dec);
    }
}

