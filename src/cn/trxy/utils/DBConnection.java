package cn.trxy.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBConnection {
	
	//���ݿ��û���
	private static String user="";
	//���ݿ�����
	private static String password="";
	//���ݿ�����
	private static String driverClass="";
	//�������ӵ�ַ
	private static String url="";
	//���ݿ����Ӷ���
	private static Connection connection=null;
	//�ļ���ȡ
	FileInputStream fileInputStream=null;
	
	
	//���췽��˽�л�
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
			
			//��������
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
	
	//���ص������ݿ����Ӷ��� Connection
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
	
	//�ر�������ݶ���
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

}
