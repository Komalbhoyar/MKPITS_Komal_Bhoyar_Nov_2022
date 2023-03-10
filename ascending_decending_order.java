import java.util.Scanner;
//ascendig and decending order
class ascending_decending_order
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the two pairs value");
int a=sc.nextInt();
int b=sc.nextInt();
if(a!=b)
{
if(a>b)
{
System.out.println("ascending order");
}
else
{
System.out.println("descending order");
}
}
}
}
