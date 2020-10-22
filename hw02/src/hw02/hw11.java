package hw02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

//��: JTextArea�� Key�����ʸ� ����� keyTyped()���� ó��
// �Է��ϴ� ���������� �����̴��� setValue() �װ����� ó���ϴ� �� ��Ʈ
public class hw11 extends JFrame {
	private JTextArea ta = new JTextArea(5,20);
	private JSlider sl = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
	
	public hw11() {
		setTitle("20161045 �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		sl.setPaintLabels(true);  // ��� �Ʒ� �� ���ڸ� ��Ÿ��
		sl.setPaintTicks(true);  // ��� ������ ���̰� ��ĥ���ִ°�
		sl.setPaintTrack(true); 
		sl.setMajorTickSpacing(20); // �ֿ� ���� 20
		sl.setMinorTickSpacing(5); // ���� ���� 5
		
		sl.addChangeListener(new MyChangeListener());
		
		ta.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
					
				if(sl.getValue() >= 100) {
					ta.setEditable(false);
				} else if(sl.getValue() < 100) {
					ta.setEditable(true);
					sl.setValue(ta.getText().length());
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		c.add(new JScrollPane(ta), BorderLayout.CENTER);
		c.add(sl, BorderLayout.SOUTH);
		
		setSize(350,200);
		setVisible(true);
		
	}
	
	class MyChangeListener implements ChangeListener {
		@Override
		public void stateChanged(ChangeEvent e) {
			
		if(ta.getText().length() > sl.getValue()) {
				if(ta.getText().length() == 1) {
					sl.setValue(0);
				} else {
					ta.setText(ta.getText().substring(0, sl.getValue()-1));	
				}
			} 
		}
	}

	public static void main(String[] args) {
		new hw11();
	}

}
