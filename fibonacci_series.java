 import java.util.Scanner;
 class fibonacci_series
{
public static void main(String[] args)
{
int a=0,b=1,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the fibonacci series");
int n=sc.nextInt();
for(int i=2;i<n;i++)
{

	System.out.print(a+" ");
sum=a+b;
a=b;
b=sum;
}
}
}


