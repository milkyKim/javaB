package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	// ������
	public MyFrame() {
		// ������� visible�� �ؾ� ��������.
		// setTitle("ù ������");
		super("ù ������"); //super -> �θ������ ȣ��
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		//c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40)); // ��ġ������ ����
		//c.setLayout(new BorderLayout());
		c.setLayout(new GridLayout(3,2,6,4)); // 4��3 ���ҷ� ��ġ 
		
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
		// MyFrame ��ü ����
		MyFrame f = new MyFrame();
	}

}
