import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        float a, b, c;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter A");
        a = obj.nextFloat();
        System.out.println("Enter B");
        b= obj.nextFloat();
        c = a + b;
        System.out.println("A + B is "+c);
    }    
}
