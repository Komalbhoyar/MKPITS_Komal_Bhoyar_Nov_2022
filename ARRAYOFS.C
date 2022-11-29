#include<stdio.h>
#include<conio.h>
struct stud
{
int id;
char name[10];
char add[10];
};
void main()
{
int i;
struct stud s[4];
clrscr();
for(i=0;i<=4;i++)
{
printf("enter student %d rec",i);
printf("enter your id");
scanf("%d",&s[i].id);
printf("enter your name");
scanf("%s",&s[i].name);
printf("enter your add");
scanf("%s",&s[i].add);
printf("\n id=%d",s[i].id);
printf("\n name=%s",s[i].name);
printf("\n add=%s",s[i].add);
}
getch();
}