class one1
{
void dis()
{
System.out.println("one class");
}
}
class two extends one1
{
void dis()
{
super.dis();
System.out.println("two class");
}
}
public class one8
{
public static void main(String[] args)
{
two ob=new two();
ob.dis();
}
}