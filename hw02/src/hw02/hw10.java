package hw02;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;



public class hw10 extends JFrame {
	String str = "KimMinJi";
	private JLabel la = new JLabel(str);
	
	public hw10() {
		setTitle("20161045 ±è¹ÎÁö"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		
		la.addKeyListener(new MyKeyListener());
		setSize(350,150);
		setVisible(true);
		
		// JLabel¿¡ Æ÷Ä¿½º ÁöÁ¤
		la.setFocusable(true);
		la.requestFocus(); 
		
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				str = str.substring(1) + str.substring(0,1);
				la.setText(str);
			}
		}
	}

	public static void main(String[] args) {
		new hw10();

	}

}
