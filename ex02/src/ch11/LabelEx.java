package ch11;
import java.awt.*;
import javax.swing.*;

public class LabelEx extends JFrame {
	
	public LabelEx() {
		// �غ�
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// ������Ʈ ����
		JLabel la1 = new JLabel("����մϴ�");
		
		ImageIcon beauty = new ImageIcon("images/beauty.jpg");
		JLabel la2 = new JLabel(beauty);
		
		ImageIcon phone = new ImageIcon("images/normalIcon.gif");
		JLabel la3 = new JLabel("��������� ��ȭ�ؿ�", phone, SwingConstants.CENTER);
		
		// �ޱ�
		c.add(la1);
		c.add(la2);
		c.add(la3);
		
		// ������
		setSize(300,500);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx();
	}

}
