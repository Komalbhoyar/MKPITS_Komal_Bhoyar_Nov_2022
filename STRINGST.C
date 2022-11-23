#include<stdio.h>
#include<string.h>
void main()
{
int name[10];
int len;
clrscr();
printf("enter your name");
scanf("%s",name);
strrev(name);
printf("%s",name);
getch();
}
