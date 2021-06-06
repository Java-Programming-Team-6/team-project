package team;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;

public class DictionaryGUI extends JFrame {
	
	public DictionaryGUI()
	{
		this.setTitle("전자사전");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color color = new Color(36, 36, 36);//글자색
		Color color1 = new Color(245, 245, 245);//배경색
		
		Container frame = getContentPane();
		frame.setLayout(null);
		frame.setBackground(Color.LIGHT_GRAY);
		
		
		JTextField textfield = new JTextField();
		textfield.setToolTipText("검색할 단어를 입력하세요");
		textfield.setSize(200, 25);
		textfield.setLocation(50, 50);
		//textfield.setBounds(100, 70, 400, 100);
		
		JLabel label1 = new JLabel("검색한 단어 : ");
		label1.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		//label1.setLocation(150, 200);
		//label1.setSize(300, 50);
		//label1.setForeground(Color.BLUE);
		
		JLabel label2 = new JLabel("\n");
		label2.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		JLabel label3 = new JLabel("뜻 : ");
		label3.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		
		JLabel label4 = new JLabel("\n");
		label4.setFont(new Font("메이플스토리", Font.PLAIN, 12));

		JButton button1 = new JButton("검색");
		button1.setLocation(275, 50);
		button1.setSize(75, 25);
		button1.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		button1.setBackground(Color.ORANGE);
		button1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				label2.setText(textfield.getText());
				label4.setText(textfield.getText());
			}
		});
		JButton button2 = new JButton("미국식♬");
		//button2.setLocation(100, 300);
		//button2.setSize(100, 50);
		button2.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		button2.setBackground(Color.ORANGE);
		JButton button3 = new JButton("영국식♬");
		//button3.setLocation(250, 300);
		//button3.setSize(100, 50);
		button3.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		button3.setBackground(Color.ORANGE);
		JButton button4 = new JButton("호주식♬");
		//button4.setLocation(400, 300);
		//button4.setSize(100, 50);
		button4.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		button4.setBackground(Color.ORANGE);
		
		JPanel panel1 = new JPanel();
		//panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		panel1.setLocation(20, 100);
		panel1.setSize(350, 250);
		panel1.setBackground(Color.WHITE);
		panel1.setLayout(null);
		
		JPanel panel2 = new JPanel();
		//panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
		
		panel2.add(label1);
		panel2.add(label2);
		JPanel panel3 = new JPanel();
		//panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
		
		panel3.add(label3);
		panel3.add(label4);
		JPanel panel4 = new JPanel();
		//panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));
		
		panel4.add(button2);
		panel4.add(button3);
		panel4.add(button4);
		
		panel1.add(panel2);
		panel2.setBounds(25, 25, 300, 30);
		panel1.add(panel3);
		panel3.setBounds(25, 55, 300, 65);
		panel1.add(panel4);
		panel4.setBounds(25, 120, 300, 155);
		
		frame.add(textfield);
		frame.add(panel1);
//		frame.add(label1);
		frame.add(button1);
//		frame.add(button2);
//		frame.add(button3);
//		frame.add(button4);
		this.setSize(400, 400);
		this.setLocation(550, 250);
		this.setVisible(true);
		
	}
}
