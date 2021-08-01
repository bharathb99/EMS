package com.mph.daoimpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import com.mph.model.Employee;
import com.mph.model.Salary;
import com.mph.util.DBConnection;

public class EmployeeDaoImpl implements EmployeeDao{
	Connection con;
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;
	
	
	@Override
	public void createEmployee(Employee emp, Salary sal) {
		
		try {
			con =DBConnection.getDBConnection();
			ps=con.prepareStatement("insert into mphemp(eid,ename,dept,basic,da,hra,pf,gross,salary) values(?,?,?,?,?,?,?,?,?)");
			int eid =emp.getEmpno();
			String ename =emp.getEmpname();
			String dept =emp.getDept();
			int basic=sal.getBasic();
			int da = sal.getDa();
			int hra = sal.getHra();
			int pf = sal.getPf();
			int gross = sal.getGrossSalary();
			int salary = sal.getNetSalary();
			ps.setInt(1,eid);
			ps.setString(2, ename);
			ps.setString(3, dept);
			ps.setInt(4,basic);
			ps.setInt(5,da);
			ps.setInt(6,hra);
			ps.setInt(7,pf);
			ps.setInt(8,gross);
			ps.setInt(9,salary);
			int noofrows=ps.executeUpdate();
			System.out.println(noofrows + " inserted Successfully !!!");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void listEmployee() {
		try {
			con =DBConnection.getDBConnection();
			stmt = con.createStatement();
			rs=stmt.executeQuery("select * from mphemp");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateEmployee(Employee emp) {
	
		
	}

	@Override
	public void deleteEmployee(int empno) {
		
		
	}

	@Override
	public void insertUsingProcedure(Employee emp,Salary sal) {
		con =DBConnection.getDBConnection();
		try {
			con =DBConnection.getDBConnection();
			CallableStatement cs = con.prepareCall("{call insertRecord(?,?,?,?,?,?,?,?,?)}");
			cs.setInt(1, emp.getEmpno());
			cs.setString(2, emp.getEmpname());
			cs.setString(3, emp.getDept());
			cs.setInt(4,sal.getBasic());
			cs.setInt(5,sal.getDa());
			cs.setInt(6,sal.getHra());
			cs.setInt(7,sal.getPf());
			cs.setInt(8,sal.getGrossSalary());
			cs.setInt(9,sal.getNetSalary());
			cs.execute();
			System.out.println("Procedure Job is DONE");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void rsmd() {
		try {
			con = DBConnection.getDBConnection();
			stmt = con.createStatement();//to write an sql query
			rs = stmt.executeQuery("select * from mphemp");//to fetch objects

			ResultSetMetaData md = rs.getMetaData();//to retrieve data
			System.out.println(md.getColumnCount());//to print no. of columns

			while (rs.next()) {
				HashMap<String, Object> row = new HashMap<String, Object>();
				for (int i = 1; i <= md.getColumnCount(); i++)
					row.put(md.getColumnName(i), rs.getObject(i));
					System.out.println(row);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	@Override
	public void type_forward_only_rs() {
		try {
			con = DBConnection.getDBConnection();
			ps =con.prepareStatement("select * from mphemp",ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_UPDATABLE);
			rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString("ename"));
			}
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}

	@Override
	public void type_scroll_insensitive_rs() {
		try {
			con = DBConnection.getDBConnection();
			ps =con.prepareStatement("select * from mphemp",ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString("ename"));
			}
			System.out.println("Move Cursor to the Ist Position");
			rs.first();
			System.out.println(rs.getString("ename"));
			
			
			System.out.println("Move the cursor to the Last position");
			rs.last();
			System.out.println(rs.getString("ename"));
			
			System.out.println("Move the cursor to the previous position");
			rs.previous();
			System.out.println(rs.getString("ename"));
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void type_scroll_sensitive_rs() {
		try {
			con = DBConnection.getDBConnection();
			ps =con.prepareStatement("select eid,ename from mphemp",ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			rs = ps.executeQuery();
			//System.out.println("Before insertion  the RS is ");
			//while(rs.next())
			//{
			//	System.out.println(rs.getInt("eid"));
			//	System.out.println(rs.getString("ename"));
			//}
			
			
			rs.moveToInsertRow();
			rs.updateInt("eid", 15);
			rs.updateString("ename", "Roja");
			rs.insertRow();
			
			System.out.println("After insertion  the RS is ");
			while(rs.next())
			{
				System.out.println(rs.getInt("eid"));
				System.out.println(rs.getString("ename"));
			}
			
			
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		
		
	}


	@Override
	public void type_scroll_sensitive_update_rs() {
		try {
			con = DBConnection.getDBConnection();
			ps =con.prepareStatement("select eid,ename from mphemp where ename='Rathi'",
					ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("eid"));
				System.out.println(rs.getString("ename"));
				rs.updateString("ename", "Rakesh");
				rs.updateRow();
				rs.refreshRow();
				System.out.println(rs.getInt("eid"));
				System.out.println(rs.getString("ename"));
			}
			
			
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
	}

}