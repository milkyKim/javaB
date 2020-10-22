package hw02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

//팁: JTextArea에 Key리스너를 만들고 keyTyped()에서 처리
// 입력하는 순간순간에 슬라이더의 setValue() 그것으로 처리하는 게 힌트
public class hw11 extends JFrame {
	private JTextArea ta = new JTextArea(5,20);
	private JSlider sl = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
	
	public hw11() {
		setTitle("20161045 김민지");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		sl.setPaintLabels(true);  // 얘는 아래 라벨 숫자를 나타냄
		sl.setPaintTicks(true);  // 얘는 눈금자 보이게 색칠해주는거
		sl.setPaintTrack(true); 
		sl.setMajorTickSpacing(20); // 주요 눈금 20
		sl.setMinorTickSpacing(5); // 작은 눈금 5
		
		sl.addChangeListener(new MyChangeListener());
		
		ta.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
					
				if(sl.getValue() >= 100) {
					ta.setEditable(false);
				} else if(sl.getValue() < 100) {
					ta.setEditable(true);
					sl.setValue(ta.getText().length());
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		c.add(new JScrollPane(ta), BorderLayout.CENTER);
		c.add(sl, BorderLayout.SOUTH);
		
		setSize(350,200);
		setVisible(true);
		
	}
	
	class MyChangeListener implements ChangeListener {
		@Override
		public void stateChanged(ChangeEvent e) {
			
		if(ta.getText().length() > sl.getValue()) {
				if(ta.getText().length() == 1) {
					sl.setValue(0);
				} else {
					ta.setText(ta.getText().substring(0, sl.getValue()-1));	
				}
			} 
		}
	}

	public static void main(String[] args) {
		new hw11();
	}

}
