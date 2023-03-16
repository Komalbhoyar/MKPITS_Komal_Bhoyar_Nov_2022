class bubble_sort
{
public static void main(String[] args)
{
int temp;
int a[]={8,2,11,4,3};

for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length-i-1;j++)
{
if(a[i]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}