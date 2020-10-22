package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class KeyListenerEx extends JFrame {
	// 배열 이름은 항상 복수로 하는 것이 좋다
	private JLabel [] keyMessage; // 3개의 메시지를 출력할 레이블 컴포넌트 배열

	public KeyListenerEx() {
		//준비
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// JLabel 3개 생성
		keyMessage = new JLabel [3]; // 레이블 배열 생성
		keyMessage[0] = new JLabel(" getKeyChar()  ");
		keyMessage[1] = new JLabel(" getKeyCode()  ");
		keyMessage[2] = new JLabel(" getKeyText()  ");
				
		// 3개의 레이블 컴포넌트를 컨텐트팬에 부착
		for(int i=0; i<keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); // 배경색이 보이록 불투명 속성 설정
			keyMessage[i].setBackground(Color.YELLOW); // 배경색을 CYAN 색으로 변경
		}				
		
		// JLabel 달기
		
		// 리스너 등록
		c.addKeyListener(new MyKeyListener()); 
		
		//마무리
		setSize(300, 150);
		setVisible(true);
		
		// 포커스를 주지않으면, 키 이벤트가 먹히지 않음
		c.setFocusable(true);
		c.requestFocus();
		
	}
	
	// KeyEvent 리스너
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			//어떤 키가 눌러졌는지 조사
			char keyChar = e.getKeyChar();
			int keyCode = e.getKeyCode();
			
			String keyText = e.getKeyText(keyCode);
			
			// 키 값들을 출력
			keyMessage[0].setText(Character.toString(keyChar));
			keyMessage[1].setText(Integer.toString(keyCode));
			keyMessage[2].setText(keyText);
			
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyListenerEx();
	}

}
