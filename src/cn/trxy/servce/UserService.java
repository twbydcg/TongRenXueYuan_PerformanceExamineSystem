package cn.trxy.servce;

import cn.trxy.bean.UserBean;
import cn.trxy.dao.UserDao;
import cn.trxy.utils.Sha1;

/**
 * 用户DAO类
 * */
public class UserService {
	
	public UserBean checkLogin(String account,String password) {
		//调用加密类对密码加密验证
		String secuityPassword=Sha1.getSha1(password);
		UserDao userDao=new UserDao();
		return userDao.login(account, secuityPassword);
	}
	
}
