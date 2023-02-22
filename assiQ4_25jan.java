class assiQ4_25jan
{
public static void main(String[] args)
{
 int a[]={1,2,3,4};
 int temp;
 temp=a[0];
 a[0]=a[3];
 a[3]=temp;

 for(int i=0;i<a.length;i++)
 {
 System.out.println(" "+a[i]);
 }
}
}