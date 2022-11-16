#include<stdio.h>
#include<conio.h>
void main()
{
int num1,num2,swp;
clrscr();
printf("enter the two no");
scanf("%d%d",&num1,&num2);
printf("the before swping\n num1=%d num2=%d",num1,num2);
swp=num2;
num2=num1;
num1=swp;
printf("\nthe after swping \n num1=%d num2=%d",num1,num2);
getch();
}
