import java.util.Scanner;
//WAP weather the number is perfect number or not
class perfectno
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int num=sc.nextInt();
int sum=1;
for(int i=2;i<=num/2;i++)
{
if(num%i==0)
sum=sum+i;
}
if(sum==num)
{
System.out.println("is a perfect number"+num);
}
else
System.out.println("is not perfect number"+num);
}
}

