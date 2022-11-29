#include<stdio.h>
#include<conio.h>
int main()
{
int a,b;
clrscr();
printf("enter your two pairs values:\n");
scanf("%d %d",&a,&b);
if(a!=b)
{
if(b>a)
{
printf("assending order\n");
}
else
{
printf("descending order\n");
}
getch();
}
}
