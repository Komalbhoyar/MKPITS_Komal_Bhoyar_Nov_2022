class sq
{
int i,sum=0;
void set()
{
for(i=1;i<=30;i++)
{
	sum=i*i;
System.out.println(sum);
}
}
}
class Square
{
public static void main(String[] args)
{
sq ob1=new sq();
ob1.set();
}
}