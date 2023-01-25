public class buffer
{
public static void main(String[] args)
{
StringBuffer sb=new StringBuffer("komal");
System.out.println(sb);

//reverse
sb.reverse();
System.out.println(sb);


//append a charactor

sb.append("$");
System.out.println(sb);

//append char array
char ch[]={'k','o','m','i'};
sb.append(ch);
System.out.println(sb);

//inserting char at specifing location
sb.insert(3,'k');
System.out.println(sb);

//delete
sb.delete(2,5);
System.out.println(sb);
}
}