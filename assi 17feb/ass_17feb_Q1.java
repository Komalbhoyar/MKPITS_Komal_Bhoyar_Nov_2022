import java.util.Scanner;
class ass_17feb_Q1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the sec");
int hr=sc.nextInt();
System.out.println("enter the min");
int min=sc.nextInt();
System.out.println("enter the hr");
int sec=sc.nextInt();
 hr=sec/60;
 min=sec%60;
 sec=min/60;
 sec=sec%60;
System.out.println("enter your sec="+sec);
System.out.println("enter your min="+min);
System.out.println("enter your hr="+hr);
}
}