#include<stdio.h>
#include<conio.h>
int main()
{
int x;
clrscr();
printf("\n input an integer");
scanf("%d",&x);
if(x>=0&&x<=20)
{
printf("range[0,20]\n");
}
else if(x>=21&&x<=40)
{
printf("range[25,50]\n");
}
else if(x>=41&&x<=60)
{
printf("range [61,80]\n");
}
else if(x>61&&x<=80)
{
printf("range(61,80]\n");
}
else
{
printf("outside the range\n");
}
getch();
}
