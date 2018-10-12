package cn.trxy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.trxy.bean.CategoregradeBean;
import cn.trxy.utils.DBConnection;

/**
 * 学术论文刊物具体分类表
 * */
public class CategoregradeDao {
	
	//数据库连接对象
	private Connection connection=null;
	//结果集
	private ResultSet resultSet=null;
	//连接状态
	private PreparedStatement statement;
	
	/**
	 * 根据刊物类别的id查询刊物级别
	 * @param categoryid 刊物类别id
	 * @return 返回对应刊物类别的级别集合
	 * */
	public List<CategoregradeBean> getAllCategoregrade(int categoryid){
		connection=DBConnection.getConnection();
		List<CategoregradeBean> list=new ArrayList<CategoregradeBean>();
		String sql="select * from trxypes_categoregrade where categoryid=?";
		try {
			statement=connection.prepareStatement(sql);
			statement.setInt(1, categoryid);
			resultSet=statement.executeQuery();
			if(resultSet!=null) {
				while(resultSet.next()) {
					CategoregradeBean tem=new CategoregradeBean();
					tem.setId(resultSet.getInt(1));
					tem.setTypename(resultSet.getString(2));
					tem.setScore(resultSet.getInt(3));
					tem.setCategoryid(resultSet.getInt(4));
					list.add(tem);
				}
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			DBConnection.close(statement, resultSet);
		}
		
		if(list.size()>0) {
			return list;
		}else {
			return null;
		}
		
	}
	
	/**
	 * 根据id刊物具体类别
	 * @return 传入id所对应的刊物具体类别
	 * */
	public CategoregradeBean getByIdCategoregrade(int id){
		CategoregradeBean categoregradeBean=new CategoregradeBean();
		String sql="select * from trxypes_categoregrade where id="+id;
		connection= DBConnection.getConnection();
		try {
			statement=connection.prepareStatement(sql);
			resultSet=statement.executeQuery(sql);
			resultSet.next();
			categoregradeBean.setId(resultSet.getInt(1));
			categoregradeBean.setTypename(resultSet.getString(2));
			categoregradeBean.setScore(resultSet.getInt(3));
			categoregradeBean.setCategoryid(resultSet.getInt(4));
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBConnection.close(statement, resultSet);
		}
		return categoregradeBean;
	}
	
}
