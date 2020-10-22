package ch10;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class IndepClassListener extends JFrame {
	
	public IndepClassListener() {
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		// 버튼 추가
		JButton btn = new JButton("KMJ");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new IndepClassListener();
	}

}
