package hw02;

import java.awt.*;
import javax.swing.*;


import java.awt.event.*;

import java.util.Vector;

public class hw12 extends JFrame {
	
	
	public hw12() {
		setTitle("20161045 �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		
		setSize(1300,800);
		setVisible(true);
	}
	
	class Circle {
		int x1, y1, x2, y2;
		
		public Circle(int a, int b, int c, int d) {
			x1 = a; y1 = b; x2 = c; y2 = d;
		}
	}
	
	class MyPanel extends JPanel {
		private int x1, y1, x2, y2;
		
		// �������� �׸��� ���ؼ� vector�迭�� �����
		private Vector<Circle> vCircle = new Vector<Circle>();
		
		// ������ ���
		public MyPanel() {
			MyAdapter ma = new MyAdapter();
			
			this.addMouseListener(ma);
			this.addMouseMotionListener(ma);
			
		}
		
		class MyAdapter extends MouseAdapter {
			@Override
			public void mousePressed(MouseEvent e) {
				// ���� ��ǥ -> ���� �߽��� �� ��
				x1 = e.getX();
				y1 = e.getY();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// ���� ��ǥ�� ����
				x2 = e.getX();
				y2 = e.getY();
				
				vCircle.add(new Circle(x1,y1,x2,y2));
				
				repaint();
			}
			@Override
			public void mouseDragged(MouseEvent e) {
				// ���� ��ǥ�� ����
				x2 = e.getX();
				y2 = e.getY();
			
				repaint();
			}
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			// �� �׸��� 
			for(int i=0; i<vCircle.size(); i++) {
				Circle c = vCircle.elementAt(i);
				
				double distance = Math.sqrt((int) Math.pow(Math.abs(c.y2-c.y1),2)+(int) Math.pow(Math.abs(c.x2-c.x1),2));
				int d = (int)Math.round(distance);
				
				g.drawOval(c.x1-d, c.y1-d, 2*d, 2*d); 
			}
						
			double distance = Math.sqrt((int) Math.pow(Math.abs(y2-y1),2)+(int) Math.pow(Math.abs(x2-x1),2));
			int d = (int)Math.round(distance);
			
			g.drawOval(x1-d, y1-d, 2*d, 2*d); 
		}
		
	}
		

	public static void main(String[] args) {
		new hw12();
	}

}