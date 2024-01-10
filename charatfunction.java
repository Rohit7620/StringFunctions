/*
String Functions :
1. String charAt() : 
- The Java String class charAt() method returns a char value at the given index number.
- The index number starts from 0 and goes to n-1, where n is the length of the string.
- It returns StringIndexOutOfBoundsException, if the given index number is greater than or equal to this string length or a negative number.
- Syntax :  public char charAt(int index)
- The method accepts index as a parameter.
- The starting index is 0. 
- It returns a character at a specific index position in a string.
 
 */
package StringFunctions;
import java.util.*;
public class charatfunction 
{
	public void charat()
	{
		System.out.println("Implement CharAt()");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String");
		String s1=sc.nextLine();
		System.out.println("Enter Your index number");
		int index=sc.nextInt();
		char ch = s1.charAt(index);//returns the char value at the 4th index 
		System.out.println("Character on index"+" "+index+" "+"is"+" "+ch);
	}

}
