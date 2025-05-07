package com.jdbc.cricketer.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.cricketer.utils.ConnectionUtils;
import com.jdbc.cricketer.utils.Cricketer;
import com.jdbc.cricketer.App;

public class Cricketer_Model {
	private Connection con;
	static int con_cnt=2;
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet res;
	private boolean res2;

	public Cricketer_Model() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(ConnectionUtils.url, ConnectionUtils.user, ConnectionUtils.pwd);
		if (con != null) {
			System.out.println("Connection established");
		} else {
			System.out.println("Connection failed");
			App ap = new App();
			if (con_cnt != 0) {
				ap.main(null);
				con_cnt--;
			} else {
				System.exit(0);
			}
		}
	}

	public boolean insertData(Cricketer c) throws Exception {
		System.out.println("Inside insert");
		String sql = "Insert into Cricketer(cname,country,age,matches,runs,wickets,catches,mom,avg) values(?,?,?,?,?,?,?,?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, c.getCname());
		pstmt.setString(2, c.getCountry());
		pstmt.setInt(3, c.getAge());
		pstmt.setInt(4, c.getMatches());
		pstmt.setInt(5, c.getRuns());
		pstmt.setInt(6, c.getWickets());
		pstmt.setInt(7, c.getCatches());
		pstmt.setInt(8, c.getMom());
		pstmt.setDouble(9, c.getAvg());
		int x = pstmt.executeUpdate();
		System.out.println("Executed insert");
		if (x > 0) {
			return true;
		} else
			return false;

	}

	public void fetchAllData() {

		try {
			String query = "select * from cricketer";
			stmt = con.createStatement();
			res = stmt.executeQuery(query);
			while (res.next() == true) {
				System.out.println("Id :" + res.getInt("cid"));
				System.out.println("Name :" + res.getString("cname"));
				System.out.println("Country :" + res.getString("country"));
				System.out.println("Age :" + res.getInt("age"));
				System.out.println("Matches :" + res.getInt("matches"));
				System.out.println("Runs:" + res.getInt("runs"));
				System.out.println("Wickets :" + res.getInt("wickets"));
				System.out.println("Catches:" + res.getInt("catches"));
				System.out.println("Man of the Match:" + res.getInt("mom"));
				System.out.println("Average :" + res.getInt("avg"));
				System.out.println("-------------------------------");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fetchAllDataReverse() {

		try {
			String query = "select * from cricketer";
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			res = stmt.executeQuery(query);
			res.afterLast();
			while (res.previous() == true) {
				System.out.println("Id :" + res.getInt("cid"));
				System.out.println("Name :" + res.getString("cname"));
				System.out.println("Country :" + res.getString("country"));
				System.out.println("Age :" + res.getInt("age"));
				System.out.println("Matches :" + res.getInt("matches"));
				System.out.println("Runs:" + res.getInt("runs"));
				System.out.println("Wickets :" + res.getInt("wickets"));
				System.out.println("Catches:" + res.getInt("catches"));
				System.out.println("Man of the Match:" + res.getInt("mom"));
				System.out.println("Average :" + res.getInt("avg"));
				System.out.println("-------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fetchAllDataById(int id) {
		try {
			String query = "select * from cricketer where cid=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			res2 = pstmt.execute();
			if (res2 == true) {
				res = pstmt.getResultSet();
				while (res.next() == true) {
					System.out.println("Id :" + res.getInt("cid"));
					System.out.println("Name :" + res.getString("cname"));
					System.out.println("Country :" + res.getString("country"));
					System.out.println("Age :" + res.getInt("age"));
					System.out.println("Matches :" + res.getInt("matches"));
					System.out.println("Runs:" + res.getInt("runs"));
					System.out.println("Wickets :" + res.getInt("wickets"));
					System.out.println("Catches:" + res.getInt("catches"));
					System.out.println("Man of the Match:" + res.getInt("mom"));
					System.out.println("Average :" + res.getInt("avg"));
					System.out.println("-------------------------------");
				}
			} else {
				System.out.println("Data not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int updateName(String name1, int id1) {
		try {
			String query = "update cricketer set cname=? where cid=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(2, id1);
			pstmt.setString(1, name1);
			res2 = pstmt.execute();
			if (res2 == false) {
				System.out.println(pstmt.getUpdateCount());
				return pstmt.getUpdateCount();
			} else
				return 0;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;

	}

	public void fetchAllDataByProc() {

		try {
			String query = "{call fetchdata()}";
			CallableStatement call = con.prepareCall(query);
			res2 = call.execute();
			if (res2 == true) {
				res = call.getResultSet();
				while (res.next() == true) {
					System.out.println("Id :" + res.getInt("cid"));
					System.out.println("Name :" + res.getString("cname"));
					System.out.println("Country :" + res.getString("country"));
					System.out.println("Age :" + res.getInt("age"));
					System.out.println("Matches :" + res.getInt("matches"));
					System.out.println("Runs:" + res.getInt("runs"));
					System.out.println("Wickets :" + res.getInt("wickets"));
					System.out.println("Catches:" + res.getInt("catches"));
					System.out.println("Man of the Match:" + res.getInt("mom"));
					System.out.println("Average :" + res.getInt("avg"));
					System.out.println("-------------------------------");
				}
			} else {
				System.out.println("Data not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void fetchAllDataByIdProc(int id2) {

		try {
			String query = "{call fetchbyid(?)}";
			CallableStatement call = con.prepareCall(query);
			call.setInt(1, id2);
			res2 = call.execute();
			if (res2 == true) {
				res = call.getResultSet();
				while (res.next() == true) {
					System.out.println("Id :" + res.getInt("cid"));
					System.out.println("Name :" + res.getString("cname"));
					System.out.println("Country :" + res.getString("country"));
					System.out.println("Age :" + res.getInt("age"));
					System.out.println("Matches :" + res.getInt("matches"));
					System.out.println("Runs:" + res.getInt("runs"));
					System.out.println("Wickets :" + res.getInt("wickets"));
					System.out.println("Catches:" + res.getInt("catches"));
					System.out.println("Man of the Match:" + res.getInt("mom"));
					System.out.println("Average :" + res.getInt("avg"));
					System.out.println("-------------------------------");
				}
			} else {
				System.out.println("Data not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int updateNameByProc(String name3, int id3) {
		try {
			String query = "{call updateName(?,?)}";
			CallableStatement call = con.prepareCall(query);
			call.setInt(1, id3);
			call.setString(2, name3);
			res2 = call.execute();
			if (res2 == false) {
				System.out.println(call.getUpdateCount());
				return call.getUpdateCount();
			} else
				return 0;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int deleteByIdProc(int id4) {
		try {
			String query = "{call deleteById(?)}";
			CallableStatement call = con.prepareCall(query);
			call.setInt(1, id4);
			res2 = call.execute();
			if (res2 == false) {
				System.out.println(call.getUpdateCount());
				return call.getUpdateCount();
			} else
				return 0;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
