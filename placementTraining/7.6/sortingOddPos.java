public class sortingOddPos {
    public static void main(String[] args) {
        int arr[] = { 12, 13, 1, 2, 11, 4 };
        for (int i = 0; i < 6; i+=2) {
            for (int j = i + 1; j < 6; j+=2) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int k : arr) {
            System.out.println(k);
        }
    }
}
