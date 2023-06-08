public class missingElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6 };
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            // if (arr[i] + 1 != arr[i + 1]) {
            // System.out.println((arr[i] + 1) + " Missing");
            // break;
            // }
            sum1 += arr[i];
        }
        for (int i = 1; i <= arr[arr.length - 1]; i++) {
            sum2 += i;
        }

        int missing = sum2 - sum1;
        if (missing != 0) {
            System.out.println(missing + " missing");
        } else {
            System.out.println("No Missing");
        }
    }
}