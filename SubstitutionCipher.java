
import java.util.*;

class Substitution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String normal = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String key = "QWERTYUIOPASDFGHJKLZXCVBNM";

        System.out.print("Enter text: ");
        String s = sc.nextLine().toUpperCase();

        String enc = "", dec = "";

        for (char c : s.toCharArray())
            enc += key.charAt(normal.indexOf(c));

        for (char c : enc.toCharArray())
            dec += normal.charAt(key.indexOf(c));

        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);
    }
}

