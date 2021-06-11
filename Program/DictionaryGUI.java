package Dictionary;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.io.File;
import java.io.IOException;

public class DictionaryGUI extends JFrame {
	public DictionaryGUI() {
		FileIO.FileInputMap();
		System.setProperty("freetts.voices", "de.dfki.lt.freetts.en.us.MbrolaVoiceDirectory");
		System.setProperty("mbrola.base", "C:\\mbrola");
		
		this.setTitle("전자사전");
		
		Container frame = getContentPane();
		frame.setLayout(null);
		frame.setBackground(Color.DARK_GRAY);
		
		JTextField textfield = new JTextField("검색할 단어를 입력하세요");
		textfield.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		textfield.setEnabled(false);
		textfield.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				textfield.setEnabled(true);
				textfield.setText("");
			}
		});
		textfield.setSize(200, 25);
		textfield.setLocation(50, 100);
		
		ImageIcon glassImg = new ImageIcon("C:\\DictionaryData\\돋보기아이콘.png");
		JLabel glassLabel = new JLabel(glassImg);
		glassLabel.setSize(100, 50);
		glassLabel.setLocation(100, 20);
		
		ImageIcon clockImg = new ImageIcon("C:\\DictionaryData\\msClock2.png");
		JLabel clockLabel = new JLabel(clockImg);
		clockLabel.setSize(50, 90);
		clockLabel.setLocation(220, 0);
		
		ImageIcon freeImg = new ImageIcon("C:\\DictionaryData\\msFree2.png");
		JLabel freeLabel = new JLabel(freeImg);
		freeLabel.setSize(50, 90);
		freeLabel.setLocation(250, 15);
		
		ImageIcon houseImg = new ImageIcon("C:\\DictionaryData\\msHouse2.png");
		JLabel houseLabel = new JLabel(houseImg);
		houseLabel.setSize(75, 90);
		houseLabel.setLocation(290, 25);
		
		JLabel label1 = new JLabel("검색한 단어 : ");
		label1.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		
		JLabel label2 = new JLabel("\n");
		label2.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		
		JLabel label3 = new JLabel("뜻 : ");
		label3.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		
		JLabel label4 = new JLabel("\n");
		label4.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		
		JLabel label5 = new JLabel("영어사전");
		label5.setFont(new Font("CookieRun Black", Font.PLAIN, 24));
		label5.setBackground(Color.BLACK);
		label5.setForeground(Color.white);
		label5.setSize(100, 50);
		label5.setLocation(50, 20);
		
		JLabel label6 = new JLabel("ENGLISH DICTIONARY FOR TOEIC");
		label6.setFont(new Font("메이플스토리", Font.PLAIN, 10));
		label6.setBackground(Color.BLACK);
		label6.setForeground(Color.white);
		label6.setSize(200, 25);
		label6.setLocation(50, 60);

		JButton button1 = new JButton();
		button1.add(glassLabel);
		button1.setLocation(275, 97);
		button1.setSize(50, 30);
		button1.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		button1.setBackground(Color.WHITE);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				label2.setText(textfield.getText());
				label4.setText(FileIO.DataSearch(textfield.getText()));
			}
		});
		textfield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label2.setText(textfield.getText());
				label4.setText(FileIO.DataSearch(textfield.getText()));
			}
		});
		
		JButton button2 = new JButton("미국식♬");
		button2.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		button2.setBackground(Color.ORANGE);
		button2.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						DictionaryTTS tts = new DictionaryTTS("mbrola_us1");
						tts.say(label2.getText());
					}
				});
		
		JButton button3 = new JButton("영국식♬");
		button3.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		button3.setBackground(Color.ORANGE);
		button3.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						DictionaryTTS tts = new DictionaryTTS("mbrola_us3");
						tts.say(label2.getText());
					}
				});
		
		JButton button4 = new JButton("호주식♬");
		button4.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		button4.setBackground(Color.ORANGE);
		button4.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						DictionaryTTS tts = new DictionaryTTS("mbrola_us2");
						tts.playSound(label2);
					}
				});
		
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
		label4.setSize(200, 20);
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
		
		frame.add(houseLabel);
		frame.add(clockLabel);
		frame.add(freeLabel);
		frame.add(label5);
		frame.add(label6);
		frame.add(textfield);
		frame.add(panel1);
		frame.add(button1);
	}
}
