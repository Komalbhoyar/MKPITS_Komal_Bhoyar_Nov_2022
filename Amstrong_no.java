import java.util.Scanner;

class Amstrong_no
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
int original=sc.nextInt();

n1=num%10;
num=num/10;
n2=num%10;
num=num/10;
n3=num%10;

int c=1*n1*n1+n2*n2*n2+n3*n3*n3;

if(original==c)
{
System.out.println("amstrong no");
}
else
{
System.out.println("it is no amstrong no");
}
}
}

