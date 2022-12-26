#include<stdio.h>
#include<conio.h>
void main()
{
int i,n[5];
clrscr();
printf("enter the element of array");
for(i=0;i<5;i++)
{
scanf("%d",&n[i]);
}
for(i=0;i<5;i++)
{
if(n[i]<5)
{
printf("\n%u is address of %d",&n[i],n[i]);
}
}
getch();
}