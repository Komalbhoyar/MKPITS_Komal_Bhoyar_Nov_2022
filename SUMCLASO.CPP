#include<iostream.h>
#include<conio.h>
class addDemo
{
public:
int num1,num2,res;
void setDemo()
{
cout<<"enter num1 & num 2";
cin>>num1>>num2;
}
void calculate()
{
res=num1+num2;
}
void dis()
{
cout<<"res="<<res;
}
};
void main()
{
addDemo ob;
clrscr();
ob.setdata();
ob.calculate();
ob.dis();
getch();
}