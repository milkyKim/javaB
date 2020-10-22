package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel(); // 빈 레이블 컴포넌트 생성
	
	public KeyCodeEx() {
		setTitle("Key Code 예제 : F2키:초록색, % 키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		setSize(300,150);
		setVisible(true);
		
		// 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			Container c = (Container) e.getSource();
			if(e.getKeyChar() == '%') {
				//컨텐트페인의 배경색을 노란색으로 바꿈
				c.setBackground(Color.YELLOW);
			} else if(e.getKeyCode() == KeyEvent.VK_F1) {
				c.setBackground(Color.GREEN);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyCodeEx();
	}

}
