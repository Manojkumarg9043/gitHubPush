package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import java.sql.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.SignUpPOJO;

@Controller
public class HomePageController {
	
	@RequestMapping("index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("SignUp")
	public String SignUp() {
		return "SignUp";
	}
	
	@RequestMapping("login")
	public String Login() {
		return "login";
	}
	
	@RequestMapping("storeDetails")
	@ResponseBody
	public String StoreDetails(SignUpPOJO user) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/Librar";
		String name = "root";
		String pass = "1234";
		
		String Quary = "insert into Singup(name,gmail,mobile,password) value(?,?,?,?);";
		
		Connection cm = DriverManager.getConnection(url,name,pass);
		PreparedStatement ps = cm.prepareStatement(Quary);
		ps.setString(1, user.getUsername());
		ps.setString(2, user.getGmail());
		ps.setString(3, user.getMobile());
		ps.setString(4, user.getPassword());
		int row = ps.executeUpdate();
		
		return "added";
	}
	
	@RequestMapping("LoginPage")
	public String LoginPage(SignUpPOJO user) throws SQLException {
		String url="jdbc:mysql://localhost:3306/Librar";
		String name = "root";
		String pass = "1234";
		
		String Quary = "select * from Singup where name=? and password=?";
		Connection cm = DriverManager.getConnection(url,name,pass);
		PreparedStatement ps = cm.prepareStatement(Quary);
		ps.setString(1, user.getUsername());
		ps.setString(2, user.getPassword());
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			return "added";
		}
		
		return "wrong";
	}
}
