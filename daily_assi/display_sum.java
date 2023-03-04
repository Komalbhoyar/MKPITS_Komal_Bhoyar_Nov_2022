import java.util.Scanner;
//WAP to display sum of 1to n number
class display_sum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter value of n");
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
sum+=i;
}
System.out.println(sum);
}
}

