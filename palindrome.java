import java.util.Scanner;
class palindrome
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your 5 digit no");
int n=sc.nextInt();
int y=0;
int a=n;

while(n>0)
{
int x=n%10;
y=y*10+x;
n=n/10;
}
if(y==a)
{
System.out.println("it is palindrome"+y);
}
else
{
System.out.println("it is not palindrome"+y);
}
System.out.println("please enter the five digit no");
}
}

