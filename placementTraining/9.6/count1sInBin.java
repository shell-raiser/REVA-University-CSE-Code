public class count1sInBin {
    public static void main(String[] args) {
        String n = Integer.toBinaryString(25);
        int count = 0;
        for (char i : n.toCharArray()) {
            if (i == '1') {
                count++;
            }
        }
        System.out.println(count);
    }
}