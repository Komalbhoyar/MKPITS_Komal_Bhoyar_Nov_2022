//WAP to display missing element in a given sorted array?
class missingelement
{
public static void main(String[] args)
{
int ar[]={8,15,21,24,30,37};
System.out.println("missing element in given array are");
for(int i=0;i<ar.length-1;i++)
{
for(int j=ar[i]+1;j<ar[i+1];j++)
{
System.out.println(j);
}
}
}
}