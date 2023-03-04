import java.util.Scanner;
// WAP to check given number is even or odd
class even_odd
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the num");
int n=sc.nextInt();
if(n%2==0)
System.out.println("is even"+n);
else
System.out.println("is odd"+n);
}
}