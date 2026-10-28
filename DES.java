import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

class DES {
    public static void main(String[] args) throws Exception {
        String text = "Hello";

        KeyGenerator kg = KeyGenerator.getInstance("DES");
        SecretKey key = kg.generateKey();

        Cipher c = Cipher.getInstance("DES");

        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] enc = c.doFinal(text.getBytes());

        c.init(Cipher.DECRYPT_MODE, key);
        String dec = new String(c.doFinal(enc));

        System.out.println("Encrypted: " + new String(enc) +
                           "\nDecrypted: " + dec);
    }
}
