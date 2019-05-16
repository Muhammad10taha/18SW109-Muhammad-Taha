class Task02
{
	public static void main(String args[])
	{
		System.out.println("\n");
		System.out.println("***Workin' of Relational and logical boolean Operators***");
		System.out.println("\n");
		int a=10;
		int b=20;
		System.out.println("The Value of a is = " + a);
		System.out.println("The Value of b is = " + b);
		System.out.println("\n");
		System.out.println("**Following are Relational Operators and their Working**");
		System.out.println("1) ==(Equals to)   a==b = " + (a==b));
		System.out.println("2) !=(not equal to) a!=b = " + (a!=b));
		System.out.println("3) >(greater than) a>b = " + (a>b));
		System.out.println("4) <(less than) a<b = " + (a<b));
		System.out.println("5) >=(greater than or equal to) a>=b = " + (a>=b));
		System.out.println("6) <=(less than or equal to) a<=b = " + (a<=b));
		System.out.println("\n");
		System.out.println("**Following are Logical Operators and their Working**");
		boolean result1= (a<b && b>a);
		boolean result2=(b<a && b>a);
		System.out.println("1) &&(logical and) a<b && a>b = " + result1);
		System.out.println("2) ||(Logical OR Operator) b<a || b>a = " + result2);
		System.out.println("3) !(Logical Not Operator result1 != true " + (result1!=true));

	}
}