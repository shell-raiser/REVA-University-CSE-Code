public class seqFour {
    public static void main(String[] args) {
        // int ls[] = { 3,2,6,5,1,4,8,9 };
        String l = "3,2,6,5,1,4,8,9";
        String ls[] = l.split(",");
        int fiveId = 0;
        int eightId = 0;
        int num1 = 0;
        String num2 = "";
        for (int i = 0; i < ls.length; i++) {
            // System.out.println( ls[i]);
            if (ls[i].equals("5")) {
                fiveId = i;
                // System.out.println(fiveId);
            }
            if (ls[i].equals("8")) {
                eightId = i;
            }
        }

        for (int i = 0; i < fiveId; i++) {
            num1 += Integer.parseInt(ls[i]);
        }
        for (int i = eightId; i < ls.length; i++) {
            num1 += Integer.parseInt(ls[i]);
        }

        for (int i = fiveId; i < eightId; i++) {
            num2 += ls[i];
        }

        System.out.println(num1 + Integer.parseInt(num2));

    }
}