import java.util.Scanner;
//WAP to print reverse of n to 1 number
class reverse_no
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter value of n");
int n=sc.nextInt();
for(int i=n;i>=1;i--)
{
System.out.println(i);
}
}
}