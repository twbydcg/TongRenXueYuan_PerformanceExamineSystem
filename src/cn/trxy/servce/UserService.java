package cn.trxy.servce;

import cn.trxy.bean.UserBean;
import cn.trxy.dao.UserDao;
import cn.trxy.utils.Sha1;

/**
 * �û�DAO��
 * */
public class UserService {
	
	public UserBean checkLogin(String account,String password) {
		//���ü���������������֤
		String secuityPassword=Sha1.getSha1(password);
		UserDao userDao=new UserDao();
		return userDao.login(account, secuityPassword);
	}
	
}
