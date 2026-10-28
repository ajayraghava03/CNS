
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

class Blowfish {
    public static void main(String[] args) throws Exception {
        String text = "Hello";

        KeyGenerator kg = KeyGenerator.getInstance("Blowfish");
        SecretKey key = kg.generateKey();

        Cipher c = Cipher.getInstance("Blowfish");

        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] enc = c.doFinal(text.getBytes());

        c.init(Cipher.DECRYPT_MODE, key);
        String dec = new String(c.doFinal(enc));

        System.out.println("Encrypted: " + new String(enc) +
                           "\nDecrypted: " + dec);
    }
}

