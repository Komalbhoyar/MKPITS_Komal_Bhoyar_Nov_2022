class assiQ8_jan25
{
public static void main(String[] args)
{
 int a[]={1,4,5,6,8,9,6};
 int count=0;
 for(int i=0;i<a.length;i++)
 {
  if(a[i]%2==0)
  {
    count++;
  }
 }
 System.out.println(count);
}
}