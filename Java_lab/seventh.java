import java.util.*;
public class seventh {
    public static void main(String[] args) {
        int a, b;
        char c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.next().charAt(0);
        switch(c){
            case '+': System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '/': System.out.println(a/b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '%': System.out.println(a%b);
            break;
        }
    }    
}
