//check if a string is palindrome in java
import java.util.Scanner;
class string_palindrome
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a string as an input palindrome or not");
String input=sc.nextLine();
if(ispalindrome(input))
{
	System.out.println(input+ "is a palindrome");
}
else
{
System.out.println(input+ "is not palindrome");
}
}
public static boolean ispalindrome(String str)
{
int left=0,right=str.length()-1;
while(left<right)
{
if(str.charAt(left)!=str.charAt(right))
{
return false;
}
left++;
right--;
}
return true;
}
}


