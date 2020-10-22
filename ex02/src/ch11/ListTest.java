package ch11;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class ListTest extends JFrame {
	private String[] str = {"알고리즘","자료구조","네트워크","인터넷과 웹","ddd","fff"};
	private Vector<Integer> v = new Vector<Integer>();
	
	public ListTest() {
		setTitle("List Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		//레이아웃 관리자: 기본이 borderLayout임
		c.setLayout(new FlowLayout());
		JList<String> list1 = new JList<String>(str); // 리스트 객체 생성
		c.add(list1);
		
		JList<Integer> list2 = new JList<Integer>(); // 빈 정수 리스트
		
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
