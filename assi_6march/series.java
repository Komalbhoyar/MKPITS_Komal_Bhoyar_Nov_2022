import java.util.Scanner;
//WAP to display sequence of numberin triangle format
class series
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value the row");
int n=sc.nextInt();
int k=0;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
k++;
System.out.print(k+"");
}
System.out.println(" ");
}
}
}