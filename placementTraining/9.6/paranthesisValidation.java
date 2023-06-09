public class paranthesisValidation {
    public static void main(String[] args) {
        // String str1 = "(){}[]";
        // String str1 = "([{}])";
        String str1 = "({[})";
        int curly = 0;
        int box = 0;
        int bracket = 0;

        for (char i : str1.toCharArray()) {
            if (i == '{') {
                curly++;
            } else if (i == '(') {
                bracket++;
            } else if (i == '[') {
                box++;
            } else if (i == '}') {
                curly--;
            } else if (i == ']') {
                box--;
            } else if (i == ')') {
                bracket--;
            }
        }
        System.out.println((curly == 0 && bracket == 0 && box == 0) ? "Yes" : "No");
    }
}
