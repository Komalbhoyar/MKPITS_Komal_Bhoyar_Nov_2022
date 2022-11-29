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
struct stud s1;
clrscr();
printf("enter student id");
scanf("%d",&s1.id);
printf("enter student  name");
scanf("%s",&s1.name);
printf("enter student add");
scanf("%s",&s1.add);
printf("s1 id=%d",s1.id);
printf("s1 name=%s",s1.name);
printf ("s1 add=%s",s1.add);
getch();
}