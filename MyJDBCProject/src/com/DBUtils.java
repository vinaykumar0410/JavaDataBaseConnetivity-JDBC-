package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	public static Connection getDBConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(MyDBCredentials.JDBC_MYSQL_LOCALHOST_3306_FLM,MyDBCredentials.ROOT,MyDBCredentials.VINAY_17);
		return connection;
	}
}
