//find 2 int from array which sums up to target

public class find2Elements {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println("No such elements");
                return;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " (at " + i + ") + " + arr[j] + " (at " + j + ") = " + target);
                }
            }
        }
    }
}