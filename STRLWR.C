#include<stdio.h>
#include<string.h>
void main()
{
char name[10];
clrscr();
printf("enter your name");
scanf("%s",name);
strlwr(name);
printf("%s",name);
getch();
}
