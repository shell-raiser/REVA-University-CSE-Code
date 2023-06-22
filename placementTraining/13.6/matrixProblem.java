public class matrixProblem {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int odd[] = new int[arr.length / 2 + 1];
        int eve[] = new int[arr.length / 2 + 1];
        int co = 0;
        for (int i = 1; i < arr.length; i += 2) {
            odd[co] = arr[i];
            co++;
        }
        co = 0;
        for (int i = 0; i < arr.length; i += 2) {
            eve[co] = arr[i];
            co++;
        }

        findSecMax(odd);
        findSecMax(eve);
    }

    public static void findSecMax(int arr[]) {
        int secMax = 0;
        int Max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (Max < arr[i]) {
                secMax = Max;
                Max = arr[i];
            }
        }
        System.out.println(secMax);
    }
}
