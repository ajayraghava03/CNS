import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class RC4Blowfish {
    public static void main(String[] args) throws Exception {
        String text = "Hello world";
        String key = "MySecretKey";

        SecretKeySpec k = new SecretKeySpec(key.getBytes(), "Blowfish");

        Cipher c = Cipher.getInstance("Blowfish");
        c.init(Cipher.ENCRYPT_MODE, k);

        byte[] enc = c.doFinal(text.getBytes());

        System.out.println("Encrypted: " + new String(enc));
    }
}

