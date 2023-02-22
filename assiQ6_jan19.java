import java.util.Scanner;
class assiQ6_jan19
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int num=sc.nextInt();
System.out.println("your enterd number is:"+num);
int y=51,diff;
diff=num-y;
if(diff==0)
{
diff=-diff;
System.out.println("Absolute diff="+diff);
}
else if(num>51)
{
diff=diff*3;
System.out.println("Absolute diff="+diff);
}
else
System.out.println("Absolute diff="+diff);
}
}