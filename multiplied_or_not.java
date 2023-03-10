import java.util.Scanner;
//multiplied or not
class multiplied_or_not
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int x=sc.nextInt();
int y=sc.nextInt();
if(x>y)
{
int temp;
temp=x;
x=y;
}
if((y%x)==0)
{
System.out.println("its multiplied");
}
else
{
System.out.println("its not multiplied");
}
}
}

