class Task6
{
    public static void main(String[] args)
	{
		System.out.println("\n");
		System.out.println("***Finding the position of an array! ***");
		System.out.println("\n");
		
        int search =Integer.parseInt(args[0]);
        int count=0;
        int arr[] = {22,12,3,5,65,78,5,65,77,65,45,43};
        for(int i=0; i<arr.length; i++)
        {
        	if (search==arr[i])
        	{
        		System.out.println("The number is there at Postion no:" + (i+1));
                count++;
        	}
        }
        if(count==0)
            {
                System.out.println("Number not Found");

            }
	}
}