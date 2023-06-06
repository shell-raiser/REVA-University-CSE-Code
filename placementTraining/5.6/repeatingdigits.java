public class repeatingdigits {
    // find number of digits repeating in a given number
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        for (int i = 0; i < 10; i++) {
            int count = 0;
            while (num > 0) {
                int digit = num % 10;
                if (digit == i) {
                    count++;
                }
                num = num / 10;
            }
            System.out.println(i + " " + count);
        }
    }
}
