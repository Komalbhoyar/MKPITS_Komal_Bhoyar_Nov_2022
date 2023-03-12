//calculate average of the numbers
import java.util.Scanner;
class average
{
public static void main(String[] args)
{
float sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int n=sc.nextInt();
float arr[]=new float[n];
System.out.println("enter "+n+"array element");
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	sum=sum+arr[i];
}
float average=sum/n;
System.out.println("average of number is"+average);
}
}