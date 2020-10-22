package ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame {
	
	public AnonymousClassListener() { 
		setTitle("Action �̺�Ʈ ������ �ۼ�"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout()); 
		
		JButton btn = new JButton("KMJ"); 
		c.add(btn);
		
		// �͸�Ŭ������ �̺�Ʈ ���
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("KMJ")) 
					b.setText("�����");
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
