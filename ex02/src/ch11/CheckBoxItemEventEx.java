package ch11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] names = {"���","��","ü��"}; //�迭 ���� �� �ʱ�ȭ
	private JLabel sumLabel;
	
	public CheckBoxItemEventEx() {
		// �غ�
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		// ������Ʈ ���� �� �ޱ�
		c.add(new JLabel("��� 100��, �� 500��, ü�� 20000��"));
		
		for (int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true); // ��輱 �����
			
			c.add(fruits[i]);  //�迭�� ���� ���� ��� ���Ҹ� for�� �ȿ��� �ٿ�����
			
			fruits[i].addItemListener(new MyItemListener());
		}
		
		sumLabel = new JLabel("���� 0���Դϴ�.");
		c.add(sumLabel);
				
		// ������
		setSize(500, 300);
		setVisible(true);
		
	}
	// ����Ŭ���� ������
	class MyItemListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			// ���� üũ�ڽ� ����/���� �� �հ� ���
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxItemEventEx();
	}

}
