import java.util.Scanner;
//WAP to count number of characters in a String
class characters
{
public static void main(String[] args)
{
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a string....");
String st=sc.nextLine();
char ch[]=st.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(ch[i]>=65 && ch[i]<=90 ||ch[i]>=97 && ch[i]<=122||ch[i]>=48&&ch[i]<=57 &&
ch[i]!32 && ch[i]!=',' &&ch[i]!='.')
count++;
}
System.out.println("no of characers="+count);
}
}