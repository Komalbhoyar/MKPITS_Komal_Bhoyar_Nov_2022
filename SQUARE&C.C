#include<stdio.h>
#include<conio.h>
int main()
{
int a,i;
clrscr();
printf("input number of line:");
scanf("%d",&a);
for(i=1;i<=a;i++)
{
printf("%d%d%d\n",i,i*i,i*i*i);
}
getch();
return 0;
}