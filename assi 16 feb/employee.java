import java.util.Scanner;
class employee
{
public static void main(String[] args)
{
int id,salary,m,h;
Scanner sc=new Scanner(System.in);
System.out.println("enter your id");
id=sc.nextInt();
System.out.println("total works hours per month");
m=sc.nextInt();
System.out.println("amount of resive per hours");
h=sc.nextInt();
System.out.println("total salary");
salary=m*h;
System.out.println("salary="+salary);
}
}