class assiQ28_jan25
{
public static void main(String[] args)
{
System.out.println("enter the array");
int a[]={1,0,3,5,0};
int len=a.length;
int count=0;
for(int i=0;i<len;i++)
{
if(a[i]!=0)
{

	a[count++]=a[i];
}
}
while(count < len)
{
	a[count++]=0;



}
}

