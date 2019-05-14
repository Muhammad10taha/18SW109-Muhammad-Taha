public class Task1{
	public void Result01(){
		System.out.println("\n");
		System.out.println("****TASK 1 : Display your result**** \n \n ");
		String name = "Muhammad Taha" ;
		int total_marks = 95 ;
		byte b = (byte)total_marks;
		long obtained_marks = 95 ; 
		short i = (short) obtained_marks;
		double Percentage = (obtained_marks*100/total_marks) ;
		float f = (float) Percentage ;	
			
			System.out.println("Student Name: "+name);
			System.out.println("Total Marks: "+ b);
			System.out.println("Obtained Marks: "+i);
			System.out.println("Percentage: "+f);
		if(f >= 75 && f < 95){
			char Grade = 'C';
			System.out.println("Grade: "+ Grade);
		}
		if(f >= 85 &&f < 95){
			char Grade = 'B';
			System.out.println("Grade: "+ Grade);
		}
		if(f >=95){
			char Grade = 'A';
			System.out.println("Grade: "+ Grade);
		}
		if(f >=75){
			boolean t = true;
			System.out.println("Staus: YOU PASSED\n \n");
		}
		if(f <75){
			boolean y=false;
			System.out.println("Status: YOU FAILED");
			
			
		}
		System.out.println("****TASK 2 : Display the actual , integral and fractional part!****\n \n  ");
	}
			public void maths(){
			double num = 50.25 ;
			long l = (long)num ;
			double d = num-50 ;
				System.out.println("Actual no :  "+ num );
				System.out.println("Integral Part : "+ l );
				System.out.println("Fractional Part:  "+ d );
			}
}