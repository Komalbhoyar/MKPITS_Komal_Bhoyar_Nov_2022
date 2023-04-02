import java.util.Scanner;
class single_array
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of element");
int n=sc.nextInt();
int ar[]=new int[10];
System.out.println("enter the element of array");
for(int i=0;i<n;i++)
{
 ar[i]=sc.nextInt();
}
System.out.println("array element are");
for(int i=0;i<n;i++)
{
System.out.println(ar[i]);
}
}
}


