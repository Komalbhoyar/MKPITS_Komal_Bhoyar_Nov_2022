#include<iostream.h>
#include<conio.h>
class one
{
public:
int a,b;
one()
{
cout<<"constructor called";
a=2;
b=3;
}
void dis()
{
cout<<a<<" "<<b<<endl;
}
};
void main()
{
one ob1,ob2;
ob1.dis();
ob2.dis();
getch();
}








