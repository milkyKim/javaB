package ch10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

// ActionEvent�� ó���ϴ� �̺�Ʈ ������
public class MyActionListener implements ActionListener {

	@Override
	// ActionEvent�� �߻��ϸ� ȣ��Ǵ� �޼ҵ�
	public void actionPerformed(ActionEvent e) {
		// �����ʰ� �� ���� �ۼ�
		JButton b = (JButton) e.getSource(); // �̺�Ʈ �ҽ��� ���� -> �̺�Ʈ�� ��� �߻��ߴ���
		
		// ��ư�� ���ڿ��� �ѿ���ȯ�ϱ�
		if(b.getText().equals("KMJ")) {
			b.setText("�����");
		} else {
			b.setText("KMJ");
		}
	}

}
