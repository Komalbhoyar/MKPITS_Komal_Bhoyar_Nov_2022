import java.util.Scanner;

//WAP calculate the distance two points
class calculate_distance
{
	public static void main(String[] args)
	{
		int x1,x2,y1,y2;
		double dis;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of point x1");
		 x1=sc.nextInt();
		System.out.println("enter value of point y2");
		 y1=sc.nextInt();
		System.out.println("enter value of point x1");
		 x2=sc.nextInt();
		System.out.println("enter value of point y2");
		 y2=sc.nextInt();

		 dis=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("calculate the distance two point="+dis);
	}
}
