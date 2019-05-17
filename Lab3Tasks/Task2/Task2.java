import java.util.*;
class Task2
{
	public static void main(String args[])
	{
		System.out.println("\n");
		System.out.println("***Electiricity Bill***");
		System.out.println();
		Scanner user_Input = new Scanner(System.in);
		System.out.print("Enter The Units Consumed:");
		int units = user_Input.nextInt();
		int total = 0;

		for (int i = 1 ; i <= units ; i++)
		{
			if (i >=1 && i<= 50)
			{
				total = total + 10;
			}

			if (i > 50 && i <= 100)
			{
				total = total + 15;
			}

			if(i > 100 && i <= 200)
			{
				total = total + 20;
			}

			if(i >200 && i <= 300)
			{
				total = total + 20;
			}

			if(i > 300)
			{
				total = total + 30;
			}
		}
		System.out.println("The Total Bill Amount:" + total);
	}
}