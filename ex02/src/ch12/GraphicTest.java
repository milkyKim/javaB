package ch12;

import java.awt.*;
import javax.swing.*;

public class GraphicTest extends JFrame {
	
	public GraphicTest() {
		setTitle("�׷��� �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); // �⺻ ��ġ -> border
		
		MyPanel p = new MyPanel(); // �⺻ ��ġ -> flow
		p.add(new JButton("������Ʈ�� �߰��� �� �־��!"));
		c.add(p);  //c.add(p,BorderLayout.CENTER);�� ����
		
		setSize(300,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{

		@Override
		protected void paintComponent(Graphics g) {
			// JPanel�� ������Ʈ ��Ҹ� ������
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			
			// x, y, width, height ��
			g.drawRect(10,  10,  50,  50); // ���� ����� (0,0)
			
			g.setColor(Color.RED);
			g.drawRect(100, 100, 200, 50);
			
			g.drawString("�ڹ� �׷��� ���ڿ� �׽�Ʈ", 120, 140);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicTest();
	}

}
