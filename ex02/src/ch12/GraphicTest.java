package ch12;

import java.awt.*;
import javax.swing.*;

public class GraphicTest extends JFrame {
	
	public GraphicTest() {
		setTitle("그래픽 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); // 기본 배치 -> border
		
		MyPanel p = new MyPanel(); // 기본 배치 -> flow
		p.add(new JButton("컴포넌트도 추가할 수 있어욤!"));
		c.add(p);  //c.add(p,BorderLayout.CENTER);와 같음
		
		setSize(300,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{

		@Override
		protected void paintComponent(Graphics g) {
			// JPanel의 컴포넌트 요소를 가져옴
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			
			// x, y, width, height 순
			g.drawRect(10,  10,  50,  50); // 왼쪽 상단이 (0,0)
			
			g.setColor(Color.RED);
			g.drawRect(100, 100, 200, 50);
			
			g.drawString("자바 그래픽 문자열 테스트", 120, 140);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicTest();
	}

}
