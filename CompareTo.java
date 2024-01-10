/*
2) Java String compareTo() : 
- The Java String class compareTo() method compares the given string with the current string.
- It returns a positive number, negative number, or 0.
- It compares strings on the basis of the Unicode value of each character in the strings.
- If the first string is lexicographically greater than the second string, 
- it returns a positive number (difference of character value).
- If the first string is less than the second string lexicographically, it returns a negative number.
- if the first string is lexicographically equal to the second string, it returns 0.
- if s1 > s2, it returns positive number  
- if s1 < s2, it returns negative number  
- if s1 == s2, it returns 0  
- Syntax : public int compareTo(String1 anotherString2)
- The method accepts a parameter of type String that is to be compared with the current string.
- It returns an integer value. It throws the following two exceptions:
- 1. ClassCastException: If this object cannot get compared with the specified object.
- 2. NullPointerException: If the specified object is null.    
*/

package StringFunctions;
import java.util.*;
public class CompareTo 
{
	public void compare()
	{
		System.out.println("Implement CompareTo()");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First String : ");
		String s1 = sc.nextLine();//Accept first string from user
		System.out.println("Enter Your Second String : ");
		String s2 = sc.nextLine();//Accept Second string from user
		System.out.println(s1.compareTo(s2));

		
	}

}
