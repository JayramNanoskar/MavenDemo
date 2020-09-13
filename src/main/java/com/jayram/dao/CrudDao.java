package com.jayram.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jayram.model.Student;

public class CrudDao {

	Student student = new Student(); // TRY WITH NULL
	String url = "jdbc:mysql://localhost:3306/javadb";
	String username = "root";
	String password = "root";
	String selectsql = "select * from student where SID=?";
	String insertsql = "insert into student(SID, SName, SPlace) values(?, ?, ?)";

	public Student getStudent(int id)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pst = con.prepareStatement(selectsql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				student.setId(Integer.parseInt(rs.getString("SID")));
				student.setName(rs.getString("SName"));
				student.setPlace(rs.getString("SPlace"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}

	public boolean addStudent(int id, String name, String place)
	{
		boolean hasInsert = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pst = con.prepareStatement(insertsql);
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, place);
			hasInsert = pst.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hasInsert;
	}

}
