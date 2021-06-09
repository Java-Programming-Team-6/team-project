import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class DictionaryGUI extends JFrame {
	public DictionaryGUI() {
		System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
		this.setTitle("영어사전");
		
		Color color = new Color(36, 36, 36);		//글자색
		Color color1 = new Color(245, 245, 245);	//배경색
		
		Container frame = getContentPane();
		frame.setLayout(null);
		frame.setBackground(Color.LIGHT_GRAY);
		
		JTextField textfield = new JTextField();
		textfield.setToolTipText("검색할 단어를 입력하세요");
		textfield.setSize(200, 25);
		textfield.setLocation(50, 50);
		
		JLabel label1 = new JLabel("검색한 단어 : ");
		label1.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		
		JLabel label2 = new JLabel("\n");
		label2.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		JLabel label3 = new JLabel("검색 결과 : ");
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
		button2.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		button2.setBackground(Color.ORANGE);
		button2.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						DictionaryTTS tts = new DictionaryTTS("kevin16");
						tts.say(label4.getText());
					}
				});
		
		JButton button3 = new JButton("영국식♬");
		button3.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		button3.setBackground(Color.ORANGE);
		button3.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						DictionaryTTS tts = new DictionaryTTS("kevin16");
						tts.say(label4.getText());
					}
				});
		
		JButton button4 = new JButton("호주식♬");
		button4.setFont(new Font("메이플스토리", Font.PLAIN, 12));
		button4.setBackground(Color.ORANGE);
		button4.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						playSound();
					}
				});
		
		JPanel panel1 = new JPanel();
		panel1.setLocation(20, 100);
		panel1.setSize(350, 250);
		panel1.setBackground(Color.WHITE);
		panel1.setLayout(null);
		
		JPanel panel2 = new JPanel();
		
		panel2.add(label1);
		panel2.add(label2);
		JPanel panel3 = new JPanel();
		
		panel3.add(label3);
		panel3.add(label4);
		JPanel panel4 = new JPanel();
		
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
		frame.add(button1);
	}

static void playSound() {
		File file= new File("C:\\Users\\kbhkk\\Documents\\GitHub\\team-project\\MusicHozu\\" + textfield.getText() + ".wav");
		AudioInputStream audioInputStream = null;
		SourceDataLine auline = null;
		try {
			audioInputStream=AudioSystem.getAudioInputStream(file);
		}
		catch(UnsupportedAudioFileException e1) {
			e1.printStackTrace();
			return;
		}
		catch(IOException e1) {
			e1.printStackTrace();
			return;
		}
		AudioFormat format = audioInputStream.getFormat();
		DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
		try{
			auline = (SourceDataLine) AudioSystem.getLine(info);
			auline.open(format);
		}catch(LineUnavailableException e) {
			e.printStackTrace();
			return;
		}catch(Exception e)
		{
			e.printStackTrace();
			return;
		}
		auline.start();
		int nBytesRead = 0;
		final int EXTERNAL_BUFFER_SIZE=524288;
		byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];
		try {
			while(nBytesRead != -1 ) {
				nBytesRead = audioInputStream.read(abData, 0, abData.length);
				if(nBytesRead>=0)
					auline.write(abData, 0, nBytesRead);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
			return;}
		finally {
			auline.drain();
			auline.close();
		}
	}
}
