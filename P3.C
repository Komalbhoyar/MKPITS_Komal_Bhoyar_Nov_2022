#include<stdio.h>
#include<conio.h>
void main()
{
int i,j;
clrscr();
for(i=1;i<=4;i++)
{
for(j=1;j<=i;i++)
{
printf("%d",i);
}
printf("\n");
}
getch();
}