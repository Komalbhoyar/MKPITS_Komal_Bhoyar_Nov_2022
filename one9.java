class one1
{
one1(int x,int y)
{
System.out.println(x+" "+y);
}
}
class two extends one1
{
two()
{
super(1,2);
}
}

public class one9
{
public static void main(String[] args)
{
two t=new two();
}
}