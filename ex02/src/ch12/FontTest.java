package ch12;

import javax.swing.*;
import java.awt.*;

public class FontTest extends JFrame {
	
	public FontTest() {
		setTitle("컬러 폰트 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		
		setSize(400, 600);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawString("자바", 30, 30);
			
			g.setColor(new Color(255 ,0 , 0)); //red
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			g.drawString("How much", 30, 60);
			
			// 0x00은 고정
			g.setColor(new Color(0x00ffff00)); //red+green = yellow
			for(int i=1; i<=5; i++) {
				g.setFont(new Font("Jokerman", Font.BOLD + Font.ITALIC, i*10));
				g.drawString("How much", 30, 60+i*60);
			}
		}
		
	}

	public static void main(String[] args) {
		new FontTest();
	}

}
