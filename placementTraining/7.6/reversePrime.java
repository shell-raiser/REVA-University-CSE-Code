// find if given number is prime, if yes check if reverse of the number is also prime

import java.util.Scanner;

public class reversePrime {
    public static void main(String[] args) {
        // int n = 1399;
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if (isPrime(n)) {
            int rev = reverse(n);
            System.out.println(rev);
            if (isPrime(rev)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
        sc.close();
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}