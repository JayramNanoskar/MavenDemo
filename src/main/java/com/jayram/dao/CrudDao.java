package com.jayram.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jayram.model.Student;

public class CrudDao {

	Student student = new Student(); //TRY WITH NULL
	String url = "jdbc:mysql://localhost:3306/javadb";
	String username = "root";
	String password = "root";
	String sql = "select * from student where SID=?";

	public Student getStudent(int id)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setInt(1, id);
				ResultSet rs = pst.executeQuery();
				if(rs.next())
				{
					student.setId(Integer.parseInt(rs.getString("SID")));
					student.setName(rs.getString("SName"));
					student.setPlace(rs.getString("SPlace"));
				}
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			return student;
}

}
