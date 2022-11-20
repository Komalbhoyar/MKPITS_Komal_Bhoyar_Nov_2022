#include<stdio.h>
#include<conio.h>
void main()
{
int num,n1,n2,n3,original,c;
clrscr();
printf("enter 3 digit no");
scanf("%d",&num);
original=num;
n1=num%10;
num=num/10;
n2=num%10;
num=num/10;
n3=num%10;
c=1*n1*n1+n2*n2*n2+n3*n3*n3;
if(original==c)
{
printf("it is Armstrong no");
}
else
{
printf("it is not Armstrong no");
}
getch();
}