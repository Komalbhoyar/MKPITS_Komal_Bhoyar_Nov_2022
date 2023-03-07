import java.util.Scanner;
//WAP to find the sum of number in an alpha numeric string
class sumOfDigit
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the alpha numeric string");
String str=sc.nextLine();
char[] ch=str.toCharArray();
int j=0;
for(int i=0;i<ch.length;i++)
{
if(ch[i]>=48 && ch[i]<=57)
{
j+=ch[i]-48;
}
}
System.out.println(j);
}
}