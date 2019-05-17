class Task1
{
	public static void main(String args[])
	{
		System.out.println();
		System.out.println("***Patterns made using for loops***");
		System.out.println("Pattern: 'i'");
		for (int i=0 ; i<=5 ; i++)
		{
			for(int j=0 ; j<=i ; j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
          System.out.println();
          System.out.println();

		System.out.println("Pattern: 'ii'");
		for (int i=0 ; i<=5 ; i++)
		{
			for(int j=5 ; j>=i ; j--)
			{
				System.out.print("*");
			}
		System.out.println();
		}
          System.out.println();
          System.out.println();

		System.out.println("Pattern: 'iii'");
		for (int i=0 ; i<=5 ; i++)
		{
			for(int j=5 ; j>=i ; j--)
			{
				System.out.print(" ");
			}
			for(int k=1 ; k<=i ; k++)
			{
				System.out.print("*");
			}
			for(int l=2 ; l<=i ; l++)
			{
				System.out.print("*");
			}
		System.out.println();
		}

	}
}