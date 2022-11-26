#include<stdio.h>
#include<conio.h>
#include<math.h>
int main()
{
double a,b,c,pr;
clrscr();
printf("enter three no\n");
scanf("%lf %lf %lf",&a,&b,&c);
pr=(b*b)-(4*a*c);
if(pr>0&&a!=0)
{
pr=sqrt(pr);
printf("root1=%.31f",(-b+pr)/(2*a));
printf("root2=%.31f",(-b-pr)/(2*a));
 }
 else
 {
 printf("impossible to find root\n");
 }
 getch();
 }

