package hw02;

import java.awt.*;
import javax.swing.*;

public class hw09 extends JFrame {
	public hw09() {
		super("20161045 김민지"); //super -> 부모생성자 호출
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		Container c = getContentPane();
				
		c.setLayout(new BorderLayout()); 
		
		c.add(new NorthPanel(), BorderLayout.NORTH); 
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		
		setSize(350,350);
		setVisible(true);
	}
	
	class NorthPanel extends JPanel {
		public NorthPanel() {
			setBackground(Color.LIGHT_GRAY);
			setLayout(new FlowLayout());
			add(new JButton("열기"));
			add(new JButton("닫기"));
			add(new JButton("나가기"));	
		}
	}
	
	class SouthPanel extends JPanel {
		public SouthPanel() {
			setBackground(Color.YELLOW); 
			setLayout(new FlowLayout());
			add(new JButton("Word Input"));
			add(new JTextField(19));
		}
	}

	
	class CenterPanel extends JPanel {
		public CenterPanel() {
			setLayout(null); 
			
			
			for(int i=1; i<=10; i++) { 
				JLabel la = new JLabel("*");
				la.setLocation((int)(Math.random()*300)+1,(int)(Math.random()*200)+1); 
				la.setSize(20, 20); 
				la.setForeground(Color.RED);
				add(la); // 버튼을 컨텐트팬에 부착
			}
					
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new hw09();
	}

}
