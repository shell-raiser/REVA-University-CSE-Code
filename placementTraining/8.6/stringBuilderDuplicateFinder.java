public class stringBuilderDuplicateFinder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abbcd");
        boolean visited[] = new boolean[256]; // for ascii
        for (int i = 0; i < str.toString().length(); i++) {
            if (i == str.toString().length() - 1) {
                break;
            }

            if (str.toString().toCharArray()[i] == str.toString().toCharArray()[i + 1]) {
                str.deleteCharAt(i);
            }
        }
        System.out.println(str);
    }
}
