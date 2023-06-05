public class stringProb {
    // cipher - abcz
    // key - 4
    // op - efgd
    public static void main(String[] args) {
        String cipher = args[0];
        int key = Integer.parseInt(args[1]);
        for (int i = 0; i < cipher.length(); i++) {
            int ch = cipher.charAt(i) + key;
            while (ch > 'z') {
                ch -= 26;
            }
            System.out.println((char) ch);
        }

    }
}
