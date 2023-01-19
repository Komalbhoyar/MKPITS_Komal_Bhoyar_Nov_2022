
class thisdemo
{
	int a;
thisdemo(int x)
{
a=x;
}
void dis()
{
System.out.println("a="+a);
}
}
public class one5
{
public static void main(String[] args)
{
thisdemo ob1=new thisdemo(2);
thisdemo ob2=new thisdemo(6);

ob1.dis();
ob2.dis();
}
}