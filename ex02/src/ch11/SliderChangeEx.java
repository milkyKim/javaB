package ch11;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class SliderChangeEx extends JFrame {
	private JLabel colorLabel;
	private JSlider [] sl = new JSlider[3];
	
	public SliderChangeEx() {
		setTitle("슬라이더 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 결과 라벨을 생성
		colorLabel = new JLabel("결과 라벨");
		
		// 슬라이더 3개 생성: R,G,B (0~255)
		for(int i=0; i<sl.length; i++) {
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			sl[i].setPaintLabels(true);  // 얘는 아래 라벨 숫자를 나타냄
			sl[i].setPaintTicks(true);  // 얘는 눈금자 보이게 색칠해주는거
			sl[i].setPaintTrack(true); 
			sl[i].setMajorTickSpacing(50); // 주요 눈금 50
			sl[i].setMinorTickSpacing(10); // 작은 눈금 10
			// 각 슬라이더에 이벤트 처리
			sl[i].addChangeListener(new MyChangeListener());
			c.add(sl[i]);
		}
		
		// 눈금 색 변경 초기화
		sl[0].setForeground(Color.red);
		sl[1].setForeground(Color.green);
		sl[2].setForeground(Color.blue);
		
		// 기본 초기 색 설정을 위해 선언
		int r = sl[0].getValue();
		int g = sl[1].getValue();
		int b = sl[2].getValue();
		
		// setOpaque => 해야 설정한 배경색이 보이게 됨!!!
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(r,g,b));
		c.add(colorLabel);
		setSize(300,300);
		setVisible(true);
	}
	
	class MyChangeListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			int r = sl[0].getValue();
			int g = sl[1].getValue();
			int b = sl[2].getValue();
			
			colorLabel.setBackground(new Color(r,g,b));
		}
	}

	public static void main(String[] args) {
		new SliderChangeEx();

	}

}
