package ch10;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class FlyingTextEx extends JFrame {
	//final을 붙이면 상수. 값이 절대 변하지 않는 값.
	private final int FLYING_UNIT = 10; // 레이블이 한 번 움직이는 단위는 10픽셀
	private JLabel la = new JLabel("HELLO"); // 키 입력에 따라 움직일 레이블 컴포넌트
	
	public FlyingTextEx() {
		setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		
		// hello label 달기
		c.setLayout(null); // 컨텐트팬의 배치관리자 삭제
		la.setLocation(50,50); // la의 초기 위치는 (50,50)
		la.setSize(100,20);
		c.add(la);
		
		// 리스너 달기
		c.addKeyListener(new MyKeyListener()); 
		
		setSize(300,150);
		setVisible(true);
		
		// 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		c.setFocusable(true);
		c.requestFocus();
		
	}
	
	class MyKeyListener extends KeyAdapter {
		public void KeyPressed(KeyEvent e) {
			// 화살표 키는 문자가 아니어서 getKeyCode를 호출해야함
			int keyCode = e.getKeyCode();
			
			switch(keyCode) {
				case KeyEvent.VK_UP:
					la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
				case KeyEvent.VK_DOWN:
					la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
				case KeyEvent.VK_LEFT:
					la.setLocation(la.getX()-FLYING_UNIT, la.getY());
				case KeyEvent.VK_RIGHT:
					la.setLocation(la.getX()+FLYING_UNIT, la.getY());
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTextEx();
	}

}
