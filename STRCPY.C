#include<stdio.h>
#include<string.h>
void main()
{
char name1[10],name2[10];
clrscr();
printf("enter your name");
scanf("%s",name1);
strcpy(name2,name1);
printf("%s",name2);
getch();
}