import java.util.ArrayList;
public class UpperBoundWildcard {
private static Double add(ArrayList<? extends Number> num) {
double sum=0;
double den =2.0;
for(Number n:num)
{
if((n.doubleValue()%den)!=0)
{ sum = sum+n.doubleValue();
System.out.println(n.doubleValue());
}
}
return sum;
}
public static void main(String[] args) {
ArrayList<Integer> l1=new ArrayList<Integer>();
l1.add(10);
l1.add(20);
l1.add(21);
l1.add(35);
l1.add(42);
l1.add(55);
System.out.println("displaying the sum= "+add(l1));
}
}