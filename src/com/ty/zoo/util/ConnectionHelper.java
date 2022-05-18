package com.ty.zoo.util;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	//import static com.ty.visitor.util.AppConstants.*;

	public class ConnectionHelper {
		static String DRIVER="com.mysql.cj.jdbc.Driver";
		static String URL="jdbc:mysql://localhost:3307/jdbc_visitor";
		 static String USER="root";
		 static String PASSWORD="root";
		static Connection connection;
		
		
			
			
			public static Connection getConnection() {
				try {
					Class.forName(DRIVER);
					connection = DriverManager.getConnection(URL,USER,PASSWORD);
					return connection;
				}catch (ClassNotFoundException e) {
					e.printStackTrace();
	             }    catch(SQLException e){
					e.printStackTrace();
				}
				return null;
			}
		}


