package cn.trxy.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Connection;

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
	FileInputStream fileInputStream=null;
	
	
	//构造方法私有化
	@SuppressWarnings("static-access")
	private DBConnection(){
		Properties properties=new Properties();
		try {
			
			fileInputStream=new FileInputStream("db.properties");
			properties.load(fileInputStream);
			this.user=properties.getProperty("jdbc.user");
			this.password=properties.getProperty("jdbc.password");
			this.driverClass=properties.getProperty("jdbc.driverClass");
			this.url=properties.getProperty("jdbc.jdbcUrl");
			
			//加载驱动
			Class.forName(this.driverClass);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(fileInputStream!=null){
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
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

}
