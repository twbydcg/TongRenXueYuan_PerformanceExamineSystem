package cn.trxy.servce;

import cn.trxy.bean.AcademicPaperBean;
import cn.trxy.dao.AcademicPaperDao;
import cn.trxy.dao.CategoregradeDao;

public class AcademicPaperService {
	
	//�������
	/**
	 *@param schoolSign ѧУ����
	 *@param authorGrade authorGrade ���ߵȼ�
	 *@param categorySecond ���������еľ���ĳһ���������......
	 *@param job �Ƿ���ְ 
	 * */
	public int calculateScore(String category,String schoolSign,String authorGrade,int categorySecond,int job){
		
		/*1.�ԡ�ͭ��ѧԺ��Ϊ��һ������λ����ͭ��ѧԺ�ڱ�רҵ
		������ԱΪ��һ���ߵİ� 100%�������֡�
		2.�ԡ�ͭ��ѧԺ��Ϊ�ڶ�������λ��������ɹ�(�տ�����
		����)����һ���߰� 60%��ͨѶ���߰� 50%���ڶ����߰� 35%��
		�����֣��Եڶ����߷�����������뱾�˵��о�����һ�£���
		���������֡��ڶ����߷������������ۼƻ��ֲ�����
		120 �֡�
		3.�տ�����ֻ���㡰ͭ��ѧԺ��Ϊ��һ������λ�ĵ�һ��
		�߷�ֵ��*/
		
		//������忯���Ӧ�ķ���
		//category:�����ڿ� authorgrade:ͨѶ���� schoolsign:ͭ��ѧԺ��һ���� categorysecond:3 job:1 score:0
		CategoregradeDao categoregradeDao=new CategoregradeDao();
		int score=categoregradeDao.getByIdCategoregrade(categorySecond).getScore();
		if(schoolSign.equals("ͭ��ѧԺ��һ����") && authorGrade.equals("��һ����")  && job==1 && !category.equals("�տ�") ) {
			score=score*1;
		}else if(schoolSign.equals("ͭ��ѧԺ�ڶ�����") && !category.equals("�տ�") && job==1) {
			if(authorGrade.equals("��һ����")) {
				score=(int) (score*0.6);
			}else if(authorGrade.equals("ͨѶ����")) {
				score=(int) (score*0.5);
			}else {
				score=(int) (score*0.35);
			}
		}else if(schoolSign.equals("ͭ��ѧԺ��һ����") && authorGrade.equals("��һ����") && category.equals("�տ�") && job==1) {
			score=score*1;
		}else{
			score=score*0;
		}
		return score;
	}
	
	//�������
	public boolean addData(AcademicPaperBean a) {
		return new AcademicPaperDao().addData(a);
	}

}
