public class coinChange {
    public static void main(String[] args) {
        // denomintaions problem => 500, 200, 100 ,50 ,20, 10, 5, 2, 1
        // therefore, for 1450, we need min 9 denomintaions
        int available[] = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        Integer query = Integer.parseInt(args[0]);
        int numDenum = 0;
        // Boolean cont = true;
        // while (cont) {
        for (int denom : available) {
            int sm = Math.floorDiv(query,denom);
            numDenum += sm;
            query = query - (sm * denom);
            // Math.floor(denom);
            // numDenum++;
        }
        System.out.println(numDenum);
        // }
    }
}
