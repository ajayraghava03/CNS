import javax.crypto.*;
import java.util.*;

class Rijndael {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        KeyGenerator kg = KeyGenerator.getInstance("AES");
        kg.init(128);
        SecretKey key = kg.generateKey();

        Cipher c = Cipher.getInstance("AES");

        // Encryption
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] enc = c.doFinal(text.getBytes());

        // Decryption
        c.init(Cipher.DECRYPT_MODE, key);
        String dec = new String(c.doFinal(enc));

        System.out.println("Encrypted: " +
            Base64.getEncoder().encodeToString(enc));
        System.out.println("Decrypted: " + dec);
    }
}


output :
Enter text: ajay
Encrypted: rL/+qmgPRFG6+m4UXWvqCw==
Decrypted: ajay
