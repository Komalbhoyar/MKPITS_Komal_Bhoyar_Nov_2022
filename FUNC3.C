#include<stdio.h>
#include<conio.h>
int add(int x ,int y)
{
int c;
c=x+y;
return c;
}
void main()
{
int a=3,b=2,r;
r=add(a,b);
printf("return=%d",r);
getch();
}
