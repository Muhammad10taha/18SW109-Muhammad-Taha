class Task03
{
	public static void main(String args[])
	{
		//Declare 5 floating numbers and find average and thier total sum!
		System.out.println("\n");
		System.out.println("***Average and thier total sum*** ");
		System.out.println("\n");
		float num1=5.9f , num2=3.91f , num3= 98.78f , num4=34.66f , num5=81.99f;
		float total_Sum =(float) num1+num2+num3+num4+num5;
		float average= (float) (total_Sum/5);
		System.out.println("Total Sum Of 5 Float Numbers is: " + total_Sum);
		System.out.println("Average Of 5 Float Numbers is: " + average);
	}
}