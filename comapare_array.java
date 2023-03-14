//compare two array in java
class comapare_array
{
public static void main(String[] args)
{
int a[]={2,4,6,8,10};
int b[]={2,4,6,8};
if(equals(a,b))
System.out.println("same array");
else
System.out.println("different array");
}
public static boolean equals(int[]a,int[]b)
{
if(a.length!=b.length)
return false;

for(int i=0;i<a.length;i++)
{
if(a[i]!=b[i])
return false;
}
return true;
}
}