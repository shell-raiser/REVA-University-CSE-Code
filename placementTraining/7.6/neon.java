
// sum of digits of square of the number is equal to the number
import java.util.Scanner;

public class neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int nsq = n * n;
        String nsqStr = Integer.toString(nsq);
        int sqSum = 0;
        for (char ch : nsqStr.toCharArray()) {
            sqSum += Integer.parseInt(String.valueOf(ch));
        }
        System.out.println(sqSum);
        System.out.println(sqSum == n);
        sc.close();
    }
}