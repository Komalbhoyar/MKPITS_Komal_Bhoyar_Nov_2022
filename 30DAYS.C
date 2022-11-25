#include<stdio.h>
#include<conio.h>
void main()
{
int nday,y,m,d;
clrscr();
printf("enter the number of day \n");
scanf("%d",&nday);
y=nday/365;
m=(nday-(y*365))/30;
d=(nday-y*360-m*30);
printf("year=%d\n",y);
printf("months=%d\n",m);
printf("days=%d\n",d);
getch();
}