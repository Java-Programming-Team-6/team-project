package team;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;

public class DictionaryGUI_2 extends JFrame {
	
	public DictionaryGUI_2()
	{
		this.setTitle("���ڻ���");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container frame = getContentPane();
		frame.setLayout(null);
		frame.setBackground(Color.white);
		
		
		JTextField textfield = new JTextField("�˻��� �ܾ �Է��ϼ���");
		textfield.setFont(new Font("�����ý��丮", Font.PLAIN, 12));
		textfield.setEnabled(false);
		textfield.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				textfield.setEnabled(true);
				textfield.setText("");
			}
		});
		
		textfield.setSize(200, 25);
		textfield.setLocation(50, 100);
		
		ImageIcon glassImg = new ImageIcon(DictionaryGUI_2.class.getResource("/team/�����������.PNG"));
		JLabel glassLabel = new JLabel(glassImg);
		glassLabel.setSize(100, 50);
		glassLabel.setLocation(100, 20);
		
		
		
		ImageIcon clockImg = new ImageIcon(DictionaryGUI_2.class.getResource("/team/�򺥾�����.PNG"));
		JLabel clockLabel = new JLabel(clockImg);
		clockLabel.setSize(50, 90);
		clockLabel.setLocation(220, 0);
		
		ImageIcon freeImg = new ImageIcon(DictionaryGUI_2.class.getResource("/team/���Ż������.PNG"));
		JLabel freeLabel = new JLabel(freeImg);
		freeLabel.setSize(50, 90);
		freeLabel.setLocation(250, 5);
		
		ImageIcon houseImg = new ImageIcon(DictionaryGUI_2.class.getResource("/team/������Ͽ콺������.PNG"));
		JLabel houseLabel = new JLabel(houseImg);
		houseLabel.setSize(75, 90);
		houseLabel.setLocation(294, 25);
		
		ImageIcon micImg = new ImageIcon(DictionaryGUI_2.class.getResource("/team/����ũ������.PNG"));
		JLabel micLabel = new JLabel(micImg);
		//micLabel.setSize(75, 90);
		//micLabel.setLocation(325, 0);
		
		
		
		
		JLabel label5 = new JLabel("�������");
		label5.setFont(new Font("CookieRun Black", Font.PLAIN, 24));
		//label0.setFont(new Font("������������� ExtraBold", Font.PLAIN, 24));
		label5.setBackground(Color.BLACK);
		label5.setForeground(Color.black);
		label5.setSize(100, 50);
		label5.setLocation(50, 20);
		
		JLabel label6 = new JLabel("ENGLISH DICTIONARY FOR TOEIC");
		label6.setFont(new Font("�����ý��丮", Font.PLAIN, 10));
		//label0.setFont(new Font("������������� ExtraBold", Font.PLAIN, 24));
		label6.setBackground(Color.BLACK);
		label6.setForeground(Color.black);
		label6.setSize(200, 25);
		label6.setLocation(50, 60);
		
		
		JLabel label1 = new JLabel("�˻��� �ܾ� : ");
		label1.setFont(new Font("�����ý��丮", Font.PLAIN, 12));
		//label1.setFont(new Font("������������� ExtraBold", Font.PLAIN, 12));
		
		JLabel label2 = new JLabel("\n");
		label2.setFont(new Font("�����ý��丮", Font.PLAIN, 12));
		//label2.setFont(new Font("������������� ExtraBold", Font.PLAIN, 12));
		JLabel label3 = new JLabel("�� : ");
		label3.setFont(new Font("�����ý��丮", Font.PLAIN, 12));
		//label3.setFont(new Font("������������� ExtraBold", Font.PLAIN, 12));
		
		JLabel label4 = new JLabel("\n");
		label4.setFont(new Font("�����ý��丮", Font.PLAIN, 12));
		//label4.setFont(new Font("������������� ExtraBold", Font.PLAIN, 12));

		JButton button1 = new JButton();
		button1.add(glassLabel);
		button1.setLocation(275, 97);
		button1.setSize(50, 30);
		button1.setFont(new Font("�����ý��丮", Font.PLAIN, 12));
		//button1.setFont(new Font("������������� ExtraBold", Font.PLAIN, 12));
		button1.setBackground(Color.WHITE);
		button1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				label2.setText(textfield.getText());
				label4.setText(textfield.getText());
			}
		});
		textfield.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				label2.setText(textfield.getText());
				label4.setText(textfield.getText());
				textfield.setText("");
			}
		});
		JButton button2 = new JButton("�̱��Ģ�");
		button2.setFont(new Font("�����ý��丮", Font.PLAIN, 12));
		//button2.setFont(new Font("������������� ExtraBold", Font.PLAIN, 12));
		//button2.add(micLabel);
		button2.setBackground(Color.ORANGE);
		JButton button3 = new JButton("�����Ģ�");
		button3.setFont(new Font("�����ý��丮", Font.PLAIN, 12));
		//button3.setFont(new Font("������������� ExtraBold", Font.PLAIN, 12));
		//button3.add(micLabel);
		button3.setBackground(Color.ORANGE);
		JButton button4 = new JButton("ȣ�ֽĢ�");
		button4.setFont(new Font("�����ý��丮", Font.PLAIN, 12));
		//button4.setFont(new Font("������������� ExtraBold", Font.PLAIN, 12));
		//button4.add(micLabel);
		button4.setBackground(Color.ORANGE);
		
		JPanel panel1 = new JPanel();
		panel1.setLocation(20, 150);
		panel1.setSize(350, 200);
		panel1.setBackground(Color.WHITE);
		panel1.setLayout(null);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.WHITE);
		panel2.add(label1);
		label1.setSize(100, 20);
		label1.setLocation(20, 5);
		panel2.add(label2);
		label2.setSize(100, 20);
		label2.setLocation(90, 5);
		
		JPanel panel3 = new JPanel();
		panel3.add(label3);
		panel3.setLayout(null);
		panel3.setBackground(Color.WHITE);
		label3.setSize(100, 20);
		label3.setLocation(20, 5);
		panel3.add(label4);
		label4.setSize(100, 20);
		label4.setLocation(45, 5);
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.WHITE);
		panel4.add(button2);
		panel4.add(button3);
		panel4.add(button4);
		
		panel1.add(panel2);
		panel2.setBounds(25, 25, 300, 30);
		panel1.add(panel3);
		panel3.setBounds(25, 60, 300, 30);
		panel1.add(panel4);
		panel4.setBounds(25, 120, 300, 30);
		
		//frame.add(micLabel);
		frame.add(houseLabel);
		frame.add(clockLabel);
		frame.add(freeLabel);
		frame.add(label5);
		frame.add(label6);
		frame.add(textfield);
		frame.add(panel1);
		frame.add(button1);
		this.setSize(400, 400);
		this.setLocation(550, 250);
		this.setVisible(true);
		
	}
}