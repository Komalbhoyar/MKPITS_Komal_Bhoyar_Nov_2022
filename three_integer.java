import java.util.Scanner;
class three_integer
{
//find the greatest among three integer
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number a");
int a=sc.nextInt();
System.out.println("enter the number b");
int b=sc.nextInt();
System.out.println("enter the number c");
int c=sc.nextInt();
if(a>b && a>c)
{
	System.out.println("a is greatest number");
}
else if(b>a && b>c)
{
	System.out.println("b is greatest number");
}
else if(c>a && c>b)
{
	System.out.println("c is greatest number");
}
}
}

