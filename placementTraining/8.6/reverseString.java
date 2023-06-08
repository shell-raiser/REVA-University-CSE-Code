public class reverseString {
    public static void main(String[] args) {
        String s = "hello world";
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            char temp = c[i];
            c[i] = c[c.length - i - 1];
            c[c.length - i - 1] = temp;
        }

        String res = "";
        for (char i : c) {
            res += i;
        }
        System.out.println(res);

    }
}
