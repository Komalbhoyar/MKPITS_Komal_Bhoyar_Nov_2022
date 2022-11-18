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
if(choice==1)
{
printf("enter the two no addition");
scanf("%d%d",&a,&b);
result=a+b;
printf("addition=%d",result);
}
else if(choice==2)
{
printf("enter your choice");
scanf("%d%d",&a,&b);
result=a-b;
printf("sub=%d",result);
}
else if(choice==3)
{
printf("enter your choice");
scanf("%d%d",&a,&b);
result=a/b;
printf("div=%d",result);
}
else if(choice==4)
{
printf("enter you choice");
scanf("%d%d",&a,&b);
result=a*b;
printf("multi=%d",result);
}
else
{
printf("invalid choice");
}
getch();
}