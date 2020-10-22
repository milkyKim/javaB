package ch11;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class SliderChangeEx extends JFrame {
	private JLabel colorLabel;
	private JSlider [] sl = new JSlider[3];
	
	public SliderChangeEx() {
		setTitle("�����̴� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// ��� ���� ����
		colorLabel = new JLabel("��� ��");
		
		// �����̴� 3�� ����: R,G,B (0~255)
		for(int i=0; i<sl.length; i++) {
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			sl[i].setPaintLabels(true);  // ��� �Ʒ� �� ���ڸ� ��Ÿ��
			sl[i].setPaintTicks(true);  // ��� ������ ���̰� ��ĥ���ִ°�
			sl[i].setPaintTrack(true); 
			sl[i].setMajorTickSpacing(50); // �ֿ� ���� 50
			sl[i].setMinorTickSpacing(10); // ���� ���� 10
			// �� �����̴��� �̺�Ʈ ó��
			sl[i].addChangeListener(new MyChangeListener());
			c.add(sl[i]);
		}
		
		// ���� �� ���� �ʱ�ȭ
		sl[0].setForeground(Color.red);
		sl[1].setForeground(Color.green);
		sl[2].setForeground(Color.blue);
		
		// �⺻ �ʱ� �� ������ ���� ����
		int r = sl[0].getValue();
		int g = sl[1].getValue();
		int b = sl[2].getValue();
		
		// setOpaque => �ؾ� ������ ������ ���̰� ��!!!
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(r,g,b));
		c.add(colorLabel);
		setSize(300,300);
		setVisible(true);
	}
	
	class MyChangeListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			int r = sl[0].getValue();
			int g = sl[1].getValue();
			int b = sl[2].getValue();
			
			colorLabel.setBackground(new Color(r,g,b));
		}
	}

	public static void main(String[] args) {
		new SliderChangeEx();

	}

}
