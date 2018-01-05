package mywork.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

    private final String dbUrl1 = "jdbc:mysql://";
    private final String dbUrl2 = ":3306/db_courseSelect?useSSL=true";
    private final String dbUserName = "test";
    private final String dbPassword = "139199";
    private final String jdbcName = "com.mysql.jdbc.Driver";

    /**
     * ��ȡ���ݿ�����
     *
     * @return
     * @throws Exception
     */
    public Connection getCon() throws Exception {
        String dbUrl = dbUrl1 + SettingsUtil.serverIP + dbUrl2;
        Class.forName(jdbcName);
        Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        return con;
    }

    public void closeCon(Connection con) throws Exception {
        if (con != null) {

            con.close();
        }
    }
//public static void main(String[] args) {
//	DbUtil dbUtil=new DbUtil();
//	try {
//		dbUtil.getCon();
//		System.out.println("���ݿ����ӳɹ�!");
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}
}
