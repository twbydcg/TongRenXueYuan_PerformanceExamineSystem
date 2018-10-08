package cn.trxy.utils;

/**
 * ��֤����
 * ����/trxypes/SecurityCode
 * */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SecurityCode extends HttpServlet {

	private static final long serialVersionUID = 1L;

	
	public SecurityCode() {
		super();
	}

	
	public void destroy() {
		super.destroy(); 
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //������֤�뷽��
		
		// ��Ӧͷ��Ϣ
        response.setHeader("Pragma", "No-Cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expries", 0);
        
        //������֤������
        String code_str="q0we1r2ty3ui5op4lk6jh7gf8dsazx9cvbnm";
        //��֤���λ��
        int size=5;
        //��֤��
        String code="";
        
        //������֤��
        for(int i=0;i<size;i++) {
        	//���������
        	int n=(int) Math.ceil(Math.random()*(code_str.length()-1));
        	code+=code_str.charAt(n);
        }
        
        //������֤���session
        request.getSession().setAttribute("code", code);
        
        /**
         * ��֤��ͼƬ����
         * */
        //����ͼƬ�Ŀ��
        int width=20*(size);
        int height=30;
        BufferedImage bufferedImage=new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
        //��ȡͼƬ��������
        Graphics graphics=bufferedImage.getGraphics();
        //����ͼƬ�ı�����ɫ
        graphics.setColor(Color.WHITE);
        //���ñ����ķ�Χ
        graphics.fillRect(0, 0, width, height);
        //�趨ͼƬ�߿�
        graphics.setColor(Color.DARK_GRAY);
        graphics.drawRect(0, 0, width - 1, height - 1);
        //��������
        for(int i=0;i<10;i++) {
        	graphics.setColor(getColor());
        	graphics.drawLine((int)Math.random()*width, (int)Math.random()*height, (int)Math.random()*width, (int)Math.random()*height);
        }
        //������֤���������ɫ
        graphics.setColor(getColor());
        Font font=new Font("���Ŀ���", Font.CENTER_BASELINE, 25);
        graphics.setFont(font);
        graphics.drawString(code, 20, 20);
        //ͼ����Ч
        graphics.dispose();
        
        //�����ҳ��
        ImageIO.write(bufferedImage, "JPEG", response.getOutputStream());
	}
	
	//������ɫ����
    private Color getColor() {
    	int red=(int)Math.ceil(Math.random()*255);
    	int blue=(int)Math.ceil(Math.random()*255);
    	int green=(int)Math.ceil(Math.random()*255);
    	Color color=new Color(red, green, blue);
    	return color;
    }

	
	public void init() throws ServletException {
		
	}

}
