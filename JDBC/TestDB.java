package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import oracle.jdbc.OracleDriver;

public class TestDB {

	public static void main(String[] args) throws SQLException {
		OracleDriver driver = new OracleDriver();
		DriverManager.registerDriver(driver);
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn = DriverManager.getConnection(url,"scott","tiger");
		System.out.println("connected");
		/*Statement st=conn.createStatement();
		String qry= "insert into employee values(123,'abcde',5000)";
		st.executeUpdate(qry);*/
		String qry= "insert into employee values(?,?,?)";
		PreparedStatement pst = conn.prepareStatement(qry);
		pst.setInt(1, 129);
		pst.setString(2, "aff");
		pst.setDouble(3,6000);
		int rows = pst.executeUpdate();
		System.out.println("inserted "+rows);
		conn.close();
		

	}

}
