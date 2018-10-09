package cn.trxy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.trxy.bean.UserBean;
import cn.trxy.utils.DBConnection;
import cn.trxy.utils.Sha1;

/**
 * �û�service��
 * */
public class UserDao {
	
	//���ݿ����Ӷ���
	private Connection connection=null;
	//�����
	private ResultSet resultSet=null;
	//����״̬
	private PreparedStatement statement;
	
	/**
	 * �û���½����
	 * @param username �û���
	 * @param password ����
	 * @return ��֤�ɹ������û����� ���ڷ���null
	 * */
	public  UserBean login(String username,String password) {
		///���ص��û�
		UserBean userBean=null;
		connection=DBConnection.getConnection();
		//���ü���������������֤
		String secuityPassword=Sha1.getSha1(password);
		try {
			//��֯SQL���
			String sql="select * from trxypes_user where username=? and password=?";
			statement=connection.prepareStatement(sql);
		
			statement.setString(1, username);
			statement.setString(2, secuityPassword);
			resultSet=statement.executeQuery();
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
	 * �����û�id��ѯ�û�
	 * @param id �û���id id=0
	 * */
	public UserBean findByid(int id) {
		//���ص��û�
		UserBean userBean=null;
		connection=DBConnection.getConnection();
		if(id==0) {
			return null;
		}
		//��֯SQL���
		String sql="select * from trxypes_user where id=?";
		try {
			statement=connection.prepareStatement(sql);
			statement.setInt(1, id);
			resultSet=statement.executeQuery();
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