package cn.trxy.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.trxy.bean.AcademyBean;
import cn.trxy.utils.DBConnection;

public class AcademyDao {
	
	private Connection connection=null;
	private ResultSet resultSet=null;
	private Statement statement=null;
	
	/**
	 * 根据id查询学院
	 * @return 传入id所对应的学院
	 * */
	public AcademyBean getByIdAcademy(int id){
		AcademyBean academyBean=new AcademyBean();
		String sql="select * from trxypes_academy where id="+id;
		connection= DBConnection.getConnection();
		try {
			statement=connection.createStatement();
			resultSet=statement.executeQuery(sql);
			resultSet.next();
			academyBean.setId(resultSet.getInt(1));
			academyBean.setAcademyname(resultSet.getString(2));
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBConnection.close(statement, resultSet);
		}
		return academyBean;
	}
	
	/**
	 * 查询所有学院
	 * @return 所有学院
	 * */
	public List<AcademyBean> getAllAcademy(){
		connection= DBConnection.getConnection();
		List<AcademyBean> list=new ArrayList<AcademyBean>();
		try {
			statement=connection.createStatement();
			String sql="select * from trxypes_academy";
			resultSet=statement.executeQuery(sql);
			
			while(resultSet.next()){
				AcademyBean academyBean=new AcademyBean();
				academyBean.setId(resultSet.getInt(1));
				academyBean.setAcademyname(resultSet.getString(2));
				list.add(academyBean);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBConnection.close(statement, resultSet);
		}
		
		return list;
	}

}
