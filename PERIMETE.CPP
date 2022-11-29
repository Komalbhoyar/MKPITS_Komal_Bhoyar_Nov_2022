#include<iostream.h>
#include<conio.h>
void main()
{
float a,b,c,p;
clrscr();
cout<<"enter three floating value";
cin>>a>>b>>c;
if(a+b>c && b+c>a && c+a>b)
{
cout<<"its a triangle";
p=a+b+c;
}
cout<<"\n primeter="<<p;
getch();
}




