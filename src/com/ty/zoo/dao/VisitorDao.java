package com.ty.zoo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.person.util.ConnectionHelper;
import com.ty.zoo.dto.Visitor;

public class VisitorDao {
	
	
	public int saveVisitor(Visitor visitor) {
		
		Connection connection = ConnectionHelper.getConnection();
		
		String sql = "INSERT INTO jdbc_zoo.visitor VALUES(?,?,?,?,?,?)";
		
					try {
						PreparedStatement preparedStatement= connection.prepareStatement(sql);
						 preparedStatement.setInt(1,visitor.getId());
		                 preparedStatement.setString(2,visitor.getName());
		                 preparedStatement.setString(3, visitor.getEmail());
		                 preparedStatement.setString(4,visitor.getPhone());
		                 preparedStatement.setString(5, visitor.getGender());
		                 preparedStatement.setInt(6, visitor.getAge());
		                 System.out.println("Data inserted");
		                 return preparedStatement.executeUpdate();
		            
                 } catch(SQLException e) {
				
				e.printStackTrace();
			}
			return 0;
		}
	public static void main(String[] args) {
		VisitorDao visitordao = new VisitorDao();
		visitordao.saveVisitor(new Visitor(2,"asha","ash@gmail.com","959112423","female",23));
	}
	}
  

