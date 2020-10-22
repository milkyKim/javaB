package ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class ComboTest extends JFrame {
	private String[] str = {"알고리즘","자료구조","네트워크","인터넷과 웹","ddd","fff"};
	private int[] year = {3,2,4,1}; // 과목 당 해당 학년
	private JLabel rs = new JLabel("결과");
	
	public ComboTest() {
		setTitle("ComboBox Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JComboBox<String> combo = new JComboBox<String>(str);
		c.add(combo, BorderLayout.NORTH);
		c.add(rs, BorderLayout.CENTER);
		
		// 콤보박스 이벤트 처리 코드 작성_익명 클래스로
		combo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int index = combo.getSelectedIndex();
				rs.setText(year[index]+"학년 과목입니다.");
				
			}
			
		});
		
		
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboTest();
	}

}
