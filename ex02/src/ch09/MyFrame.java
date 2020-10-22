package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	// 생성자
	public MyFrame() {
		// 사이즈와 visible을 해야 보여진다.
		// setTitle("첫 프레임");
		super("첫 프레임"); //super -> 부모생성자 호출
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		//c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40)); // 배치관리자 지정
		//c.setLayout(new BorderLayout());
		c.setLayout(new GridLayout(3,2,6,4)); // 4×3 분할로 배치 
		
		c.add(new JButton("Add"));
		c.add(new JButton("Sub"));
		c.add(new JButton("Mul"));
		c.add(new JButton("Div"));
		c.add(new JButton("calculate"));
		
		/*
		c.add(new JButton("Add"), BorderLayout.NORTH);
		c.add(new JButton("Sub"), BorderLayout.SOUTH);
		c.add(new JButton("Mul"), BorderLayout.WEST);
		c.add(new JButton("Div"), BorderLayout.EAST);
		c.add(new JButton("calculate"), BorderLayout.CENTER);
		*/
		
		/*
		c.add(new JButton("OK"));
		c.add(new JButton("Cancle"));
		c.add(new JButton("Ignore"));
		c.add(new JButton("Add"));
		c.add(new JButton("Sub"));
		c.add(new JButton("Mul"));
		c.add(new JButton("Div"));
		*/
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// MyFrame 객체 생성
		MyFrame f = new MyFrame();
	}

}
