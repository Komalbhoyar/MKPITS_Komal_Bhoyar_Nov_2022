import java.util.Scanner;
//WAP to find sum of prime number
class sum_of_prime
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the range to print sum of prime no");
int range=sc.nextInt();
int sum=0;
for(int i=1;i<=range;i++)
{
if(isprime(i))
sum=sum+i;
}
System.out.println(sum);
}
public static boolean isprime(int num)
{
	if(num==1) return false;
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			return false;
		}
	}
	return true;
}
}
