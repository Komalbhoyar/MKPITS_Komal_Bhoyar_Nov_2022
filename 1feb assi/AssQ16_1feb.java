import java.util.Scanner;
//WAP to read temperature in centigrade and display a suitable message according to temerature state below
//temp<0 thenfreezing weather
//temo 0-10 then very cold weather
//temp 10-20 then normal in temp
//temp 30-40 then its hot
//temp>=40 then its very hot

class AssQ16_1feb
{
public static void main(String[] args)
 {
 int temp;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the temperature");
 temp=sc.nextInt();
 if(temp<0)
  {
   System.out.println("Freezing weather");
  }
   else if(temp>0 && temp<10)
     {
        System.out.println("very cold weather");
     }
       else if(temp>10 && temp<20)
        {
           System.out.println("cold weather");
        }
          else if(temp>20 && temp<30)
           {
              System.out.println("normal weather");
           }
             else if(temp>30 && temp<40)
              {
                 System.out.println("its hot");
              }
                else if(temp>40)
                 {
                    System.out.println("very hot");
                 }

          }
       }