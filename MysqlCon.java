import java.sql.*;  
class MysqlCon
{  
    public static void main(String args[])
{  
try
{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");  

  //System.out.println(con);
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("show databases");  
while(rs.next())  
System.out.println(rs.getString(1)); 
con.close();  
}
catch(Exception e){ System.out.println(e);}  
}  
}