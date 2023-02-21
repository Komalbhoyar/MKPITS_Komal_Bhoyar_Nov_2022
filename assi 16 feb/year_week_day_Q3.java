import java.util.Scanner;

class year_week_day_Q3
{
public static void main(String[] args)
{
int m,year,week,day;
Scanner sc=new Scanner(System.in);
m=sc.nextInt();
System.out.println("Enter the value");
year=m/365;
System.out.println("no of year="+year);
week=m/7;
m=m%7;
System.out.println("no of week="+week);
day=m;
System.out.println("no of day="+day);
}
}
