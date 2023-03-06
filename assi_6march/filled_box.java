import java.util.Scanner;
//WAP to dispaly the filled box with stars
class filled_box
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter value of n");
int n=sc.nextInt();
for(int i=1;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}