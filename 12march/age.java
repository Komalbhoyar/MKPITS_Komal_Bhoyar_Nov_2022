import java.util.Scanner;
class age
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
if((age<15)||(age>60))
{
System.out.println("not allowed");
}
else
{
System.out.println("Allowed");
}
}
}