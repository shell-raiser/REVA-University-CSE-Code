public class exp {
    public static void main(String[] args) {
        MaxExponents(7, 12);
    }

    public static void MaxExponents(int a, int b) {
        int max = 0;
        for (int i = a; i < b; i++) {
            if (checkIfExp(i)) {
                max = i;
            }
        }
        if (max == 0) {
            System.out.println("No exponent");
        } else {
            System.out.println(max);
        }
    }

    public static boolean checkIfExp(int i) {
        int no = 1;
        for (int j = 0; j < i / 2; j++) {
            no *= 2;
            if (no == i) {
                return true;
            }
        }
        return false;
    }
}
