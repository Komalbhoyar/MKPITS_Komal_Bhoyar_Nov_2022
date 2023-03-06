import java.util.Scanner;
//WAP to convert decimal to binary
class decimal_binary
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the decimal number");
int n=sc.nextInt();
String bin="";
while(n>0)
{
int r=n%2;
bin=r+bin;
n=n/2;
}
System.out.println("binary equivalent"+bin);
}
}
