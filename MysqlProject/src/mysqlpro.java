import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class mysqlpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdeveloper","root","Vikas123@");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from java_developer");
		while(rs.next())
		{
		System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getString(5));
		}
		}
		catch(Exception e)
		{
		System.out.println(e.toString());
		}

	}

}
