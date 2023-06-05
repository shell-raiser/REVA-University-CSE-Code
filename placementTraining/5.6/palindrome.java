public class palindrome {
    public static void main(String[] args) {
        String str = args[0];
        str = str.toUpperCase();
        char strArr[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {

            if (strArr[i] != strArr[str.length() - 1 - i]) {
                System.out.println("not palindrome");
                return;
            }
            // System.out.println(str[i]);
        }
        System.out.println("palindrome");

    }
}