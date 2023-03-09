import java.util.Scanner;
class even_no_print
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of element");
int size=sc.nextInt();
int arr[]=new int[size];
System.out.println("enter the element of the array");
for(int i=0;i<size;i++)
{
	arr[i]=sc.nextInt();
	System.out.println("even number in array ");
}
	for(int i=0;i<size;i++)
	{
		if((arr[i]%2)==0)
		System.out.print(arr[i]+ " ");
	}
}
}





