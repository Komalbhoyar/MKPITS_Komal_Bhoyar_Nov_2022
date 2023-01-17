class Tri
{
int i,sum=0;
void set()
{
for(i=1;i<=30;i++)
{
sum=sum+i;
System.out.println(sum);
}
}
}
class triangle
{
public static void main(String[] args)
{
Tri ob1=new Tri();
ob1.set();
}
}