#include<stdio.h>
#include<conio.h>
void add()
{
int a,b,result;
clrscr();
printf("enter the two no addition");
scanf("%d%d",&a,&b);
result=a+b;
printf("addition=%d",result);
}
void sub()
{
int a,b,result;
printf("enter your substration");
scanf("%d%d",&a,&b);
result=a-b;
printf("sub=%d",result);
}
void div()
{
int a,b,result;
printf("enter your division");
scanf("%d%d",&a,&b);
result=a/b;
printf("div=%d",result);
}
void multi()
{
int a,b,result;
printf("enter you multiplication");
scanf("%d%d",&a,&b);
result=a*b;
printf("multi=%d",result);
}
void main()
{
int choice;
clrscr();
printf(" pres 1 for addition");
printf("\n pres 2 for substraction");
printf("\n pres 3 for divide");
printf("\n pres 4 for multiplication");
printf("enter your choice");
scanf("%d",&choice);
switch(choice)
{
case 1:
add();
break;
case 2:
sub();
break;
case 3:
div();
break;
case 4:
multi();
break;
default:
printf("invalid choice");
}
getch();
}