//WAP delete element at end of array
import java.util.Scanner;
class delete_array
{
public static void main(String[] args)
{
int lastelement;
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int size=sc.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++)
{
System.out.print("given value for index"+i+":");
arr[i]=sc.nextInt();
}
lastelement=arr[size-1];
System.out.println("after deleting last element="+lastelement);
for(int i=0;i<size-1;i++)
{
System.out.println(arr[i]);
}
}
}