import java.util.Scanner;
class bike_Q8
{
public static void main(String[] args)
{
	int distance;
	float spendfuel,average;
	Scanner sc=new Scanner(System.in);
	System.out.println("the total distance");
	distance=sc.nextInt();
	System.out.println("the total spendfuel");
	spendfuel=sc.nextInt();
	average=distance/spendfuel;
	System.out.println("the total average="+average);
}
}
