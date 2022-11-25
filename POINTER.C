#include<stdio.h>
#include<conio.h>
void main()
{
int *p1,a=2;
clrscr();
p1=&a;
printf("%u\n",a);
printf("%u\n",&a);
printf("%u\n",*&a);
printf("%u\n",p1);
printf("%u\n",&p1);
printf("%u\n",*p1);
getch();
}