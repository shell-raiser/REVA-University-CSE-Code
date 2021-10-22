import java.util.Scanner;
public class InfixToPostfixApp
{
	static Stack operators = new Stack();
	public static void main(String[] args) 
	{
		String infix;
		Scanner read = new Scanner(System.in);
		System.out.print("\nEnter the algebraic expression in infix: ");
		infix = read.nextLine();
		//output as postfix
		System.out.println("The expression in postfix is:" + toPostfix(infix));
		read.close();
	}
	private static String toPostfix(String infix)
	{
		char symbol;
		String postfix = "";
		
	    for(int i=0;i<infix.length();++i) 	//while there is input to be read
        {
			symbol = infix.charAt(i); 		//if it's an operand, add it to the string
			if (Character.isSpaceChar(symbol))
				continue;
	        if (Character.isLetter(symbol))
		postfix = postfix + symbol;
			else if (symbol=='(')			//push (
				operators.push(symbol);
			else if (symbol==')') 			//push everything back to (
			{
				while (operators.peek() != '(')
					postfix = postfix + operators.pop();
				operators.pop();		//remove '('
			}
			else	//print operators occurring before it that have greater precedence
			{
				while (!operators.isEmpty() && !(operators.peek()=='(') &&prec(symbol) <= prec(operators.peek()))
					postfix = postfix + operators.pop();
				operators.push(symbol);
			}
		}
		while (!operators.isEmpty())
			postfix = postfix + operators.pop();
		return postfix;
	}
	static int prec(char x)
	{
		if (x == '+' || x == '-')
			return 1;
		if (x == '*' || x == '/' || x == '%')
			return 2;
		return 0;
	}
}
class Stack
{
	char a[] = new char[100];
	int maxSize = 50;
	int top = -1;
	
	boolean isFull()
    {
	return (top >= (maxSize-1));
    }

    void push(char c) 
    { 
        if (isFull()) 
        {
	System.out.println("Stack full , no room to push , size=50");
			System.exit(0);
        }
        else
        a[++top] = c;
    } 
	char pop()
	{
		return a[top--];
	}
	boolean isEmpty()
	{
		return (top == -1) ? true : false;
	}
	char peek()
	{
		return a[top];
	}
}	