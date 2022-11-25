#include<stdio.h>
#include<conio.h>
int rev()
{
int num,n1,n2,n3,rev;
clrscr();
printf("enter three digit no");
scanf("%d",&num);
n1=num%10;
num=num/10;
n2=num%10;
num=num/10;
n3=num%10;
rev=n1*100+n2*10+n3*1;
return rev;
}
void main()
{
int r;
r=rev();
printf("%d",r);
getch();
}






