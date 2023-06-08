public class postFixEvaluation {
    public static void main(String[] args) {
        String s = "63541*-/+";
        char sub[] = new char[5];
        int i;
        for (i = 0; i < s.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < 9; j++) {
                if (Integer.valueOf(s.charAt(i)) == j) {
                    flag = true;
                }
            }
            System.out.println(i);
            if (flag) {
                sub[i] = s.charAt(i);
            } else {
                break;
            }
        }
        char sym[] = new char[4];
        int count = 0;
        for (int j = i; j < s.length(); j++) {
            sym[count] = sub[j];
            count++;
        }
        System.out.println(sub);
        System.out.println(sym);
    }
}