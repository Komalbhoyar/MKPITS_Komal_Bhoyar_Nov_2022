class Exception_handler_with_multi_method
{
public static void main(String[] args)
{
System.out.println("start program");
int a=2;
int c=0;
int b[]={1,2,3,4};
try{
	c=a/0;
for(int i=0;i<=b.length;i++)
{
	System.out.println(b[i]);
}
}

catch(Exception e)
{
System.out.println();
System.out.println("Exception Generated"+e);
System.out.println();
System.out.println("e.getMessage()");
e.printStackTrace();
System.out.println();
}
System.out.println("end program");
}
}


