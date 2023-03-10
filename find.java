class find
{
public static void main(String[] args)
{
int upr=0,lwr=0,dg=0,sp=0,sc=0;
String s="komalbhoyar@gmail.com";
char c[]=s.toCharArray();
int lang=c.length;
for(int i=0;i<c.length;i++)
{
if(c[i]>='A' && c[i]<='Z')
{
upr++;
}
else if(c[i]>='a' &&  c[i]<='z')
{
lwr++;
}
else if(c[i]>='0' && c[i]<='9')
{
dg++;
}
else if(c[i]==' ')
{
sp++;
}
else
{
sc++;
}

}
System.out.println("uppercase="+upr);
System.out.println("lowercase="+lwr);
System.out.println("digit="+dg);
System.out.println("specialcharater="+sc);
System.out.println("space="+sp);
}
}
