import java.util.Scanner;
//WAP to check number is armstrong or not
class armstrong{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
int rev=0,sum=0;
int temp=num;
while(num>0){

	rev=num%10;
	sum=sum+(rev*rev*rev);
	num=num/10;
}
if(temp==sum){
System.out.println("armstrong no");
}
else
{
	System.out.println("not armstrong no");
}
}
}
