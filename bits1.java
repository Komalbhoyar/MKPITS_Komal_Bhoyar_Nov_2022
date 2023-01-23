import java.util.Scanner;
class bits1
{
//18th jan2023(Q2)

public static void main(String[] args)
{

Scanner scanner=new Scanner(System.in);
System.out.println("enter the number");
int x=scanner.nextInt();

System.out.println("number before 2 bit shifting left");
System.out.println("x="+x);

x=x<<2;    //for left shifting
// x=x>>2    //for right shifting

System.out.println("number after shifting 2 bit to left");
System.out.println("x="+x);
}
}


