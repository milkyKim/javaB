package ch11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

import ch11.RadioButtonItemEventEx.MyItemListener;

import java.awt.*;

public class RadioButtonItemEventEx extends JFrame {
	private JRadioButton [] fruits = new JRadioButton [3]; // 라디오버튼 배열
	private String [] names = {"사과", "배", "체리"}; // 라디오버튼의 문자열
	private ImageIcon [] images = { // 이미지 객체 배열
						new ImageIcon("images/apple.jpg"), 
						new ImageIcon("images/pear.jpg"),
						new ImageIcon("images/cherry.jpg")};
	private JLabel imageLabel = new JLabel(); // 이미지가 출력될 레이블
	// private JRadioButton fruits = new JRadioButton();
	
	public RadioButtonItemEventEx() {
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		// 컴포넌트 생성
		ButtonGroup g = new ButtonGroup();
		JPanel panel = new JPanel();
		panel = new JPanel();
		
		for(int i =0; i<fruits.length; i++) {
			fruits[i] = new JRadioButton(names[i]);
			g.add(fruits[i]);
			panel.add(fruits[i]);
			fruits[i].addItemListener(new MyItemListener()); //리스너 등록
		}
		c.add(panel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER); // 이미지의 중앙 정렬
		fruits[2].setSelected(true); // 코드로 버튼 선택 -> ItemListener
		
		setSize(250,200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			// 버튼 선택 시 해당 그림 보여주기 -> 라디오버튼은 해제가 안되는데 밑에꺼 굳이 왜하는지 모르겠음..
			if(e.getStateChange() == ItemEvent.DESELECTED) {
				return;
			}
			if(fruits[0].isSelected()) { //사과 버튼이 선택되었다면
				imageLabel.setIcon(images[0]);
			}
			if(fruits[1].isSelected()) { //배 버튼이 선택되었다면
				imageLabel.setIcon(images[1]);
			}
			if(fruits[2].isSelected()) { //체리 버튼이 선택되었다면
				imageLabel.setIcon(images[2]);
			}
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonItemEventEx();
	}

}
