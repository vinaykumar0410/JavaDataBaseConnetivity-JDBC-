package com;

import java.sql.*;

public class MyJDBCTest {
	public static void main(String[] args) throws SQLException{
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flm","root","Vinay@17");
		System.out.println("Connection succesful..");
		Statement statement = connection.createStatement();
		String CreateTable = "create table player (id int,name varchar(25), age int);";
//		statement.execute(CreateTable);
//		System.out.println("CreateTable Done..");
		String InsertValues = "insert into player values (201,'virat',28),(202,'kohli',35),(203,'abd',32),(204,'siraz',29);";
//		statement.executeUpdate(InsertValues);
//		System.out.println("InsertValues Done..");
		String AddNewColumn = "alter table player add column city varchar(25);";
//		statement.executeUpdate(AddNewColumn);
//		System.out.println("AddNewColumn Done..");
		String ChangeColumnName = "alter table vinay rename column city to city_name;";
//		statement.execute(ChangeColumnName);
//		System.out.println("ChangeColumnName Done..");
		String ChangeTableName = "rename table player to players;";
//		statement.execute(ChangeTableName);
//		System.out.println("ChangeTableName Done..");
		String ChangeValuesUsingUpdate = "update players set city_name = 'vizag' where id in (201,202);";
//		statement.executeUpdate(ChangeValuesUsingUpdate);
//		System.out.println("ChangeValuesUsingUpdate Done..");
		String ChangeValuesUsingUpdate2 = "update players set city_name = 'kadapa' where city_name is null;";
//		statement.executeUpdate(ChangeValuesUsingUpdate2);
//		System.out.println("ChangeValuesUsingUpdate2 Done..");
		String DeleteRow = "delete from players where id = 204;";
//		statement.executeUpdate(DeleteRow);
//		System.out.println("Row deleted...");
		String DropColumn = "alter table players drop column city_name;";
//		statement.executeUpdate(DropColumn);
//		System.out.println("Column deleted...");
		ResultSet rs = statement.executeQuery("select * from players;");
//		while(rs.next()) {
////			System.out.println(rs.getString("id") +" "+ rs.getString(2) +" "+ rs.getString(3));
//			System.out.println(rs.getString(1) +" "+ rs.getString(2) +" "+ rs.getString(3));
//			// here getString(1) 1 means 1st column
//		}
		ResultSetMetaData md = rs.getMetaData();
		System.out.println(md.getColumnCount());
		PreparedStatement ps = connection.prepareStatement("select * from players where id=?");
		ps.setInt(1,1);
		ResultSet ans = ps.executeQuery();
		while(rs.next()) {
		// System.out.println(rs.getString("id") +" "+ rs.getString(2) +" "+ rs.getString(3));
		System.out.println(rs.getString(1) +" "+ rs.getString(2) +" "+ rs.getString(3));
		// here getString(1) 1 means 1st column
	}
	}
}
