import java.util.*;
class Task3
{
    public static void main(String[] args)
	{
		System.out.println("\n");
		System.out.println("***Sum of Integers***");
		System.out.println("\n");
        Scanner user_Input = new Scanner(System.in);
        System.out.print("Enter N Number of Integers to Sum Them:");
        int n_Integers = user_Input.nextInt();

        int arr[] = new int[n_Integers];
        int sum=0;
        int n=1;

        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print("Enter Digit no " + n++ + ": ");
            arr[i] = user_Input.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum of "+ n_Integers + " integers is:" + sum);
	}
}