import java.util.Scanner;
class prac
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the A b & c");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
System.out.println("A="+a);
System.out.println("B="+b);
System.out.println("C="+c);
int n1,n2;
n1=(a+b)*(b+c);
n2=(a+b)*c;
System.out.println("(a+b)*(a+c)="+n1);
System.out.println("(a+b)*c="+n2);
}
}
