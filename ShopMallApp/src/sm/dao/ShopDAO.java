package sm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import sm.bean.Shop;

public class ShopDAO extends BaseDAO {
	public static boolean insertShop(Shop s1){
		boolean res = false;
		Connection con = null;
		try {		
			con = getCon();
			String sql = "insert into shop (shop_name, floor,category, shop_no) values (?, ?,?, ?); ";
			PreparedStatement stmt = con.prepareStatement(sql);
			int i=1;
			stmt.setString(i++, s1.getName());
			stmt.setString(i++, s1.getFloor());
			stmt.setString(i++, s1.getCategory());
			stmt.setInt(i++, s1.getShopNo());
			int n = stmt.executeUpdate();
			res=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			closeCon(con);
		}
		return res;
	}
	public static boolean updateShop(Shop s1){
		boolean res = false;
		Connection con = null;
		try {		
			con = getCon();
			String sql = "update shop set  floor = ?,category = ?, shop_no = ? where shop_name = ?;";
			PreparedStatement stmt = con.prepareStatement(sql);
			int i=1;
			stmt.setString(i++, s1.getFloor());
			stmt.setString(i++, s1.getCategory());
			stmt.setInt(i++, s1.getShopNo());
			
			stmt.setString(i++, s1.getName());
			int n = stmt.executeUpdate();
			res=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			closeCon(con);
		}
		return res;
	}

	public static boolean deleteShop(String name){
		boolean res = false;
		Connection con = null;
		try {		
			con = getCon();
			String sql = "delete from shop where shop_name = ?; ";
			PreparedStatement stmt = con.prepareStatement(sql);
			int i=1;
			stmt.setString(i++, name);
			int n = stmt.executeUpdate();
			res=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			closeCon(con);
		}
		return res;
	}
	
	public static LinkedList<Shop> searchShop(String name){
		LinkedList<Shop> res = new LinkedList<Shop>();
		Connection con = null;
		try {		
			con = getCon();
			String sql = "select * from shop where shop_name like ? ; ";
			PreparedStatement stmt = con.prepareStatement(sql);
			int i=1;
			stmt.setString(i++, "%"+name+"%");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
				Shop s1 = new Shop();
				s1.setName(rs.getString("shop_name"));
				s1.setId(rs.getString("id"));
				s1.setFloor(rs.getString("floor"));
				s1.setShopNo(rs.getInt("shop_no"));
				s1.setCategory(rs.getString("category"));
				res.add(s1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			closeCon(con);
		}
		return res;
	}
	
	public static Shop findShop(String name){
		Shop res = null;
		Connection con = null;
		try {		
			con = getCon();
			String sql = "select * from shop where shop_name = ? ; ";
			PreparedStatement stmt = con.prepareStatement(sql);
			int i=1;
			stmt.setString(i++, name);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
				Shop s1 = new Shop();
				s1.setName(rs.getString("shop_name"));
				s1.setId(rs.getString("id"));
				s1.setFloor(rs.getString("floor"));
				s1.setShopNo(rs.getInt("shop_no"));
				s1.setCategory(rs.getString("category"));
				res = s1;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			closeCon(con);
		}
		return res;
	}

	
}
