import java.util.*;
class Task2
{
    public static void main(String[] args)
	{
		System.out.println(" ");
		System.out.println("***Mathematic Table***");
		System.out.println("\n");
		Scanner user_Input = new Scanner(System.in);

		System.out.print("Enter the Table which you want to print:");
		int table = user_Input.nextInt();
		System.out.print("Enter the starting Point of Table:");
		int starting = user_Input.nextInt();
        System.out.print("Enter the Ending Point of Table:");
        int ending = user_Input.nextInt();

        for (int i=starting ; i<=ending ; i++)
        {
        	System.out.println(table + "*" + starting + "=" + table*starting);
        	starting++;
        }		
	}
}