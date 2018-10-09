package cn.trxy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.trxy.bean.UserBean;
import cn.trxy.utils.DBConnection;

/**
 * 用户service类
 * */
public class UserDao {
	
	//数据库连接对象
	private Connection connection=null;
	//结果集
	private ResultSet resultSet=null;
	//连接状态
	private PreparedStatement statement;
	
	/**
	 * 用户登陆方法
	 * @param username 用户名
	 * @param password 密码
	 * @return 验证成功返回用户对象 否在返回null
	 * */
	public  UserBean login(String account,String password) {
		///返回的用户
		UserBean userBean=null;
		connection=DBConnection.getConnection();
		try {
			//组织SQL语句
			String sql="select * from trxypes_user where account=? and password=?";
			statement=connection.prepareStatement(sql);
			statement.setString(1, account);
			statement.setString(2, password);
			resultSet=statement.executeQuery();
			if(resultSet!=null) {
				while(resultSet.next()) {
					userBean=new UserBean();
					userBean.setId(resultSet.getInt(1));
					userBean.setAccount(resultSet.getString(2));
					userBean.setUsername(resultSet.getString(3));
					userBean.setPassword(resultSet.getString(4));
					userBean.setAge(resultSet.getInt(5));
					userBean.setSex(resultSet.getInt(6));
					userBean.setBirthday(resultSet.getDate(7));
					userBean.setJob(resultSet.getInt(8));
					userBean.setPhone(resultSet.getString(9));
					userBean.setDirection(resultSet.getString(10));
					userBean.setAcademyid(resultSet.getInt(11));
					userBean.setBack(resultSet.getString(12));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBConnection.close(statement, resultSet);
		}
		if(userBean==null) {
			return null;
		}else {
			return userBean;
		}
	}
	
	/**
	 * 根据用户id查询用户
	 * @param id 用户的id id=0
	 * */
	public UserBean findByid(int id) {
		//返回的用户
		UserBean userBean=null;
		connection=DBConnection.getConnection();
		if(id==0) {
			return null;
		}
		//组织SQL语句
		String sql="select * from trxypes_user where id=?";
		try {
			statement=connection.prepareStatement(sql);
			statement.setInt(1, id);
			resultSet=statement.executeQuery();
			if(resultSet!=null) {
				while(resultSet.next()) {
					userBean=new UserBean();
					userBean.setId(resultSet.getInt(1));
					userBean.setAccount(resultSet.getString(2));
					userBean.setUsername(resultSet.getString(3));
					userBean.setPassword(resultSet.getString(4));
					userBean.setAge(resultSet.getInt(5));
					userBean.setSex(resultSet.getInt(6));
					userBean.setBirthday(resultSet.getDate(7));
					userBean.setJob(resultSet.getInt(8));
					userBean.setPhone(resultSet.getString(9));
					userBean.setDirection(resultSet.getString(10));
					userBean.setAcademyid(resultSet.getInt(11));
					userBean.setBack(resultSet.getString(12));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBConnection.close(statement, resultSet);
		}
		if(userBean==null) {
			return null;
		}else {
			return userBean;
		}
	}
	
}
