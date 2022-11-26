#include<stdio.h>
#include<conio.h>
void main()
{
char eid[10];
int hours;
double amount,salary;
clrscr();
printf("enter employee id:\n");
scanf("%s",&eid);
printf("enter working hours:\n");
scanf("%d",&hours);
printf("enter salary amount per hr:\n");
scanf("%d",amount);
salary=amount*hours;
printf("employee id=%d\n salary=rs%.21f\n",eid,salary);
getch();
}