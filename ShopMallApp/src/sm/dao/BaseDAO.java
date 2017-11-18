package sm.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDAO {

	public static Connection getCon(){
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:odbc:shop_db");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void closeCon(Connection con){
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
