package ch10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame {
	// ��������� ������, �̺�Ʈ Ŭ�������� ��밡�� �ϵ��� ����
	private JLabel la = new JLabel("hello"); 
	
	public MouseListenerEx() {
		setTitle("Action �̺�Ʈ ������ �ۼ�"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c = getContentPane(); 
		c.setLayout(null); 
		
		la.setSize(50, 20);
		la.setLocation(30,30);
		c.add(la);
		
		// ���콺 Ŭ�� ��ġ�� ��� ���ؼ���, �̺�Ʈ�� ����Ʈ�ҿ� �����ؾ��Ѵ�.
		c.addMouseListener(new MyMouseListener());

		setSize(250, 250);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter  {
		@Override
		public void mousePressed(MouseEvent e) {
			
			// hello ���̺� �ޱ�
			la.setLocation(e.getX(), e.getY());
			
		}
	}
	
//	//���� Ŭ������ ������
//	class MyMouseListener implements MouseListener {
//
//		@Override
//		public void mouseClicked(MouseEvent e) {
//		}
//
//		@Override
//		public void mousePressed(MouseEvent e) {
//			
//			// hello ���̺� �ޱ�
//			la.setLocation(e.getX(), e.getY());
//			
//		}
//
//		@Override
//		public void mouseReleased(MouseEvent e) {
//		}
//
//		@Override
//		public void mouseEntered(MouseEvent e) {
//		}
//
//		@Override
//		public void mouseExited(MouseEvent e) {
//		}
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerEx();
	}

}
