package mywork.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import mywork.model.Admin;
import mywork.model.Student;


public class LogOnDao {
	/**
	 * ��¼��֤
	 * @param con
	 * @param student
	 * @return
	 * @throws Exception
	 */
public Student login(Connection con,Student student)throws Exception{
	Student resultStu=null;
	String sql="select * from t_slogon where Sno=? and Spassword=?";
PreparedStatement pstmt=con.prepareStatement(sql);
pstmt.setInt(1,student.getSno());
pstmt.setString(2, student.getSpassword());
ResultSet rs=pstmt.executeQuery();
if(rs.next()){
	resultStu=new Student();
	resultStu.setSno(rs.getInt("Sno"));
	resultStu.setSpassword(rs.getString("Spassword"));
	
}
return resultStu;

	}
public Admin login(Connection con,Admin admin)throws Exception{
	Admin resultAdmin=null;
	String sql="select * from t_adminlogon where adminId=? and password=?";
PreparedStatement pstmt=con.prepareStatement(sql);
pstmt.setInt(1,admin.getAdminId());
pstmt.setString(2,admin.getPassword());
ResultSet rs=pstmt.executeQuery();
if(rs.next()){
	resultAdmin=new Admin();
	resultAdmin.setAdminId(rs.getInt("adminId"));
	resultAdmin.setPassword(rs.getString("password"));
	
}
return resultAdmin;

	}
}
