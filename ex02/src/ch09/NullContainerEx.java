package ch09;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NullContainerEx extends JFrame {
	
	public NullContainerEx() {
		
		Container c = getContentPane();
		
		// ��ġ������ ���ֱ�
		c.setLayout(null);
		
		// ������Ʈ �߰�
		JLabel la = new JLabel("�����");
		
		// ��ġ�����ڰ� ���� ������, ��ġ�� ����� ������ �ٿ������.
		la.setLocation(130, 50);
		la.setSize(100, 20);
		c.add(la);
		
		for(int i=1; i<=9; i++) { 
			JButton b = new JButton(Integer.toString(i)); // ��ư ���� 
			b.setLocation(i*15, i*15); 
			b.setSize(50, 20); 
			c.add(b); // ��ư�� ����Ʈ�ҿ� ����
		}
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new NullContainerEx();
	}

}
