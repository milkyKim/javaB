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
	// 멤버변수로 설정해, 이벤트 클래스에서 사용가능 하도록 설정
	private JLabel la = new JLabel("hello"); 
	
	public MouseListenerEx() {
		setTitle("Action 이벤트 리스너 작성"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c = getContentPane(); 
		c.setLayout(null); 
		
		la.setSize(50, 20);
		la.setLocation(30,30);
		c.add(la);
		
		// 마우스 클릭 위치를 얻기 위해서는, 이벤트를 컨텐트팬에 부착해야한다.
		c.addMouseListener(new MyMouseListener());

		setSize(250, 250);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter  {
		@Override
		public void mousePressed(MouseEvent e) {
			
			// hello 레이블 달기
			la.setLocation(e.getX(), e.getY());
			
		}
	}
	
//	//내부 클래스의 리스너
//	class MyMouseListener implements MouseListener {
//
//		@Override
//		public void mouseClicked(MouseEvent e) {
//		}
//
//		@Override
//		public void mousePressed(MouseEvent e) {
//			
//			// hello 레이블 달기
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
