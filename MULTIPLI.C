#include<stdio.h>
#include<conio.h>
void main()
{
int x,y;
clrscr();
printf("\n input the first number");
scanf("%d",&x);
printf("\n input the second number");
scanf("%d",&y);
if(x>y)
{
int temp;
temp=x;
x=y;
}
if((y%x)==0)
{
printf("\n its multiplied");
}
else
{
printf("\n its not multipied");
}
getch();
}