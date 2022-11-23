#include<conio.h>
#include<stdio.h>
void main()
{
int  s;
char name1[10],name2[10];
clrscr();
printf("enter your name");
scanf("%s",name1);
strcpy(name2,name1);
strrev(name1);
s=strcmp(name2,name1);
if(s==0)
{
printf("palindrom");
}
else
{
printf("not palindrome");
}
getch();
}

