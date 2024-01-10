/*
3) Java String concat :
- The Java String class concat() method combines specified string at the end of this string.
- It returns a combined string. It is like appending another string.
- Syntax : public String concat(String1 anotherString2) 
- anotherString : another string i.e., to be combined at the end of this string.
*/
package StringFunctions;
import java.util.*;
public class StringConcat 
{
	public void concat()
	{
		System.out.println("Implementing concat function");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First String ");
		String s1 = sc.nextLine();// 1 string accept from user
		System.out.println("Enter Your Second String ");
		String s2 = sc.nextLine();// 2 string accept from user
		System.out.println(s1.concat(s2));
		
	}

}
