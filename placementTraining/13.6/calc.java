public class calc {
    public static void main(String[] args) {
        OperationChoices(1, 12, 16);
    }

    public static void OperationChoices(int c, int a, int b) {
        if (c == 1) {
            System.out.println(a + b);
        } else if (c == 2) {
            System.out.println(a - b);
        } else if (c == 3) {
            System.out.println(a * b);
        } else if (c == 4) {
            System.out.println(a / b);
        }
    }
}
