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
            enc += (char)(c + key);

        for (char c : enc.toCharArray())
            dec += (char)(c - key);

        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);
    }
}
