// Anagrams - 2 words have same letters

import java.util.Arrays;

public class checkAnagrams {
    public static void main(String[] args) {
        int alps[] = new int[26];
        String s1 = "listen";
        String s2 = "silent";
        s1.toLowerCase();
        s2.toLowerCase();
        int arr1[] = new int[s1.length()];
        int arr2[] = new int[s2.length()];
        // fill alphabets
        for (int i = 0; i < 26; i++) {
            alps[i] = i;
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) s1.charAt(i) - 97;
            arr2[i] = (int) s2.charAt(i) - 97;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length != arr2.length){
            System.out.println("No");
        }
        else if (checker(arr1, arr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean checker(int arr1[], int arr2[]) {
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
