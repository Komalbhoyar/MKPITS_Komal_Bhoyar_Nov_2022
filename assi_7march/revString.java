import java.util.Scanner;
//WAP to display reverse of a string
class revString
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the String");
String st=sc.nextLine();
char ch[]=st.toCharArray();
for(int i=0;i<ch.length/2;i++)
{
char t=ch[i];
ch[i]=ch[ch.length-1-i];
ch[ch.length-1-i]=t;
}
st=new String(ch);
System.out.println("reverved string"+st);
}
}