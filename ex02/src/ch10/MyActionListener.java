package ch10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

// ActionEvent를 처리하는 이벤트 리스너
public class MyActionListener implements ActionListener {

	@Override
	// ActionEvent가 발생하면 호출되는 메소드
	public void actionPerformed(ActionEvent e) {
		// 리스너가 할 일을 작성
		JButton b = (JButton) e.getSource(); // 이벤트 소스를 얻음 -> 이벤트가 어디서 발생했는지
		
		// 버튼에 문자열을 한영전환하기
		if(b.getText().equals("KMJ")) {
			b.setText("김민지");
		} else {
			b.setText("KMJ");
		}
	}

}
