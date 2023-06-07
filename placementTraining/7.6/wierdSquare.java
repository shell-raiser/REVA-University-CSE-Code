public class wierdSquare {
    public static void main(String[] args) {
        char arr1[] = { '1', '2', '3', '4', '5' ,'6', '7'};
        // Commented code works, but slower
        // for (int i = 0; i < (arr1.length / 2); i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print(" ");
        // }
        // System.out.print(arr1[i]);
        // for (int j = 0; j < arr1.length - 2 * i; j++) {
        // System.out.print(" ");
        // }
        // System.out.print(arr1[arr1.length - 1 - i]);
        // System.out.println();
        // }
        // if (arr1.length % 2 != 0) {
        // for (int j = 0; j < arr1.length / 2 + 1; j++) {
        // System.out.print(" ");
        // }
        // System.out.println(arr1[arr1.length / 2]);
        // }
        // for (int i = (arr1.length / 2) - 1; i >= 0; i--) {
        // for (int j = i; j > 0; j--) {
        // System.out.print(" ");
        // }
        // System.out.print(arr1[i]);
        // for (int j = arr1.length - 2 * i; j > 0; j--) {
        // System.out.print(" ");
        // }
        // System.out.print(arr1[arr1.length - 1 - i]);
        // System.out.println();
        // }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (i == j || (i + j == arr1.length - 1)) {
                    System.out.print(arr1[i]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
