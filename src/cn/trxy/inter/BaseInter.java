package cn.trxy.inter;

import java.util.List;

public interface BaseInter {
	
	public <T> List<T> getAll();//��ѯ����
	public Object getById();//ͨ��id��ѯ
	
	public <T> List<T> getAllByObjectAndTableName(Object obj,String tableName);

}
