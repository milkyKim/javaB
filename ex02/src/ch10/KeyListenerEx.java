package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class KeyListenerEx extends JFrame {
	// �迭 �̸��� �׻� ������ �ϴ� ���� ����
	private JLabel [] keyMessage; // 3���� �޽����� ����� ���̺� ������Ʈ �迭

	public KeyListenerEx() {
		//�غ�
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// JLabel 3�� ����
		keyMessage = new JLabel [3]; // ���̺� �迭 ����
		keyMessage[0] = new JLabel(" getKeyChar()  ");
		keyMessage[1] = new JLabel(" getKeyCode()  ");
		keyMessage[2] = new JLabel(" getKeyText()  ");
				
		// 3���� ���̺� ������Ʈ�� ����Ʈ�ҿ� ����
		for(int i=0; i<keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); // ������ ���̷� ������ �Ӽ� ����
			keyMessage[i].setBackground(Color.YELLOW); // ������ CYAN ������ ����
		}				
		
		// JLabel �ޱ�
		
		// ������ ���
		c.addKeyListener(new MyKeyListener()); 
		
		//������
		setSize(300, 150);
		setVisible(true);
		
		// ��Ŀ���� ����������, Ű �̺�Ʈ�� ������ ����
		c.setFocusable(true);
		c.requestFocus();
		
	}
	
	// KeyEvent ������
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			//� Ű�� ���������� ����
			char keyChar = e.getKeyChar();
			int keyCode = e.getKeyCode();
			
			String keyText = e.getKeyText(keyCode);
			
			// Ű ������ ���
			keyMessage[0].setText(Character.toString(keyChar));
			keyMessage[1].setText(Integer.toString(keyCode));
			keyMessage[2].setText(keyText);
			
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyListenerEx();
	}

}
