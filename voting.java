import java.util.Scanner;
class voting
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the candidate age");
int age=sc.nextInt();
if(age>=18)
{
System.out.println("Eligible to vote");
}
else
{
System.out.println("not Eligible to vote");
}
}
}