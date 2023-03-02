import java.util.Scanner;

class simple_intrest
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the value of p,n,r");
int p=sc.nextInt();
int n=sc.nextInt();
int r=sc.nextInt();
int si=p*n*r/100;
System.out.println("simple intrest is="+si);
}
}