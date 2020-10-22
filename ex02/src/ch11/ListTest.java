package ch11;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class ListTest extends JFrame {
	private String[] str = {"�˰���","�ڷᱸ��","��Ʈ��ũ","���ͳݰ� ��","ddd","fff"};
	private Vector<Integer> v = new Vector<Integer>();
	
	public ListTest() {
		setTitle("List Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		//���̾ƿ� ������: �⺻�� borderLayout��
		c.setLayout(new FlowLayout());
		JList<String> list1 = new JList<String>(str); // ����Ʈ ��ü ����
		c.add(list1);
		
		JList<Integer> list2 = new JList<Integer>(); // �� ���� ����Ʈ
		
		for (int i=0; i<10; i++) {
			v.add(i*10);
		}
		
		list2.setListData(v);
		list2.setVisibleRowCount(4);
		add(list2);
		
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ListTest();

	}

}
