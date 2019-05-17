import java.util.*;
class Task3
{
	public static void main(String args[])
	{
		System.out.println("\n");
		System.out.println("*****vowels and constants**** ");
		System.out.println("\n");
		Scanner user_Input = new Scanner(System.in);
		System.out.print("Enter The Character to Check Weather it is VOWEL aur CONSONANT:");
		char alpha = user_Input.next().charAt(0);

		switch (alpha)
		{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			System.out.println("Character Is Vowel");
			break;

			default:
			System.out.println("Character Is Consonant");
		}
	}
}