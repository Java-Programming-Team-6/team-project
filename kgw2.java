package team;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;

public class kgw2 extends JFrame {
	
	public kgw2()
	{
		this.setTitle("전자사전");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color color = new Color(36, 36, 36);//글자색
		Color color1 = new Color(245, 245, 245);//배경색
		
		Container frame = getContentPane();
		frame.setLayout(null);
		
		JTextField textfield = new JTextField();
		textfield.setToolTipText("검색할 단어를 입력하세요");
		textfield.setBounds(100, 85, 400, 90);
		
		JLabel label1 = new JLabel("단어 뜻");
		label1.setLocation(150, 200);
		label1.setSize(300, 50);

		JButton button1 = new JButton("검색하기");
		button1.setLocation(550, 100);
		button1.setSize(100, 50);
		button1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				label1.setText(textfield.getText());
			}
		});
		JButton button2 = new JButton("발음듣기");
		button2.setLocation(100, 300);
		button2.setSize(100, 50);
		JButton button3 = new JButton("발음듣기");
		button3.setLocation(250, 300);
		button3.setSize(100, 50);
		JButton button4 = new JButton("발음듣기");
		button4.setLocation(400, 300);
		button4.setSize(100, 50);
		
		frame.add(textfield);
		frame.add(label1);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		this.setSize(700, 500);
		this.setLocation(550, 250);
		this.setVisible(true);
		
	}
}
