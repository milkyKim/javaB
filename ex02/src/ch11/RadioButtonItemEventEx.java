package ch11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

import ch11.RadioButtonItemEventEx.MyItemListener;

import java.awt.*;

public class RadioButtonItemEventEx extends JFrame {
	private JRadioButton [] fruits = new JRadioButton [3]; // ������ư �迭
	private String [] names = {"���", "��", "ü��"}; // ������ư�� ���ڿ�
	private ImageIcon [] images = { // �̹��� ��ü �迭
						new ImageIcon("images/apple.jpg"), 
						new ImageIcon("images/pear.jpg"),
						new ImageIcon("images/cherry.jpg")};
	private JLabel imageLabel = new JLabel(); // �̹����� ��µ� ���̺�
	// private JRadioButton fruits = new JRadioButton();
	
	public RadioButtonItemEventEx() {
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		// ������Ʈ ����
		ButtonGroup g = new ButtonGroup();
		JPanel panel = new JPanel();
		panel = new JPanel();
		
		for(int i =0; i<fruits.length; i++) {
			fruits[i] = new JRadioButton(names[i]);
			g.add(fruits[i]);
			panel.add(fruits[i]);
			fruits[i].addItemListener(new MyItemListener()); //������ ���
		}
		c.add(panel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER); // �̹����� �߾� ����
		fruits[2].setSelected(true); // �ڵ�� ��ư ���� -> ItemListener
		
		setSize(250,200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			// ��ư ���� �� �ش� �׸� �����ֱ� -> ������ư�� ������ �ȵǴµ� �ؿ��� ���� ���ϴ��� �𸣰���..
			if(e.getStateChange() == ItemEvent.DESELECTED) {
				return;
			}
			if(fruits[0].isSelected()) { //��� ��ư�� ���õǾ��ٸ�
				imageLabel.setIcon(images[0]);
			}
			if(fruits[1].isSelected()) { //�� ��ư�� ���õǾ��ٸ�
				imageLabel.setIcon(images[1]);
			}
			if(fruits[2].isSelected()) { //ü�� ��ư�� ���õǾ��ٸ�
				imageLabel.setIcon(images[2]);
			}
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonItemEventEx();
	}

}
