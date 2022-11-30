#include<iostream.h>
#include<conio.h>
class one
{
public:
static int b;
int a;
static void setdata()
{
a=2;
b++;
}
void display()
{
cout<<b<<endl;
}
};int one::b;
void main()
{
one ob1,ob2,ob3;
ob1.display();
ob2.display();
ob3.display();
ob3.setdata();
ob1.display();
ob2.display();
ob3.display();
getch();
}