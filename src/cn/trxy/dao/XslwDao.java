package cn.trxy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.trxy.bean.XslwBean;
import cn.trxy.utils.DBConnection;

public class XslwDao {
	
	//数据库连接对象
	private Connection connection=null;
	//结果集
	private ResultSet result=null;
	//连接状态
	private PreparedStatement statement;
	
	/**
	 * 添加方法
	 * */
	public boolean add(XslwBean obj) {
		connection=DBConnection.getConnection();
		//添加数据返回的结果
		boolean res=true;
		try {
			
			String sql="insert into trxypes_xslw values(null,'"+obj.getCgsbnx()+"','"+obj.getLwlx()+"','"+obj.getLwtm()+"','"+obj.getDyzz()+"','"+obj.getSmdwcd()+"','"+obj.getTxzz()+"','"+obj.getSyzz()+"','"+obj.getBrsmcd()+"'"
					+ ",'"+obj.getFbsj()+"','"+obj.getFbkw()+"','"+obj.getKwlx()+"','"+obj.getXkml()+"','"+obj.getYjxk()+"','"+obj.getXmly()+"','"+obj.getQh()+"','"+obj.getBm()+"',"
							+ "'"+obj.getIssnh()+"',"+obj.getCnh()+","+obj.getYsjf()+","+obj.getSdjf()+","
							+ "'"+obj.getShzt()+"',"+obj.getSsxy()+",'"+obj.getUserid()+"','"+obj.getFj()+"','"+obj.getBz()+"')";
			
			statement=connection.prepareStatement(sql);
			res=statement.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBConnection.close(statement, result);
		}
		
		return !res;
		
	}
	
	/**
	 * 根据用户id 查找用户的所有论文
	 * @return 
	 * */
	public List<XslwBean> findByUserId(int userId) {
		connection=DBConnection.getConnection();
		List<XslwBean> list=new ArrayList<XslwBean>();
		try {
			String sql="select * from trxypes_xslw where userid=?";
			statement=connection.prepareStatement(sql);
			statement.setInt(1, userId);
			result = statement.executeQuery();
			if(result!=null) {
				while(result.next()) {
					XslwBean tem=new XslwBean();
					tem.setId(result.getInt(1));tem.setCgsbnx(result.getString(2));tem.setLwlx(result.getString(3));tem.setLwtm(result.getString(4));tem.setDyzz(result.getString(5));tem.setSmdwcd(result.getString(6));
					tem.setTxzz(result.getString(7));tem.setSyzz(result.getString(8));tem.setBrsmcd(result.getString(9));tem.setFbsj(result.getDate(10)+"");tem.setFbkw(result.getString(11));tem.setKwlx(result.getString(12));
					tem.setXkml(result.getString(13));tem.setYjxk(result.getString(14));tem.setXmly(result.getString(15));tem.setQh(result.getString(16));tem.setBm(result.getString(17));tem.setIssnh(result.getString(18));
					tem.setCnh(result.getString(19));tem.setYsjf(result.getInt(20));tem.setSdjf(result.getInt(21));
					tem.setShzt(result.getInt(22));tem.setSsxy(result.getInt(23));tem.setUserid(result.getInt(24));tem.setFj(result.getString(25));tem.setBz(result.getString(26));
					list.add(tem);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBConnection.close(statement, result);
		}
		
		if(list.size()!=0) {
			return list;
		}else {
			return null;
		}
	}
	
	/**
	 * 根据管理员所属学院id 查找所有文章
	 * 
	 * */
	public List<XslwBean> findByAcademicId(int academicId) {
		connection=DBConnection.getConnection();
		List<XslwBean> list=new ArrayList<XslwBean>();
		try {
			String sql="select * from trxypes_xslw where ssxy=?";
			statement=connection.prepareStatement(sql);
			statement.setInt(1, academicId);
			result = statement.executeQuery();
			if(result!=null) {
				while(result.next()) {
					XslwBean tem=new XslwBean();
					tem.setId(result.getInt(1));tem.setCgsbnx(result.getString(2));tem.setLwlx(result.getString(3));tem.setLwtm(result.getString(4));tem.setDyzz(result.getString(5));tem.setSmdwcd(result.getString(6));
					tem.setTxzz(result.getString(7));tem.setSyzz(result.getString(8));tem.setBrsmcd(result.getString(9));tem.setFbsj(result.getDate(10)+"");tem.setFbkw(result.getString(11));tem.setKwlx(result.getString(12));
					tem.setXkml(result.getString(13));tem.setYjxk(result.getString(14));tem.setXmly(result.getString(15));tem.setQh(result.getString(16));tem.setBm(result.getString(17));tem.setIssnh(result.getString(18));
					tem.setCnh(result.getString(19));tem.setYsjf(result.getInt(20));tem.setSdjf(result.getInt(21));
					tem.setShzt(result.getInt(22));tem.setSsxy(result.getInt(23));tem.setUserid(result.getInt(24));tem.setFj(result.getString(25));tem.setBz(result.getString(26));
					list.add(tem);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBConnection.close(statement, result);
		}
		
		if(list.size()!=0) {
			return list;
		}else {
			return null;
		}
	}
	
	/**
	 * 修改状态 根据论文id
	 * */
	public void updateStatu(int statu,int id) {
		connection=DBConnection.getConnection();
		try {
			String sql="UPDATE trxypes_xslw SET shzt=? WHERE id=?";
			System.out.println(sql);
			statement=connection.prepareStatement(sql);
			statement.setInt(1, statu);
			statement.setInt(2, id);
			statement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBConnection.close(statement, result);
		}
	}
	
}
