package tw.sean.learn;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import tw.sean.apis.GiftTable;

public class MyGift extends JFrame {
	private GiftTable giftTable;
	private JButton del;
	
	public MyGift() {
		super("伴手禮");
		
		setLayout(new BorderLayout());
		
		del = new JButton("DEL");
		JPanel top = new JPanel(new FlowLayout());
		top.add(del);
		add(top, BorderLayout.NORTH);
		
		giftTable = new GiftTable();
		
		JScrollPane jsp = new JScrollPane(giftTable);
		
		add(jsp,BorderLayout.CENTER);
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		del.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				giftTable.delRow();
				
			}
		});
	}

	public static void main(String[] args) {
		new MyGift();

	}

}
