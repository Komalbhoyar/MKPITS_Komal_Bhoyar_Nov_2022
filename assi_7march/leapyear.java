import java.util.Scanner;
//WAP to find the given year is leap-year or not
class leapyear
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the year");
int m=sc.nextInt();
if(m%4==0&&m%100!=0||m%400==0)
System.out.println("it is a leap year");
else
System.out.println("not a leap year");
}
}