public class count1sInBin {
    public static void main(String[] args) {
        String n = Integer.toBinaryString(25);
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println(count);
    }
}
