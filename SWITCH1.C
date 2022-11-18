#include<stdio.h>
#include<conio.h>
void main()
{
int choice,a,b,result;
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
printf("enter the two no addition");
scanf("%d%d",&a,&b);
result=a+b;
printf("addition=%d",result);
switch(choice)

case 2:
printf("enter your substration");
scanf("%d%d",&a,&b);
result=a-b;
printf("sub=%d",result);
switch(choice)
case 3:
printf("enter your division");
scanf("%d%d",&a,&b);
result=a/b;
printf("div=%d",result);
switch(choice)
case 4:
printf("enter you multiplication");
scanf("%d%d",&a,&b);
result=a*b;
printf("multi=%d",result);
break;
default:
printf("invalid choice");
}
getch();
}