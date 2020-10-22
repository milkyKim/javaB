package ch10;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class FlyingTextEx extends JFrame {
	//final�� ���̸� ���. ���� ���� ������ �ʴ� ��.
	private final int FLYING_UNIT = 10; // ���̺��� �� �� �����̴� ������ 10�ȼ�
	private JLabel la = new JLabel("HELLO"); // Ű �Է¿� ���� ������ ���̺� ������Ʈ
	
	public FlyingTextEx() {
		setTitle("��,��,��,�� Ű�� �̿��Ͽ� �ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		
		// hello label �ޱ�
		c.setLayout(null); // ����Ʈ���� ��ġ������ ����
		la.setLocation(50,50); // la�� �ʱ� ��ġ�� (50,50)
		la.setSize(100,20);
		c.add(la);
		
		// ������ �ޱ�
		c.addKeyListener(new MyKeyListener()); 
		
		setSize(300,150);
		setVisible(true);
		
		// ����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		c.setFocusable(true);
		c.requestFocus();
		
	}
	
	class MyKeyListener extends KeyAdapter {
		public void KeyPressed(KeyEvent e) {
			// ȭ��ǥ Ű�� ���ڰ� �ƴϾ getKeyCode�� ȣ���ؾ���
			int keyCode = e.getKeyCode();
			
			switch(keyCode) {
				case KeyEvent.VK_UP:
					la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
				case KeyEvent.VK_DOWN:
					la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
				case KeyEvent.VK_LEFT:
					la.setLocation(la.getX()-FLYING_UNIT, la.getY());
				case KeyEvent.VK_RIGHT:
					la.setLocation(la.getX()+FLYING_UNIT, la.getY());
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTextEx();
	}

}
