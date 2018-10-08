package cn.trxy.utils;

/**
 * 验证码类
 * 请求：/trxypes/SecurityCode
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

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //生成验证码方法
		
		// 响应头信息
        response.setHeader("Pragma", "No-Cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expries", 0);
        
        //定义验证码的组成
        String code_str="q0we1r2ty3ui5op4lk6jh7gf8dsazx9cvbnm";
        //验证码的位数
        int size=5;
        //验证码
        String code="";
        
        //产生验证码
        for(int i=0;i<size;i++) {
        	//产生随机数
        	int n=(int) Math.ceil(Math.random()*(code_str.length()-1));
        	code+=code_str.charAt(n);
        }
        
        //保存验证码的session
        request.getSession().setAttribute("code", code);
        
        /**
         * 验证码图片生成
         * */
        //定义图片的宽高
        int width=20*(size);
        int height=30;
        BufferedImage bufferedImage=new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
        //获取图片的上下文
        Graphics graphics=bufferedImage.getGraphics();
        //设置图片的背景颜色
        graphics.setColor(Color.WHITE);
        //设置背景的范围
        graphics.fillRect(0, 0, width, height);
        //设定图片边框
        graphics.setColor(Color.DARK_GRAY);
        graphics.drawRect(0, 0, width - 1, height - 1);
        //画干扰先
        for(int i=0;i<10;i++) {
        	graphics.setColor(getColor());
        	graphics.drawLine((int)Math.random()*width, (int)Math.random()*height, (int)Math.random()*width, (int)Math.random()*height);
        }
        //设置验证码字体的颜色
        graphics.setColor(getColor());
        Font font=new Font("华文楷体", Font.CENTER_BASELINE, 25);
        graphics.setFont(font);
        graphics.drawString(code, 20, 20);
        //图像生效
        graphics.dispose();
        
        //输出到页面
        ImageIO.write(bufferedImage, "JPEG", response.getOutputStream());
	}
	
	//生成颜色方法
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
