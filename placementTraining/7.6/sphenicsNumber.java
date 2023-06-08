public class sphenicsNumber {
    public static void main(String[] args) {
        // int arr1[] = { 2, 3, 4, 5, 6, 8, 9, 10 };
        int n = 30;
        int arr[] = new int[9999];
        int arr2[] = new int[9999];
        int k = 0;
        for (int i = 1; i < 9999; i++) {
            // System.out.println(i);
            for (int j = 1; j < i / 2; j++) {
                // System.out.println(j);
                if (i % j == 0) {
                    System.out.println(i);
                    arr2[k] = i;
                    k++;
                    continue;
                }
            }
        }
        // for (int i : arr2) {
        // System.out.println(i);
        // }
    }

}
