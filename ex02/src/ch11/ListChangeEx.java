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
		setTitle("리스트 변경 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 라벨 입력
		c.add(new JLabel("이름 입력 후 <Enter> 키"));
		
		// 텍스트필드 생성해서 등록
		c.add(tf);
		
		// 리스트 생성해 등록
		v.add("황기태");
		v.add("이재문");
		nameList.setVisibleRowCount(5); // 리스트의 행 갯수, 높이 값
		nameList.setFixedCellWidth(200); // 리스트의 너비(200px)
		c.add(new JScrollPane(nameList));
		
		// tf를 위한 이벤트 처리 코드 작성_익명 클래스 작성
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				v.add(tf.getText()); // 벡터에 추가
				tf.setText(""); // 텍스트 필드 초기화
				nameList.setListData(v); //리스트의 데이터 재설정_이거 안하면 리스트에 값 안들어옴
			}
		});
		
		// name리스트 처리를 위한 이벤트 처리 코드 작성
		nameList.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// getSelectedValue -> 선택한 값을 알려줌
//				if(!e.getValueIsAdjusting()) { //이거 안하면 2번 출력됨 ㅜ
//					System.out.println(nameList.getSelectedValue());
//				}
				
				int n = nameList.getSelectedIndex();
				if(n!=-1) {
					String s = nameList.getSelectedValue();
					v.set(n, s+"_"+n+"_선택"); // 벡터의 값을 수정
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
