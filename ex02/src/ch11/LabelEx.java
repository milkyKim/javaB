package ch11;
import java.awt.*;
import javax.swing.*;

public class LabelEx extends JFrame {
	
	public LabelEx() {
		// 준비
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 컴포넌트 생성
		JLabel la1 = new JLabel("사랑합니다");
		
		ImageIcon beauty = new ImageIcon("images/beauty.jpg");
		JLabel la2 = new JLabel(beauty);
		
		ImageIcon phone = new ImageIcon("images/normalIcon.gif");
		JLabel la3 = new JLabel("보고싶으면 전화해요", phone, SwingConstants.CENTER);
		
		// 달기
		c.add(la1);
		c.add(la2);
		c.add(la3);
		
		// 마무리
		setSize(300,500);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx();
	}

}
