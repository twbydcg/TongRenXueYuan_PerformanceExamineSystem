package cn.trxy.servce;

import cn.trxy.bean.AcademicPaperBean;
import cn.trxy.dao.AcademicPaperDao;
import cn.trxy.dao.CategoregradeDao;

public class AcademicPaperService {
	
	//计算分数
	/**
	 *@param schoolSign 学校署名
	 *@param authorGrade authorGrade 作者等级
	 *@param categorySecond 刊物类型中的具体某一个类或者区......
	 *@param job 是否在职 
	 * */
	public int calculateScore(String category,String schoolSign,String authorGrade,int categorySecond,int job){
		
		/*1.以“铜仁学院”为第一署名单位，且铜仁学院在编专业
		技术人员为第一作者的按 100%量化积分。
		2.以“铜仁学院”为第二署名单位的论文类成果(普刊论文
		除外)，第一作者按 60%、通讯作者按 50%、第二作者按 35%量
		化积分；以第二作者发表的论文须与本人的研究方向一致，否
		则不予核算积分。第二作者发表的论文年度累计积分不超过
		120 分。
		3.普刊论文只计算“铜仁学院”为第一署名单位的第一作
		者分值。*/
		
		//查出具体刊物对应的分数
		//category:国内期刊 authorgrade:通讯作者 schoolsign:铜仁学院第一署名 categorysecond:3 job:1 score:0
		CategoregradeDao categoregradeDao=new CategoregradeDao();
		int score=categoregradeDao.getByIdCategoregrade(categorySecond).getScore();
		if(schoolSign.equals("铜仁学院第一署名") && authorGrade.equals("第一作者")  && job==1 && !category.equals("普刊") ) {
			score=score*1;
		}else if(schoolSign.equals("铜仁学院第二署名") && !category.equals("普刊") && job==1) {
			if(authorGrade.equals("第一作者")) {
				score=(int) (score*0.6);
			}else if(authorGrade.equals("通讯作者")) {
				score=(int) (score*0.5);
			}else {
				score=(int) (score*0.35);
			}
		}else if(schoolSign.equals("铜仁学院第一署名") && authorGrade.equals("第一作者") && category.equals("普刊") && job==1) {
			score=score*1;
		}else{
			score=score*0;
		}
		return score;
	}
	
	//添加数据
	public boolean addData(AcademicPaperBean a) {
		return new AcademicPaperDao().addData(a);
	}

}
