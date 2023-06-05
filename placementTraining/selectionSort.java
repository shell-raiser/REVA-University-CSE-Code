public class selectionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 4, 9, 21, 0 };
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    temp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
