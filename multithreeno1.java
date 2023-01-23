import java.util.Scanner;
class multithreeno1
{
	//19 jan 2023 assignment
	public static void main(String[] args)
	{
		int a,b,c,m;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the first no a");
		a=scanner.nextInt();
		System.out.println("enter the second no b");
		b=scanner.nextInt();
		System.out.println("enter the third no c");
		c=scanner.nextInt();

		m=a*b*c;

		System.out.println("multiplication of three no "+m);
	}
}

