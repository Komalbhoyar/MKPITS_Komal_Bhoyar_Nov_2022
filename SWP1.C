#include<stdio.h>
#include<conio.h>
void main()
{
int a,b;
clrscr();
printf("enter the no");
scanf("%d%d",&a,&b);
a=a+b;
b=a-b;
a=a-b;
printf("a=%d b=%d",a,b);
getch();
}