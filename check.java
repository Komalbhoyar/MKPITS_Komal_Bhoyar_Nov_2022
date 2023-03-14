//interface method in java abstract
interface client
{
void webdesign();
void webdevelop();
}
 abstract class Rajtech implements client
{
@Override
public void webdesign()
{
System.out.println("green,top menu,three dot button");
}
}
class rahultech extends Rajtech
{
@Override
public void webdevelop()
{
System.out.println("html,css,javascript");
}
}
class check
{
public static void main(String[] args)
{
rahultech ob=new rahultech();
ob.webdesign();
ob.webdevelop();
}
}