#include<stdio.h>
#include<string.h>
void main()
{
int name[10];
int len;
clrscr();
printf("enter your name");
scanf("%s",name);
len=strlen(name);
printf("%d",len);
getch();
}
