import java.util.Scanner;
public class Fraction
{
// member variables
private int numerator, denominator; // stores the fraction data
Scanner myInput = new Scanner( System.in );
public Fraction()
{
numerator = denominator = 0;
}
public int getNumerator()
{
return numerator;
}
public void setNumerator(int num)
{
numerator=num;
}
public int getDenominator()
{
return denominator;
}
public void setDenominator(int den)
{
denominator=den;
}
public Fraction add(Fraction b)
{
// check preconditions
if ((denominator == 0) || (b.denominator == 0))
throw new IllegalArgumentException("invalid denominator");
// find lowest common denominator
int common = lcd(denominator, b.denominator);
// convert fractions to lcd
Fraction commonA = new Fraction();
Fraction commonB = new Fraction();
commonA = convert(common);
commonB = b.convert(common);
// create new fraction to return as sum
Fraction sum = new Fraction();
// calculate sum
sum.numerator = commonA.numerator + commonB.numerator;
sum.denominator = common;
// reduce the resulting fraction
sum = sum.reduce();
return sum;
}
public Fraction subtract(Fraction b)
{
// check preconditions
if ((denominator == 0) || (b.denominator == 0))
throw new IllegalArgumentException("invalid denominator");
// find lowest common denominator
int common = lcd(denominator, b.denominator);
// convert fractions to lcd
Fraction commonA = new Fraction();
Fraction commonB = new Fraction();
commonA = convert(common);
commonB = b.convert(common);
// create new fraction to return as difference
Fraction diff = new Fraction();
// calculate difference
diff.numerator = commonA.numerator - commonB.numerator;
diff.denominator = common;
// reduce the resulting fraction
diff = diff.reduce();
return diff;
}
public Fraction multiply(Fraction b)
{
// check preconditions
if ((denominator == 0) || (b.denominator == 0))
throw new IllegalArgumentException("invalid denominator");
// create new fraction to return as product
Fraction product = new Fraction();
// calculate product
product.numerator = numerator * b.numerator;
product.denominator = denominator * b.denominator;
// reduce the resulting fraction
product = product.reduce();
return product;
}
public Fraction divide(Fraction b)
{
// check preconditions
if ((denominator == 0) || (b.numerator == 0))
throw new IllegalArgumentException("invalid denominator");
// create new fraction to return as result
Fraction result = new Fraction();
// calculate result
result.numerator = numerator * b.denominator;
result.denominator = denominator * b.numerator;
// reduce the resulting fraction
result = result.reduce();
return result;
}
public void input()
{
// prompt user to enter numerator
System.out.print("Please enter an integer for numerator: ");
// get user input
numerator = myInput.nextInt();
// prompt user to enter denominator in a loop to prevent
// an invalid (zero) value for denominator
do {
System.out.print("Please enter a non-zero integer for denominator: ");
denominator = myInput.nextInt();
// make sure it is non-zero
if (denominator == 0)
System.out.println("Invalid value. Please try again.");
} while (denominator == 0);
}
public void output()
{
System.out.print(this);
}
public String toString()
{
String buffer = numerator + "/" + denominator;
return buffer;
}
private int lcd(int denom1, int denom2)
{
int factor = denom1;
while ((denom1 % denom2) != 0)
denom1 += factor;
return denom1;
}
private int gcd(int denom1, int denom2)
{
int factor = denom2;
while (denom2 != 0) {
factor = denom2;
denom2 = denom1 % denom2;
denom1 = factor;
}
return denom1;
}
private Fraction convert(int common)
{
Fraction result = new Fraction();
int factor = common / denominator;
result.numerator = numerator * factor;
result.denominator = common;
return result;
}
private Fraction reduce()
{
Fraction result = new Fraction();
int common = 0;
// get absolute values for numerator and denominator
int num = Math.abs(numerator);
int den = Math.abs(denominator);
// figure out which is less, numerator or denominator
if (num > den)
common = gcd(num, den);
else if (num < den)
common = gcd(den, num);
else // if both are the same, don't need to call gcd
common = num;
// set result based on common factor derived from gcd
result.numerator = numerator / common;
result.denominator = denominator / common;
return result;
}
public static void main(String args[])
{
Fraction f1 = new Fraction(); // local fraction objects
Fraction f2 = new Fraction(); // used to test methods
// one way to set up fractions is simply to hard-code some values
f1.setNumerator(1);
f1.setDenominator(3);
f2.setNumerator(1);
f2.setDenominator(6);
// try some arithmetic on these fractions
Fraction result = new Fraction();
// test addition
result = f1.add(f2);
// one way to output results, using toString method directly
System.out.println(f1 + " + " + f2 + " = " + result);
// test addition going the other way - should be same result
result = f2.add(f1);
// output results
System.out.println(f2 + " + " + f1 + " = " + result);
System.out.println();
// test subtraction
result = f1.subtract(f2);
// output results
System.out.println(f1 + " - " + f2 + " = " + result);
// test subtraction going the other way - should be different result
result = f2.subtract(f1);
// output results
System.out.println(f2 + " - " + f1 + " = " + result);
// another way to set up fractions is to get user input
System.out.println();
System.out.println("Fraction 1:");
f1.input();
System.out.println();
System.out.println("Fraction 2:");
f2.input();
System.out.println();
// test multiplication
result = f1.multiply(f2);
// another way to output results is to use the output method
// this uses the toString method indirectly
f1.output();
System.out.print(" * ");
f2.output();
System.out.print(" = ");
result.output();
System.out.println();
// test division
result = f1.divide(f2);
// output results
f1.output();
System.out.print(" / ");
f2.output();
System.out.print(" = ");
result.output();
System.out.println();
}
}