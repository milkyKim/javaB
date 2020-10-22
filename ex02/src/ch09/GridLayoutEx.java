package ch09;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {
	
	public GridLayoutEx() {
		Container c = getContentPane();
		
		// 4�� 2�� Grid layout
		GridLayout grid = new GridLayout(4, 2);
		c.setLayout(grid);
		
		// ������Ʈ �߰�
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�й�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�а�"));
		c.add(new JTextField(""));
		c.add(new JLabel("����"));
		c.add(new JTextField(""));
		
		
		setSize(300,200);
		setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		
		new GridLayoutEx();
	}

}
