import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class dic extends JFrame {
	static JLabel title;//전자사전 제목
	static JLabel label;//찾고 싶은 단어 입력창
	static JLabel info;//단어 의미 출력
	Color color = new Color(36, 36, 36);//글자색
	Color color1 = new Color(245, 245, 245);//배경색

	public dic() {
		setTitle("전자사전");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(1, 2));
		c.setBackground(color1);
		
		search searches = new search();
		c.add(searches, BorderLayout.EAST);//검색 버튼
		
		getword word = new getword();
		c.add(word, BorderLayout.WEST);//기본 상태창 출력
		
		ButtonFrame button = new ButtonFrame();//나라별 발음 버튼창
		c.add(button, BorderLayout.SOUTH);


		setSize(900, 600);
		setVisible(true);
	}
	
	
	class getword extends JPanel {
		public getword() {
			setLayout(new GridLayout(3, 1));
			setBackground(color1);
			title = new JLabel("전자 사전 ");
			info = new JLabel(" 찾고 싶은 단어를 입력하세요..");
			label = new JLabel("");
			
			title.setFont(new Font("맑은 고딕", 0, 15));
			title.setBackground(color);
			title.setForeground(color);
			title.setHorizontalAlignment(SwingConstants.LEFT);
		
			
			info.setFont(new Font("맑은 고딕", 0, 30));
			info.setBackground(color);
			info.setForeground(color);
			info.setHorizontalAlignment(SwingConstants.CENTER);
			
			label.setFont(new Font("맑은 고딕", 0, 20));
			label.setBackground(color);
			label.setForeground(color);
			label.setHorizontalAlignment(SwingConstants.LEFT);
			
			add(title);
			add(info);
			add(label);
		}
	}
	class search extends JPanel {//검색 버튼창
		public search() {			
			JButton searchs;
			
			setBackground(Color.DARK_GRAY);
			setLayout(new GridLayout(1, 1));
			
			searchs = new JButton("검색");
			
			searchs.setFont(new Font("맑은 고딕", 0, 25));
			searchs.setBackground(Color.DARK_GRAY);
			searchs.setForeground(Color.WHITE);
			add(searchs);
			dict handler = new dict();
			searchs.addActionListener(handler);
		}
		private class dict implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent event) {
				//단어 찾기
				//뜻 출력
			}
		}
	}
	
	class ButtonFrame extends JPanel {//발음 버튼 입력창
		public ButtonFrame() {
			JButton[] words = new JButton[4];//발음

			setBackground(color1);
			setLayout(new GridLayout(1, 4, 5, 5));
			
			words[0] = new JButton("미국식");
			words[1] = new JButton("영국식");
			words[2] = new JButton("호주식");
			words[3] = new JButton("캐나다식");

			for(int i=0; i<4; i++)
			{
				words[i].setFont(new Font("맑은 고딕", 0, 25));
				words[i].setBackground(Color.DARK_GRAY);
				words[i].setForeground(Color.WHITE);
				add(words[i]);
				ButtonHandler handler = new ButtonHandler();
				words[i].addActionListener(handler);
			}

		}
		
		private class ButtonHandler implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent event)
			{
				//소리 출력
			}
		}	
	}
	public static void dictionary(String wordss)//입&출력 만들기
	{
		JTextField textfield = new JTextField();
		JFrame frame = new JFrame();
		
		frame.add(textfield, BorderLayout.NORTH);
		
	}
	public static void main(String[] args) {//실행
		new dic();
		dictionary("a");
	}
}
