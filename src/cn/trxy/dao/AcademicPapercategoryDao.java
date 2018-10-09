package cn.trxy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.trxy.bean.AcademicPapercategoryBean;
import cn.trxy.utils.DBConnection;

/**
 * ѧ�����Ŀ�������
 * */
public class AcademicPapercategoryDao {
	
			//���ݿ����Ӷ���
			private Connection connection=null;
			//�����
			private ResultSet resultSet=null;
			//����״̬
			private PreparedStatement statement;
			
			/**
			 * ��ѯ���п������
			 * @return List<AcademicPapercategoryBean>����
			 * */
			public List<AcademicPapercategoryBean> getAllAcademicPapercategory(){
				connection=DBConnection.getConnection();
				List<AcademicPapercategoryBean> list=new ArrayList<AcademicPapercategoryBean>();
				String sql="select * from trxypes_academicPapercategory";
				try {
					statement=connection.prepareStatement(sql);
					resultSet=statement.executeQuery();
					if(resultSet!=null) {
						while(resultSet.next()) {
							AcademicPapercategoryBean tem=new AcademicPapercategoryBean();
							tem.setId(resultSet.getInt(1));
							tem.setCategoryname(resultSet.getString(2));
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
