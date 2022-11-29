#include<stdio.h>
#include<conio.h>
struct stud
{
int id;
char name[10];
char add[10];
}s1;
void main()
{
clrscr();
printf("enter student id");
scanf("%d",&s1.id);
printf("enter student name");
scanf("%s",&s1.name);
printf("enter student add");
scanf("%s",&s1.add);
printf("st id\n=%d",s1.id);
printf("st name\n=%s",s1.name);
printf("st add=%s\n",s1.add);
getch();
}