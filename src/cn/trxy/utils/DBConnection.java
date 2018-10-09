package cn.trxy.utils;

//import java.io.IOException;
//import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Properties;

public class DBConnection {
	
	//数据库用户名
	private static String user="";
	//数据库密码
	private static String password="";
	//数据库驱动
	private static String driverClass="";
	//数据连接地址
	private static String url="";
	//数据库链接对象
	private static Connection connection=null;
	//文件读取
	//private InputStream fileInputStream=null;
	
	
	//构造方法私有化
	@SuppressWarnings("static-access")
	private DBConnection(){
		
		// Properties properties=new Properties();
			try {
//				DBConnection.class.getClassLoader().getResourceAsStream("config/db.properties");
//				properties.load(fileInputStream);
//				this.user=properties.getProperty("jdbc.user");
//				this.password=properties.getProperty("jdbc.password");
//				this.driverClass=properties.getProperty("jdbc.driverClass");
//				this.url=properties.getProperty("jdbc.jdbcUrl");
				
				this.user="root";
				this.password="admin";
				this.driverClass="com.mysql.jdbc.Driver";
				this.url="jdbc:mysql://localhost:3306/trxypes?useUnicode=true&characterEncoding=UTF-8";
				
				//加载驱动
				Class.forName(this.driverClass);
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
//				if(fileInputStream!=null){
//					try {
//						fileInputStream.close();
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
			}
	}
	
	//返回单列数据库连接对象 Connection
	public static Connection getConnection(){
		if(connection==null){
			new DBConnection();
			try {
				connection=DriverManager.getConnection(DBConnection.url, DBConnection.user, DBConnection.password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	} 

	
	//关闭相关数据对象
	public static void close(Statement statement ,ResultSet resultSet ) {
		if(statement!=null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(resultSet!=null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


	
	public static  void main(String[] args) {
		new DBConnection();
	}

}
