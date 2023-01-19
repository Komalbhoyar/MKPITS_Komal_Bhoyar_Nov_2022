class one1
{
int b1=12;
void dis()
{
System.out.println("one call");
two tob=new two();
tob.dis();
}
class two
{
int a;
void dis()
{
System.out.println("two "+b1);
}
}
public class NestedInner()
{
public static void main(String[] args)
{
one1 ob=new one1();
ob.dis();
}
}
}