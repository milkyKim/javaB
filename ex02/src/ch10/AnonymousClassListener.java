package ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame {
	
	public AnonymousClassListener() { 
		setTitle("Action 이벤트 리스너 작성"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout()); 
		
		JButton btn = new JButton("KMJ"); 
		c.add(btn);
		
		// 익명클래스로 이벤트 등록
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("KMJ")) 
					b.setText("김민지");
				else 
					b.setText("KMJ");
				
			}
		});
		

		setSize(350, 150);
		setVisible(true);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnonymousClassListener();
	}

}
