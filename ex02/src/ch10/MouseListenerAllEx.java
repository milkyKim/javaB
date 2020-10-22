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
	//�Ӽ�
	private JLabel la = new JLabel("No mouse event");
	
	public MouseListenerAllEx() {
		Container c = getContentPane();
		
		// ���̺� ���̱�
		c.setLayout(new FlowLayout());
		c.add(la);
		
		// ������ �ޱ� -> 2�� �޶��� �̷��� ������ ������ְ� �־��ֱ�
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		// ������
		setSize(300,150);
		setVisible(true);
		
		// ����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
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
			// ������ �ϴû�����
			Container c = (Container)e.getSource();
			c.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// ������ ���������
			Container c = (Container)e.getSource();
			c.setBackground(Color.YELLOW);
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// �巡�״� ���������� �巡�� ���߿� ��� ȣ���
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
