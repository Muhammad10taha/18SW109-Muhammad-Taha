import java.util.*;
class Task4
{
	public static void main(String args[])
	{
		System.out.println("\n");
		System.out.println("***Arithmatic Operations***");
		System.out.println("\n");
		float	first_Num = Integer.parseInt(args[0]);
		float second_Num = Integer.parseInt(args[1]);
		char operator = args[2].charAt(0);

		switch (operator)
		{
			case '+':
			System.out.println("Sum of Two Numbers is:" + (first_Num + second_Num));
			break;

			case '-':
			System.out.println("Subtraction Of Two Numbers is:" + (first_Num - second_Num));
			break;

			case '*':
			System.out.println("Multiplication of Two Numbers is:" + (first_Num * second_Num));
			break;

			case '/':
			System.out.println("Division of Two Numbers is:" + (first_Num/second_Num));
			break;
		}
	}
}