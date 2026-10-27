import java.security.MessageDigest;

class SHA1 {
    public static void main(String[] args) throws Exception {
        String text = "Hello world";

        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] hash = md.digest(text.getBytes());

        String result = "";
        for (byte b : hash)
            result += String.format("%02x", b);

        System.out.println("SHA-1 Digest: " + result);
    }
}