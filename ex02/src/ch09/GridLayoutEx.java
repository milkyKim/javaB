package ch09;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {
	
	public GridLayoutEx() {
		Container c = getContentPane();
		
		// 4행 2열 Grid layout
		GridLayout grid = new GridLayout(4, 2);
		c.setLayout(grid);
		
		// 컴포넌트 추가
		c.add(new JLabel("이름"));
		c.add(new JTextField(""));
		c.add(new JLabel("학번"));
		c.add(new JTextField(""));
		c.add(new JLabel("학과"));
		c.add(new JTextField(""));
		c.add(new JLabel("과목"));
		c.add(new JTextField(""));
		
		
		setSize(300,200);
		setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		
		new GridLayoutEx();
	}

}
