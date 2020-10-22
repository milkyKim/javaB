package ch12;

import javax.swing.*;
import java.awt.*;

public class DrawTest extends JFrame {
	
	public DrawTest() {
		setTitle("그리기 Draw 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); // 기본 배치 -> border
		c.setLayout(new GridLayout(0, 3, 10, 10)); // 0이라고 하면 동적으로 추가됨
	
		c.add(new MyPanel0());
		c.add(new MyPanel1());
		c.add(new MyPanel2());
		c.add(new MyPanel3());
		c.add(new MyPanel4());
		c.add(new MyPanel5());
		c.add(new MyPanel6());
		
		setSize(1200,800);
		setVisible(true);
		
	}
	
	class MyPanel0 extends JPanel {
		// drawString
		public MyPanel0() {
			this.setBackground(Color.white);
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setFont(new Font("돋움", Font.BOLD, 30));
			g.drawString("그래픽 그리기 테스트", 50, 50);
		}
		
	}
	class MyPanel1 extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.orange);
			g.drawLine(10, 10, 200, 200);
			g.drawLine(200, 10, 10, 200);
		}
		
	}
	class MyPanel2 extends JPanel {
		public MyPanel2() {
			this.setBackground(Color.white);
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.blue);
			g.drawRect(10, 10, 100, 50);
			g.drawRect(50, 80, 200, 100);
		}
		
	}
	class MyPanel3 extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.yellow);
			g.drawRect(50, 50, 100, 200);
			g.setColor(Color.red);
			g.fillOval(50, 50, 100, 200);
		}
		
	}
	class MyPanel4 extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			// 시작 좌표 x, y, 너비, 높이, 모서리 깎이는 정도 x, y
			g.fillRoundRect(50, 50, 200, 200, 50, 50);
		}
		
	}
	
	class MyPanel5 extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawArc(50, 50, 100, 100, 30, 30);
			g.drawArc(50, 50, 100, 100, 120, 30);
			g.drawArc(50, 50, 100, 100, 210, 30);
			g.drawArc(50, 50, 100, 100, 300, 30);
			
			g.setColor(Color.red);
			g.fillArc(50, 150, 100, 100, 50, 70);
			g.setColor(Color.green);
			g.fillArc(50, 150, 100, 100, 120, 40);
			g.setColor(Color.blue);
			g.fillArc(50, 150, 100, 100, 160, 120);
			g.setColor(Color.gray);
			g.fillArc(50, 150, 100, 100, 280, 130);
		}
		
	}
	
	class MyPanel6 extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			int[] x = {10,200,200,270,200,200,10};
			int[] y = {100,100,50,150,250,200,200};
			g.fillPolygon(x,y,x.length);
			g.setColor(Color.red);
			g.drawPolygon(x,y,x.length);
		}
		
	}

	public static void main(String[] args) {
		new DrawTest();

	}

}
