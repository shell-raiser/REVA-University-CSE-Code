public class palindromeNumbers {
    public static void main(String[] args) {
        int strt = 10;
        int end = 80;
        String[] arr = new String[end - strt + 1];
        int co = 0;
        for (int i = strt; i <= end; i++) {
            arr[co] = String.valueOf(i);
            co++;
            // System.out.println(co++);
        }
        for (String j : arr) {
            palindromeChecker(j);
        }
    }

    public static void palindromeChecker(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != a.charAt(a.length() - i - 1)) {
                // System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println(a);
    }
}
