import java.util.Scanner;
//WAP that except two item weight(floating point valus) and no of purches(in no of purches and
//calculate the average value of item
class average_Q5
{
	public static void main(String[] args)
	{
    double wt1,wt2;
    double average,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("weight of item");
	wt1=sc.nextInt();
	System.out.println("weight of item");
	wt2=sc.nextInt();
	sum=wt1+wt2;
	System.out.println("addition of two no="+sum);
	average=sum/2;
	System.out.println("average of item="+average);
}
}
