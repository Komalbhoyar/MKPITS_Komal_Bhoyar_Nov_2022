import java.util.Scanner;
//WAP to display multiplication tables?
class tables
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=10;j++)
{
System.out.print(j+ "*" +i+ "=" +j*i+ " \n");
}
}
System.out.println();
}
}