import java.util.*;

class Caesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String s = sc.nextLine();

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        String enc = "", dec = "";

        for (char c : s.toCharArray())
             enc += (char)('A' + (c - 'A' + key) % 26);

        for (char c : enc.toCharArray())
             dec += (char)('A' + (c - 'A' - key + 26) % 26);

        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);
    }
}



##################### other ########################


import java.util.Scanner;

public class CaesarCipher {

    static String encrypt(String text, int key) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ('A' + (ch - 'A' + key) % 26);
            } 
            else if (ch >= 'a' && ch <= 'z') {
                ch = (char) ('a' + (ch - 'a' + key) % 26);
            }

            result += ch;
        }

        return result;
    }

    static String decrypt(String text, int key) {
        return encrypt(text, (26 - key % 26) % 26);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the message: ");
        String message = sc.nextLine();

        System.out.print("Enter the key (0-25): ");
        int key = sc.nextInt();

        String encrypted = encrypt(message, key);
        String decrypted = decrypt(encrypted, key);

        System.out.println("Encrypted message: " + encrypted);
        System.out.println("Decrypted message: " + decrypted);

        sc.close();
    }
}
