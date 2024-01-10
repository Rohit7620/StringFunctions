/*
4) String equals() :
- The Java String class equals() method compares the two given strings based on the content of the string.
- If any character is not matched, it returns false.
- If all characters are matched, it returns true.
- The String equals() method overrides the equals() method of the Object class.
- Syntax : publicboolean equals(Object1 anotherObject2)
- anotherObject : another object, i.e., compared with this string.  
- Result : true if characters of both strings are equal otherwise false.
*/
package StringFunctions;
import java.util.*;
public class Stringequals 
{
	public void equals()
	{
		System.out.println("Implementing String equals() ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First String : ");
		String s1 = sc.nextLine();
		System.out.println("Enter Your Second String : ");
		String s2 = sc.nextLine();
		System.out.println(s1.equals(s2));
	}
		

}
