 import java.util.Scanner;
 class rev1
{
public static void main(String[] args)
{

Scanner scanner=new Scanner(System.in);
System.out.println("enter the no of reverse");
int n=scanner.nextInt();
int y=0;

while(n>0)
{

int x=n%10;
y=y*10+x;
n=n/10;

}
System.out.println("number after reversing="+y);
}
}

