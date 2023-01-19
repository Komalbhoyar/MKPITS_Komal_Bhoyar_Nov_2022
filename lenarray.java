class arraydemo
{
void fun()
{
int a[]=new int[8];
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}
public class lenarray
{
public static void main(String[] args)
{
arraydemo ob=new arraydemo();
ob.fun();
}
}