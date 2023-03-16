import java.util.Scanner;
class binary{
public static void main(String[] args){
int a[]={2,8,12,16,18,24,26,30,31};
Scanner sc=new Scanner(System.in);
System.out.println("entre the serach no");
int ser=sc.nextInt();
int beg=0;
int end=a.length-1;
int mid=beg+end/2;
for(int i=0;i<a.length;i++)
{
mid=beg+end/2;
if(ser==a[mid])
{
System.out.println("it is found");
break;
}
else if(ser<a[mid])
{
end=mid-1;
}
else if(ser>a[mid])
{
beg=mid+1;
}
System.out.println("not found");
}
}
}



