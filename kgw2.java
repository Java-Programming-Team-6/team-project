package team;

import java.awt.BorderLayout;
import java.awt.Dimension;
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
		this.setTitle("���ڻ���");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container frame = getContentPane();
		frame.setLayout(null);
		
		JTextField textfield = new JTextField();
		textfield.setToolTipText("�˻��� �ܾ �Է��ϼ���");
		textfield.setBounds(100, 85, 600, 90);
		
		JLabel label1 = new JLabel("�̱���");
		label1.setLocation(100, 200);
		label1.setSize(200, 50);
		JLabel label2 = new JLabel("������");
		label2.setLocation(100, 300);
		label2.setSize(200, 50);
		JLabel label3 = new JLabel("ȣ�ֽ�");
		label3.setLocation(100, 400);
		label3.setSize(200, 50);
		JLabel label4 = new JLabel("�̱��� ��");
		label4.setLocation(400, 200);
		label4.setSize(200, 50);
		JLabel label5 = new JLabel("������ ��");
		label5.setLocation(400, 300);
		label5.setSize(200, 50);
		JLabel label6 = new JLabel("ȣ�ֽ� ��");
		label6.setLocation(400, 400);
		label6.setSize(200, 50);
		
		JButton button1 = new JButton("�˻��ϱ�");
		button1.setLocation(710, 100);
		button1.setSize(100, 50);
		button1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				label1.setText(textfield.getText());
				label2.setText(textfield.getText());
				label3.setText(textfield.getText());
				label4.setText(textfield.getText());
				label5.setText(textfield.getText());
				label6.setText(textfield.getText());
			}
		});
		JButton button2 = new JButton("�������");
		button2.setLocation(710, 200);
		button2.setSize(100, 50);
		JButton button3 = new JButton("�������");
		button3.setLocation(710, 300);
		button3.setSize(100, 50);
		JButton button4 = new JButton("�������");
		button4.setLocation(710, 400);
		button4.setSize(100, 50);
		
		frame.add(textfield);
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(label6);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		this.setSize(900, 600);
		this.setLocation(550, 250);
		this.setVisible(true);
		
	}
}
