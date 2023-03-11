class Animal
{
//single inheritance
void Animal()
{
System.out.println("Animal");
}
}
class dog extends Animal
{
void dog()
{
System.out.println("dog");
}
}
class cat extends Animal
{
void cat()
{
System.out.println("cat");
}
}
public class one1
{
public static void main(String[] args)
{
	dog ob=new dog();
	ob.dog();
	cat ob1=new cat();
	ob1.cat();
}
}