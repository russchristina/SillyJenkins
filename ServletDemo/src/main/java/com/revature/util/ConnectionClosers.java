package com.revature.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * This is an optional utility that allows me to abstract out my exception handling
 * for my JDBC resources.
 */
public class ConnectionClosers {

	public static void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Statement stmt) {
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet set) {
		try {
			set.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
