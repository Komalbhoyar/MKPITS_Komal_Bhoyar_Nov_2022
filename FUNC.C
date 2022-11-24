#include<stdio.h>
#include<conio.h>
void add()
{
int num1,num2,result;
clrscr();
printf("enter the two no");
scanf("%d%d",&num1,&num2);
result=num1+num2;
printf("addition no=%d",result);
}
void sub()
{
int num1,num2,result;
printf("enter your two");
scanf("%d%d",&num1,&num2);
result=num1-num2;
printf("sub no=%d",result);
}
void multi()
{
int num1,num2,result;
printf("enter your two no");
scanf("%d%d",&num1,&num2);
result=num1*num2;
printf("multi no=%d",result);
}
void divi()
{
int num1,num2,result;
printf("enter your two no");
scanf("%d%d",&num1,&num2);
result=num1/num2;
printf("divi no=%d",result);
}
void main()
{
add();
sub();
multi();
divi();
getch();
}
