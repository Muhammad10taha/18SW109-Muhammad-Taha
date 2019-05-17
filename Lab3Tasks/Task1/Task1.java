import java.util.*;
class Task1
{
	public static void main(String args[])
	{
		System.out.println("\n");
		System.out.println("***Mark sheet*** ");
		System.out.println("\n");
		Scanner user_Input = new Scanner(System.in);
		int total_Marks = 300;

		System.out.print("Enter Marks in Operating System:");
		float o_S = user_Input.nextFloat();

		System.out.print("Enter Marks in C++:");
		float c_Plus = user_Input.nextFloat();

		System.out.print("Enter Marks in Data Structure:");
		float data_Structure = user_Input.nextFloat();
		float obt_Marks =(float) data_Structure + c_Plus + o_S;
		System.out.println("Student got " + obt_Marks + " Out of " + total_Marks);
		float percentage =(float) (obt_Marks/300) * 100;
		System.out.println("Percentage is:" + percentage + "%");

		if(percentage >= 90)
		{
			System.out.println("Grade:A");
		}

		else if(percentage >= 80 && percentage < 90)
		{
			System.out.println("Grade:B");
		}

		else if(percentage >= 70 && percentage < 80)
		{
			System.out.println("Grade:C");
		}

		else if(percentage >= 60  && percentage < 70)
		{
			System.out.println("Grade:D");
		}

		else if(percentage < 60)
		{
			System.out.println("Grade:Fail");
		}
	}
}