package cn.trxy.inter;

import java.util.List;

public interface BaseInter {
	
	public <T> List<T> getAll();//查询所有
	public Object getById();//通过id查询
	
	public <T> List<T> getAllByObjectAndTableName(Object obj,String tableName);

}
