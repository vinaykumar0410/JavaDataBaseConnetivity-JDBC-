package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws SQLException {
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/apple","root","password");
		
		Statement statement = connection.createStatement();
		
//		String createTable = "create table student(id int,name varchar(25),age int)";
//		statement.execute(createTable);
		
//		String insertValues = "insert into student values (1,'vinay',22),(2,'sai',21),(3,'ram',18),(4,'virat',32),(5,'sunny',28)";
//		statement.execute(insertValues);
		
//		String addColumn = "alter table student add column city varchar(25)";
//		statement.execute(addColumn);
		
//		String updateColumn = "update student set city='vizag' where id not in (1,2,4) ";
//		statement.execute(updateColumn);
		
//		String changeColumnName1 = "alter table student rename column id to sid"; 
//		statement.execute(changeColumnName1);
		
//		String changeColumnName2 = "alter table student change column name sname varchar(50)"; 
//		statement.execute(changeColumnName2);
		
//		String changeColumnName3 = "alter table student modify column city varchar(50)"; 
//		statement.execute(changeColumnName3);
		
//		String dropColumn = "alter table student drop column age";
//		statement.execute(dropColumn);
		
//		String deleteRow = "delete from student where sid = 4";
//		statement.execute(deleteRow);
		
//		String truncateTable = "truncate table student";
//		statement.execute(truncateTable);
		
//		String dropTable = "drop table student";
//		statement.execute(dropTable);
		
//		ResultSet rs = statement.executeQuery("select * from student");
//		while(rs.next()) {
//			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
//		}
		
//		ResultSetMetaData rsmd = rs.getMetaData();
//		System.out.println(rsmd.getColumnCount());
//		System.out.println(rsmd.getColumnName(2));
//		System.out.println(rsmd.getColumnLabel(3));
		
		PreparedStatement ps = connection.prepareStatement("select * from student where  id in (?,?)");
		ps.setInt(1,4);
		ps.setInt(2,2);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		
	}
}
