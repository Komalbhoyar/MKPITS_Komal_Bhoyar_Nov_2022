// Q6 Musician interface and guitar and drums classes:
//Create an interface called Musician that has two abstract methods:
//playInstrument() and sing(). Then create two classes called Guitarist and
//Drummer that implement the Musician interface. The Guitarist class should
//have an instance variable for the guitar&#39;s brand, and the Drummer class should
//have an instance variable for the drum&#39;s size. Implement the playInstrument()
//and sing() methods for each class.
interface Musician
{
public void playinstrument();
public void sing();
}

  class guitar implements Musician
  {
   @Override
     public void playinstrument()
    {
     System.out.println("Guitarist play guitar");
    }
   @Override
   public void sing()
  {
System.out.println("Guitarist");
}
}
class Drummer implements Musician
{
	@Override
	public void playinstrument()
{
	System.out.println("Drummer play");
}
    @Override
   public void sing()
{
	System.out.println("Drummer sing");
}
}

	public class interface1
{
  public static void main(String[] args)
{
	guitar ob=new guitar();
	ob.playinstrument();
	ob.sing();

	Drummer ob1=new Drummer();
	ob1.playinstrument();
	ob1.sing();
}
}
