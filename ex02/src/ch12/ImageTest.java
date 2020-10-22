package ch12;

import javax.swing.*;
import java.awt.*;

public class ImageTest extends JFrame {
	public ImageTest() {
		setTitle("그리기 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(400,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			//g.drawImage(img, 10, 10, getWidth()-20, getHeight()-20, this);
			g.drawRect(50, 50, getWidth()-100, getHeight()-100); //양쪽으로 50만큼 띄고싶을 때
			g.drawImage(img, 50, 50, 100, 150, img.getWidth(this)/2, img.getHeight(this)/2, img.getWidth(this), img.getHeight(this), this);
			//연습문제 6(반복문),10(getW, getH 사용)번 풀어보기
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageTest();
	}

}
