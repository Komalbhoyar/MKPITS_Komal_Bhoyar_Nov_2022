class Shape
{
//multilevel inheritance
int a;
void set1()
{
a=12;
}
void dis1()
{
System.out.println(a);
}
}
class rectangle extends Shape
{
int b;
void set2()
{
	b=13;
}
void dis2()
{
System.out.println("b");
}
}
class circle extends rectangle
{
int c;
void set3()
{
c=14;
}
void dis3()
{
System.out.println("c");
}
}
public class one2
{
public static void main(String[] args)
{
	circle ob=new circle();
	ob.set1();
	ob.set2();
	ob.set3();
	ob.dis1();
	ob.dis2();
	ob.dis3();
}
}