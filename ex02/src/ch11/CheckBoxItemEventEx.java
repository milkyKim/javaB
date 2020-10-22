package ch11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] names = {"사과","배","체리"}; //배열 생성 및 초기화
	private JLabel sumLabel;
	
	public CheckBoxItemEventEx() {
		// 준비
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		// 컴포넌트 생성 및 달기
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		
		for (int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true); // 경계선 만들기
			
			c.add(fruits[i]);  //배열을 붙일 수는 없어서 원소를 for문 안에서 붙여야함
			
			fruits[i].addItemListener(new MyItemListener());
		}
		
		sumLabel = new JLabel("현재 0원입니다.");
		c.add(sumLabel);
				
		// 마무리
		setSize(500, 300);
		setVisible(true);
		
	}
	// 내부클래스 리스너
	class MyItemListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			// 과일 체크박스 해제/선택 시 합계 계산
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxItemEventEx();
	}

}
