//WAP the smallest number in array
class smallest_number_array
{
public static void main(String[] args)
{
System.out.println("enter the array");
int arr[]={1,2,3,4,5,6,7};
int min=arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]<min)
min=arr[i];
System.out.println("the smallest element="+min);
}
}
}

