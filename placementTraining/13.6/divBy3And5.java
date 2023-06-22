public class divBy3And5 {
    public static void main(String[] args) {
        calc(12,50);
    }
    public static void calc(int m, int n){
        int su = 0;
        for (int i = m;i<=n;i++){
            if (i%3 == 0 && i%5 == 0){
                su += i;
            }
        }
        System.out.println(su);
    }
}
