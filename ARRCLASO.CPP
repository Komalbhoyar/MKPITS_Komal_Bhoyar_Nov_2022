#include<iostream.h>
#include<conio.h>
class arrDemo
{
public:
int a[5],i;
void setvalue();
void disvalue();
};
void arrDemo::setvalue()
{
cout<<"enter your 5 no";
for(i=0;i<=4;i++)
{
cin>>a[i];
}
}
void arrDemo:: disvalue()
{
for(i=0;i<=4;i++)
{
cout<<a[i];
}
}
void main()
{
arrDemo ob;
clrscr();
ob.setvalue();
ob.disvalue();
getch();
}

