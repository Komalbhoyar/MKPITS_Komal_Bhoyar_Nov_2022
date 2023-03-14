//java program to delete array element
import java.util.Scanner;
class delete_array
{
public static void main(String[] args)
{
int size,loc;
Scanner sc=new Scanner(System.in);
System.out.print("enter array size");
size=sc.nextInt();
int a[]=new int[size];
System.out.print("enter array element");
for(int i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
System.out.print("enter array location");
loc=sc.nextInt();
for(int i=loc;i<size-1;i++)
{
	a[i]=a[i+1];
}
size--;
for(int i=0;i<size;i++)
{
	System.out.print(a[i]+" ");
}
}
}