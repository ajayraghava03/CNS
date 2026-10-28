import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

class RC4Blowfish {
    public static void main(String[] args) throws Exception {
        String text = "Hello world";

        // RC4 logic (modern Java providers may not support RC4)
        byte[] rc4key = "MySecretKey".getBytes();
        SecretKeySpec rk = new SecretKeySpec(rc4key, "RC4");

        try {
            Cipher r = Cipher.getInstance("RC4");
            r.init(Cipher.ENCRYPT_MODE, rk);
            System.out.println("RC4: " +
                Base64.getEncoder().encodeToString(r.doFinal(text.getBytes())));
        } catch (Exception e) {
            System.out.println("RC4 not supported by this Java provider");
        }
//keytool -genseckey -alias blowfishkey -keyalg Blowfish -keysize 128 -keystore mykeystore.jceks -storetype JCEKS
//keytool -list -keystore mykeystore.jceks -storetype JCEKS
        // Blowfish key
        KeyGenerator kg = KeyGenerator.getInstance("Blowfish");
        SecretKey key = kg.generateKey();

        Cipher c = Cipher.getInstance("Blowfish");
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] enc = c.doFinal(text.getBytes());

        System.out.println("Blowfish: " +
            Base64.getEncoder().encodeToString(enc));
    }
}
