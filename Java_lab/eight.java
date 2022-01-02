import java.util.*;
import java.lang.Exception;
import java.util.Scanner;
class OddException extends Exception // Statement 1
{
OddException()
{
super("Odd number exception");
}
OddException(String msg)
{
super(msg);
}
}
class EvenOdd
{
void halfOf(int num)
{
try
{
if(num%2 != 0)
throw(new OddException()); // Statement 2
else
if (num == 0)
throw(new OddException());
else
System.out.print("\n\t" + num + " is an even number and its half is:"+ (num/2));
}
catch(OddException Ex)
{
System.out.print("\n\tError : " + Ex.getMessage());
}
System.out.print("\n\tEnd of program");
}
}
class eight
{
public static void main(String[] args)
{
int num;
Scanner Sc = new Scanner(System.in);
System.out.print("\n\tEnter any number : ");
num = Integer.parseInt(Sc.nextLine());
EvenOdd EO= new EvenOdd();
EO.halfOf(num);
}}
