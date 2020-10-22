package ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class ComboTest extends JFrame {
	private String[] str = {"�˰���","�ڷᱸ��","��Ʈ��ũ","���ͳݰ� ��","ddd","fff"};
	private int[] year = {3,2,4,1}; // ���� �� �ش� �г�
	private JLabel rs = new JLabel("���");
	
	public ComboTest() {
		setTitle("ComboBox Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JComboBox<String> combo = new JComboBox<String>(str);
		c.add(combo, BorderLayout.NORTH);
		c.add(rs, BorderLayout.CENTER);
		
		// �޺��ڽ� �̺�Ʈ ó�� �ڵ� �ۼ�_�͸� Ŭ������
		combo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int index = combo.getSelectedIndex();
				rs.setText(year[index]+"�г� �����Դϴ�.");
				
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
