// contructor overloading in java
class A
{
int a;double b; String c;
A()
{
a=100;b=24.32;c="komal";
}
A(int x)
{
a=x;
}
A(double y,String z)
{
b=y;c=z;
}
}
class B
{
public static void main(String[] args)
{
A ob=new A();
A ob1=new A(10);
A ob2=new A(24.32,"komal");
System.out.println(ob.a+" "+ob.b+" "+ob.c);
System.out.println(ob1.a);
System.out.println(ob2.b+" "+ob2.c);
}
}
