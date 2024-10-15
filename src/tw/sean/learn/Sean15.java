package tw.sean.learn;

import javax.swing.JFrame;

import java.awt.FlowLayout;

import javax.swing.JButton;

public class Sean15 extends JFrame {
	private JButton b1,b2,b3;
	
	public Sean15() {
		b1 = new JButton("1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
		
		setLayout(new FlowLayout());
		add(b1); add(b2); add(b3);
		
		
		
		
		setSize(640,480); //設定長寬
		setVisible(true);//看到
		setDefaultCloseOperation(EXIT_ON_CLOSE); //關閉離開
		
	}

	public static void main(String[] args) {
		new Sean15();
	

	}

}
