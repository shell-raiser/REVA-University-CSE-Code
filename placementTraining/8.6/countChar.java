import java.util.Scanner;

public class countChar {
    public static void main(String[] args) {
        // String s = "Hello, world";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (((int) (s.charAt(i)) >= 97) && ((int) (s.charAt(i)) <= 123)) {
                arr[(int) (s.charAt(i)) - 97] += 1;
            } else if (((int) (s.charAt(i)) >= 65) && ((int) (s.charAt(i)) <= 91)) {
                arr[(int) (s.charAt(i)) - 65] += 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println((char) (i + 97) + " " + arr[i]);
            }
        }

        // a 97
        // A 65
        // " " 32

    }
}
