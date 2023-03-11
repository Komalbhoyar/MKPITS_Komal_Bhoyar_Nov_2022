//Shape interface and circle and rectangle classes:
//Create an interface called Shape that has two abstract methods: getArea() and
//getPerimeter(). Then create two classes called Circle and Rectangle that
//implement the Shape interface. The Circle class should have an instance variable
//for the radius of the circle, and the Rectangle class should have instance
//variables for the width and height of the rectangle. Implement the getArea()
//and getPerimeter() methods for each class.

interface Shape
{
 public void getarea(int a);
 public void getPerimeter(int a);

public void getarea(int a,int b);
public void getPerimeter(int a,int b);
}
 class circle implements Shape
{
	int r;
 @Override
 public void getarea(int a)
{
	r=a;
  System.out.println("circle area="+3.14*r*r);
}
 @Override
  public void getPerimeter(int a)
{
	r=a;
   System.out.println("circle perimeter="+2*3.14*r);
}
@Override
public void getarea(int a,int b){}

@Override
public void getPerimeter(int a,int b){}
}
 class rectangle implements Shape
{
	int l,bd;
 @Override
  public void getarea(int a,int b)
{
	l=a;
	bd=b;
   System.out.println("rectangle area="+(l*bd));
}
 @Override
  public void getPerimeter(int a,int b)
{
	l=a;
	bd=b;
   System.out.println("rectangle perimeter="+(2*l+2*bd));
}
@Override
 public void getarea(int a){}

 @Override
 public void getPerimeter(int a){}

}
 public class interface2
{
  public static void main(String[] args)
{
   circle ob=new circle();
   ob.getarea(3);
   ob.getPerimeter(3);

   rectangle ob1=new rectangle();
   ob1.getarea(5,4);
   ob1.getPerimeter(6,7);
}
}