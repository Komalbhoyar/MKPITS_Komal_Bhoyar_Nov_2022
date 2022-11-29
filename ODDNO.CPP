#include<iostream.h>
#include<conio.h>
int main()
{
int arr[5],i,sum=0;
clrscr();
cout<<"enter any 5 no";
for(i=0;i<5;i++)
cin>>arr[i];
cout<<"\n odd number\n";
for(i=0;i<5;i++)
{
if(arr[i]%2!=0)
sum=sum+arr[i];
}
cout<<sum<<" ";
cout;
getch();
return 0;
}