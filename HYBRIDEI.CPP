#include<iostream.h>
#include<conio.h>
class stud
{
public:
int id;
char name[5];
char add[50];
void set1()
{
cout<<"enter the id";
cin>>id;
cout<<"enter the name";
cin>>name;
cout<<"enter the add";
cin>>add;
}
void dis()
{
cout<<id<<endl;
cout<<name<<endl;
cout<<add<<endl;
}
};
class exam:public stud
{
public:
int pr1,pr2;
void set2()
{
pr1=30;
pr2=25;
}
void dis2()
{


stud ob;
ob.set();
ob.dis();
getch();
}