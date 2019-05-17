class Task5{
	 public static void main(String[]args){
		System.out.println("\n");
		System.out.println("***Largest number in the array***");
		System.out.println("\n");
		int array[] = {2,7,13,5,9};
		int largest = array[0];
		for(int i=1; i<5; i++){
      if(array[i]>= largest){
        largest = array[i];
    }
    }   
		System.out.println("Largest="+largest);
	}
}