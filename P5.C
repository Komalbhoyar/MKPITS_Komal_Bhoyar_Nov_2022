#include<stdio.h>
#include<conio.h>
void main()
{
char i,j;
clrscr();
for(i=1;i<=5;i++)
{
for(j=65;j<=65+i;j++)
{
printf("%c",j);
}
printf("\n");
}
getch();
}