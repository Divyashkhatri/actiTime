package SQLframeSampleProject;

import java.awt.PopupMenu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class MainFrame 
{
	public static void main(String[] args) throws InterruptedException 
	{
				JFrame mainframe =new JFrame("Student Information");
				
				mainframe.setSize(1000, 600);
//				JTextField Name=new JTextField();
//				Name.setSize(100,30);
//				Name.setLocation(100, 60);
//				mainframe.add(new PopupMenu("Alert"));
//				JLabel Name1=new JLabel("Name");
//				Name1.setSize(100,20);
//				Name1.setLocation(50, 30);
//				
//				JButton submit=new JButton("submit");
//				submit.setSize(0,30);
//				
//				mainframe.add(Name1);
//				Thread.sleep(2000);
//				mainframe.add(Name);
//				mainframe.add(submit);
				mainframe.setVisible(true);
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//oracle.jdbc.driver.OracleDriver
			//com.mysql.jdbc.Driver
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:xe","scott","tiger"); 
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from emp");  
			while(rs.next())
			{ 
				JLabel Name2=new JLabel(rs.getInt(1)+" "+rs.getString(2));
				mainframe.add(Name2);
				Thread.sleep(2000);	
				Name2.setVisible(false);
			
			} 
			con.close();  
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}