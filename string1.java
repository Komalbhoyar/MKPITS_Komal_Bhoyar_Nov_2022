class string1
{
public static void main(String[] args)
{
	//array

char data[]={'a','b','c'};
String sob=new String(data);
System.out.println(sob);

//length
int len=sob.length();
System.out.println(len);

String ob1="komal";
String ob2=new String();
ob2=ob1;
System.out.println(ob2);

//concat
String ob3="BHOYAR";
System.out.println(ob1.concat(ob3));

//compare
System.out.println(ob1.compareTo(ob3));


}
}
