package cn.trxy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.trxy.bean.PapertypeBean;
import cn.trxy.inter.BaseInter;
import cn.trxy.utils.DBConnection;

/**
 * ��������
 * */
public class PapertypeDao implements BaseInter {

	//���ݿ����Ӷ���
			private Connection connection=null;
			//�����
			private ResultSet resultSet=null;
			//����״̬
			private PreparedStatement statement;

			@SuppressWarnings("unchecked")
			@Override
			public <T> List<T> getAll() {
				connection=DBConnection.getConnection();
				List<PapertypeBean> list=new ArrayList<PapertypeBean>();
				//��֯SQL���
				String sql="select * from trxypes_papertype";
				try {
					statement=connection.prepareStatement(sql);
					resultSet=statement.executeQuery();
					if(resultSet!=null) {
						while(resultSet.next()) {
							PapertypeBean tem=new PapertypeBean();
							tem.setId(resultSet.getInt(1));
							tem.setName(resultSet.getString(2));
							list.add(tem);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					DBConnection.close(statement, resultSet);
				}
				if(list.size()>0) {
					return (List<T>) list;
				}else {
					return null;
				}
			}

	@Override
	public Object getById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> getAllByObjectAndTableName(Object obj, String tableName) {
		// TODO Auto-generated method stub
		return null;
	}

}
