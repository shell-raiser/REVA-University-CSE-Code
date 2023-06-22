public class number {
    public static void main(String[] args) {
        String phone_numbers[] = { "234-567-890", "444-444-444", "321-543-234" };
        String[] phone_owners = { "Harry", "Nick", "Michael" };

        String number = "444-444-444";
        System.out.println(Solution.solution(phone_numbers, phone_owners, number));
    }
}

class Solution {
    public static String solution(String[] phone_numbers, String[] phone_owners, String number) {
        // Implement your solution here

        int i;
        for (i = 0; i < phone_numbers.length; i++) {
            if (number == phone_numbers[i]) {
                System.out.println("this is a debug message");
                return phone_owners[i];
            }
        }

        return number;
    }
}
