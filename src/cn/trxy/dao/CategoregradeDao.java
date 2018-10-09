package cn.trxy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.trxy.bean.CategoregradeBean;
import cn.trxy.utils.DBConnection;

/**
 * ѧ�����Ŀ����������
 * */
public class CategoregradeDao {
	
	//���ݿ����Ӷ���
	private Connection connection=null;
	//�����
	private ResultSet resultSet=null;
	//����״̬
	private PreparedStatement statement;
	
	/**
	 * ���ݿ�������id��ѯ���Ｖ��
	 * @param categoryid �������id
	 * @return ���ض�Ӧ�������ļ��𼯺�
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
	
}