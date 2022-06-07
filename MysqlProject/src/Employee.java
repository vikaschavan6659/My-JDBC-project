import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {
	
	public void insert() 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_project","root","Vikas123@");Statement St=con.createStatement();)
		{
			String query = "insert into employ values(4,'raju',2019,'infosys')";
			int count = St.executeUpdate(query);
			if(count==0) 
			{
				System.out.println("Not Inserted");
			} 
			else 
			{
				System.out.println("Inserted");
			}
		}
		catch(SQLException Se) 
		{
			System.out.println(Se.getMessage());
			Se.printStackTrace();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	public void Select() 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_project","root","Vikas123@");Statement St=con.createStatement();)
		{
			String query = "select * from employ";
			ResultSet rs=St.executeQuery(query);
			
			while(rs.next()) 
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
		}
		catch(SQLException Se) 
		{
			System.out.println(Se.getMessage());
			Se.printStackTrace();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	
	public void update() 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_project","root","Vikas123@");Statement St=con.createStatement();)
		{
			String query = "update employ set E_name='sunjay' where ID=5 ";
			int count = St.executeUpdate(query);
			if(count==0) 
			{
				System.out.println("Not Updated");
			} 
			else 
			{
				System.out.println("Updated");
			}
		}
		catch(SQLException Se) 
		{
			System.out.println(Se.getMessage());
			Se.printStackTrace();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	public void delete() 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1jdev","root","Vikas123@");Statement St=con.createStatement();)
		{
			String query = "delete from employ where id=4";
			int count = St.executeUpdate(query);
			if(count==0) 
			{
				System.out.println("Not Deleted");
			} 
			else 
			{
				System.out.println("Deleted");
			}
		}
		catch(SQLException Se) 
		{
			System.out.println(Se.getMessage());
			Se.printStackTrace();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) 
	{
		Employee E= new Employee();
		System.out.println("**Employ Details**");
		System.out.println("**please enter numbers between(1-4) for the CRUD operation you required ;) **");
		System.out.println("**Enter corresponding number(1.Create/Insert, 2.Read/Select OR, 3.Update, 4.Delete)**");
		Scanner s=new Scanner(System.in);
		int Opp=s.nextInt();
		switch(Opp) 
		{
		case 1:
			E.insert();
			break;
		case 2:
			E.Select();
			break;
		case 3:
			E.update();
			break;
		case 4:
			E.delete();
			break;
		default:
			System.out.println("**Inalid Input please Enter numbers (1-4)**");
		}
		s.close();
		
	}

}