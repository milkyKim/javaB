package ch09;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NullContainerEx extends JFrame {
	
	public NullContainerEx() {
		
		Container c = getContentPane();
		
		// 배치관리자 없애기
		c.setLayout(null);
		
		// 컴포넌트 추가
		JLabel la = new JLabel("김민지");
		
		// 배치관리자가 없기 때문에, 위치와 사이즈를 결정해 붙여줘야함.
		la.setLocation(130, 50);
		la.setSize(100, 20);
		c.add(la);
		
		for(int i=1; i<=9; i++) { 
			JButton b = new JButton(Integer.toString(i)); // 버튼 생성 
			b.setLocation(i*15, i*15); 
			b.setSize(50, 20); 
			c.add(b); // 버튼을 컨텐트팬에 부착
		}
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new NullContainerEx();
	}

}
