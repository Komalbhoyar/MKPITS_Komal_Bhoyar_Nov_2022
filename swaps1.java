import java.util.Scanner;
class swaps1
{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("enter first number");
int a=scanner.nextInt();
System.out.println("enter second number");
int b=scanner.nextInt();

System.out.println("a="+a);
System.out.println("b="+b);

a=a+b;
b=a-b;
a=a-b;

System.out.println("a="+a);
System.out.println("b="+b);
}
}
