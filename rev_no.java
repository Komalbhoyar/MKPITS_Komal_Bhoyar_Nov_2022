import java.util.Scanner;
class rev_no
{
public static void main(String[] args)
{
int r;
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
while(n>0)
{
r=n%10;
System.out.println(+r);
n=n/10;
}
}
}