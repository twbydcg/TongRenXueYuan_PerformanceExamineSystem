package cn.trxy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.trxy.bean.AcademicPaperBean;
import cn.trxy.inter.BaseInter;
import cn.trxy.utils.DBConnection;

public class AcademicPaperDao implements BaseInter {
	
		//数据库连接对象
		private Connection connection=null;
		//结果集
		private ResultSet resultSet=null;
		//连接状态
		private PreparedStatement statement;

	@Override
	public <T> List<T> getAll() {
		
		return null;
	}

	@Override
	public Object getById() {
		
		return null;
	}

	@Override
	public <T> List<T> getAllByObjectAndTableName(Object obj, String tableName) {
		connection=DBConnection.getConnection();
		return null;
	}
	
	/**
	 * 添加方法
	 * @param academicPaperBean 对应的Bean对象
	 * @return 是否添加成功 true false
	 * */
	public boolean addData(AcademicPaperBean a) {
		connection=DBConnection.getConnection();
		//添加数据返回的结果
		boolean res=true;
		try {
			//组织SQL语句
			String sql="insert into trxypes_academicPaper values(null,'"+a.getPapertype()+"','"+a.getPapertitle()+"','"+a.getYearlimit()+"'"
					+ ",'"+a.getFirstauthor()+"','"+a.getMessageauthor()+"','"+a.getPublishdate()+"','"+a.getProjectsource()+"','"+a.getNumber()+"','"+a.getSchoolsign()+"'"
							+ ",'"+a.getISSNnumber()+"','"+a.getCnNumber()+"','"+a.getCategory()+"','"+a.getCategorysecond()+"','"+a.getLayout()+"','"+a.getFirstproject()+"',"+a.getScore()+""
									+ ",'"+a.getAuthorgrade()+"',"+a.getAcademyid()+","+a.getOfauthor()+",'"+a.getYourfile()+"',"+a.getStatuss()+",'"+a.getComment()+"')";
			statement=connection.prepareStatement(sql);
			res=statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBConnection.close(statement, resultSet);
		}
		return res;
	}
	
	/**
	 * 根据本人id查询所有的学术论文
	 * @param userId 用户id
	 * @return 返回用户的所有论文集合
	 * */
	public List<AcademicPaperBean> getAll(int userId) {
		connection=DBConnection.getConnection();
		List<AcademicPaperBean> list=new ArrayList<AcademicPaperBean>();
		try {
			String sql="select * from trxypes_academicPaper where ofauthor=?";
			statement=connection.prepareStatement(sql);
			statement.setInt(1, userId);
			resultSet = statement.executeQuery();
			if(resultSet!=null) {
				while(resultSet.next()) {
					//(`id`, `papertype`, `papertitle`, `yearlimit`, `firstauthor`, `messageauthor`, `publishdate`, `projectsource`, `number`, `schoolsign`, 
					//`ISSNnumber`, `cnNumber`, `category`, `categorysecond`, `layout`, `firstproject`, `score`, `authorgrade`, `academyid`, `ofauthor`, `yourfile`, `statuss`, `comment`)
					AcademicPaperBean tem=new AcademicPaperBean();
					tem.setId(resultSet.getInt(1));
					tem.setPapertype(resultSet.getString(2));
					tem.setPapertitle(resultSet.getString(3));
					tem.setYearlimit(resultSet.getString(4));
					tem.setFirstauthor(resultSet.getString(5));
					tem.setMessageauthor(resultSet.getString(6));
					tem.setPublishdate(resultSet.getString(7));
					tem.setProjectsource(resultSet.getString(8));
					tem.setNumber(resultSet.getString(9));
					tem.setSchoolsign(resultSet.getString(10));
					tem.setISSNnumber(resultSet.getString(11));
					tem.setCnNumber(resultSet.getString(12));
					tem.setCategory(resultSet.getString(13));
					tem.setCategorysecond(resultSet.getString(14));
					tem.setLayout(resultSet.getString(15));
					tem.setFirstproject(resultSet.getString(16));
					tem.setScore(resultSet.getInt(17));
					tem.setAuthorgrade(resultSet.getString(18));
					tem.setAcademyid(resultSet.getInt(19));
					tem.setOfauthor(resultSet.getInt(20));
					tem.setYourfile(resultSet.getString(21));
					tem.setStatuss(resultSet.getInt(22));
					tem.setComment(resultSet.getString(23));
					list.add(tem);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBConnection.close(statement, resultSet);
		}
		
		if(list.size()!=0) {
			return list;
		}else {
			return null;
		}
	}
}










