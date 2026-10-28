import java.util.*;

class Hill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] key = {{3, 3}, {2, 5}};

        System.out.print("Enter 2-letter text: ");
        String s = sc.next().toUpperCase();

        int a = s.charAt(0) - 'A';
        int b = s.charAt(1) - 'A';

        int x = (3 * a + 3 * b) % 26;
        int y = (2 * a + 5 * b) % 26;

        String enc = "" + (char)(x + 'A') + (char)(y + 'A');

        int det = 9;
        int inv = 3;   // inverse of 9 mod 26

        int p = (inv * (5 * x - 3 * y)) % 26;
        int q = (inv * (-2 * x + 3 * y)) % 26;

        if (p < 0) p += 26;
        if (q < 0) q += 26;

        String dec = "" + (char)(p + 'A') + (char)(q + 'A');

        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);
    }
}

