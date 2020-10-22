package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerAllEx extends JFrame {
	//속성
	private JLabel la = new JLabel("No mouse event");
	
	public MouseListenerAllEx() {
		Container c = getContentPane();
		
		// 레이블 붙이기
		c.setLayout(new FlowLayout());
		c.add(la);
		
		// 리스너 달기 -> 2개 달때는 이렇게 변수로 만들어주고 넣어주기
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		// 마무리
		setSize(300,150);
		setVisible(true);
		
		// 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed("+e.getX()+","+e.getY()+")");
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// 배경색을 하늘색으로
			Container c = (Container)e.getSource();
			c.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// 배경색을 노란색으로
			Container c = (Container)e.getSource();
			c.setBackground(Color.YELLOW);
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// 드래그는 연속적으로 드래그 도중에 계속 호출됨
			la.setText("mouseDragged("+e.getX()+","+e.getY()+")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("mouseMoved("+e.getX()+","+e.getY()+")");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerAllEx();
	}

}
