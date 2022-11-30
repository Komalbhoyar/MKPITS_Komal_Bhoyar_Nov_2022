#include<iostream.h>
#include<conio.h>
void main()
{
int num,total=0,count=0,average=0;
float avg;
cout<<"enter mathamatical marks 0 to terminal";
cin>>num;
for(i=0;num>0;i++)
{
cin>>num;
if(num>0)
{
total=total+1;
count=count+1;
}
}
avg=total/count;
cout<<"the avg of math="<<avg;
getch();
}
