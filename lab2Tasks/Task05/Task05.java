public class Task05 { 
    public static void main(String[] args) 
    { 
	System.out.println("\n");
	System.out.println("***Demonstrate the working of Bitwise Operators***");
	System.out.println("\n");
        int a = 5; 
        int b = 7; 
		System.out.println("\n");
        System.out.println("Following are Bitwise Operators and Their Working");
		System.out.println("\n");
  
        // bitwise and 
        // 0101 & 0111=0101 = 5 
        System.out.println("1) a&b = " + (a & b)); 
  
        // bitwise or 
        // 0101 | 0111=0111 = 7 
        System.out.println("2) a|b = " + (a | b)); 
  
        // bitwise xor 
        // 0101 ^ 0111=0010 = 2 
        System.out.println("3) a^b = " + (a ^ b)); 
  
        // bitwise and 
        // ~0101=1010 
        // will give 2's complement of 1010 = -6 
        System.out.println("4) ~a = " + ~a); 
  
        // can also be combined with 
        // assignment operator to provide shorthand 
        // assignment 
        // a=a&b 
        a &= b; 
        System.out.println("5) a= " + a); 
    } 
} 