import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded sucessfully");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","Komal@123");
            System.out.println("datadase connected sucessfully");
            Statement st=con.createStatement();
          Scanner sc=new Scanner(System.in);
            System.out.println("enter id");
            int id=sc.nextInt();
            System.out.println("enter u name");
            String uname=sc.next();
            System.out.println("enter userpass");
            String upass=sc.next();

         //   int up=st.executeUpdate("INSERT INTO table_1 VALUES(2,'raja','rani')");
          //  int up1=st.executeUpdate("INSERT INTO table_1 VALUES("+id+",'"+uname+"','"+upass+"')");
           // int r=st.executeUpdate("UPDATE table_1 SET uname='update name1', upass='update upass' WHERS id=2");

            int up2=st.executeUpdate("DELETE FORM table_1 WHERS id=2");
        //    System.out.println(up);




        }catch (Exception e){
            System.out.println(e);
        }
    }
}
