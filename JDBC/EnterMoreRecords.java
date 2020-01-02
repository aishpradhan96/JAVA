package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

public class EnterMoreRecords {

	public static void main(String[] args) throws SQLException, NumberFormatException, IOException {
		OracleDriver driver = new OracleDriver();
		DriverManager.registerDriver(driver);
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn = DriverManager.getConnection(url,"scott","tiger");
		System.out.println("connected");
		
		for(int flag=0; flag<3;flag++){
		String qry= "insert into employee values(?,?,?)";
		PreparedStatement pst = conn.prepareStatement(qry);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			   System.out.println("Enter code"); 
			   int a = Integer.parseInt(br.readLine()); 
			   System.out.println("Enter name"); 
			   String b = br.readLine();
			   System.out.println("Enter salary"); 
			   double c = Double.parseDouble(br.readLine());
		pst.setInt(1, a);
		pst.setString(2, b);
		pst.setDouble(3,c);
		int rows = pst.executeUpdate();
		System.out.println("inserted "+rows);
		}
		conn.close();
	}
	}
