public class Hill {
    public static void main(String[] args) {
        String s = "HELP";
        int[][] k = {{3, 3}, {2, 5}};
        int[][] inv = {{15, 17}, {20, 9}};

        String enc = "", dec = "";

        for (int i = 0; i < s.length(); i += 2) {
            int a = s.charAt(i) - 'A';
            int b = s.charAt(i + 1) - 'A';

            enc += (char)((3*a + 3*b) % 26 + 'A');
            enc += (char)((2*a + 5*b) % 26 + 'A');
        }

        for (int i = 0; i < enc.length(); i += 2) {
            int a = enc.charAt(i) - 'A';
            int b = enc.charAt(i + 1) - 'A';

            dec += (char)((15*a + 17*b) % 26 + 'A');
            dec += (char)((20*a + 9*b) % 26 + 'A');
        }

        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);
    }
}
