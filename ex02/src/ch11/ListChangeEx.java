package ch11;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class ListChangeEx extends JFrame {
	private JTextField tf = new JTextField(10);
	private Vector<String> v = new Vector<String>();
	private JList<String> nameList = new JList<String>(v);
	
	public ListChangeEx() {
		setTitle("����Ʈ ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// �� �Է�
		c.add(new JLabel("�̸� �Է� �� <Enter> Ű"));
		
		// �ؽ�Ʈ�ʵ� �����ؼ� ���
		c.add(tf);
		
		// ����Ʈ ������ ���
		v.add("Ȳ����");
		v.add("���繮");
		nameList.setVisibleRowCount(5); // ����Ʈ�� �� ����, ���� ��
		nameList.setFixedCellWidth(200); // ����Ʈ�� �ʺ�(200px)
		c.add(new JScrollPane(nameList));
		
		// tf�� ���� �̺�Ʈ ó�� �ڵ� �ۼ�_�͸� Ŭ���� �ۼ�
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				v.add(tf.getText()); // ���Ϳ� �߰�
				tf.setText(""); // �ؽ�Ʈ �ʵ� �ʱ�ȭ
				nameList.setListData(v); //����Ʈ�� ������ �缳��_�̰� ���ϸ� ����Ʈ�� �� �ȵ���
			}
		});
		
		// name����Ʈ ó���� ���� �̺�Ʈ ó�� �ڵ� �ۼ�
		nameList.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// getSelectedValue -> ������ ���� �˷���
//				if(!e.getValueIsAdjusting()) { //�̰� ���ϸ� 2�� ��µ� ��
//					System.out.println(nameList.getSelectedValue());
//				}
				
				int n = nameList.getSelectedIndex();
				if(n!=-1) {
					String s = nameList.getSelectedValue();
					v.set(n, s+"_"+n+"_����"); // ������ ���� ����
					nameList.setListData(v);
				}
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ListChangeEx();
	}

}
