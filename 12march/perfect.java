import java.util.Scanner;
class perfect
{
public static void main(String[] args)
{
int sum=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<n;i++)
{
if(n%i==0)
{
sum=sum+i;
}
}
if(n==sum)
{
System.out.print("perfect number");
}
else
{
System.out.print("not perfect");
}
}
}