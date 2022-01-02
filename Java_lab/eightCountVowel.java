import java.util.*;
public class eightCountVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vow=0, cons = 0, no = 0;
        String str = sc.nextLine();
        str = str.toLowerCase();
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vow++;
            }
            else if (str.charAt(i)>='a'&&str.charAt(i)<='z'){
                cons++;
            }
            else if (str.charAt(i)>='0'&&str.charAt(i)<='9'){
                no++;
            }

        }
        System.out.println(cons);
        System.out.println(vow);
        System.out.println(no);
        sc.close();
    }
}
