package team;

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

public class dic extends JFrame{
	static JLabel title;//���ڻ��� ����
	static JLabel label;//ã�� ���� �ܾ� �Է�â
	static JLabel info;//�ܾ� �ǹ� ���
	Color color = new Color(36, 36, 36);//���ڻ�
	Color color1 = new Color(245, 245, 245);//����

	public dic() {
		setTitle("���ڻ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(1, 2));
		c.setBackground(color1);
		
		search searches = new search();
		c.add(searches, BorderLayout.EAST);//�˻� ��ư
		
		getword word = new getword();
		c.add(word, BorderLayout.WEST);//�⺻ ����â ���
		
		ButtonFrame button = new ButtonFrame();//���� ���� ��ưâ
		c.add(button, BorderLayout.SOUTH);


		setSize(900, 600);
		setVisible(true);
	}
	
	
	class getword extends JPanel{
		public getword() {
			setLayout(new GridLayout(3, 1));
			setBackground(color1);
			title = new JLabel("���� ���� ");
			info = new JLabel(" ã�� ���� �ܾ �Է��ϼ���..");
			label = new JLabel("");
			
			title.setFont(new Font("���� ���", 0, 15));
			title.setBackground(color);
			title.setForeground(color);
			title.setHorizontalAlignment(SwingConstants.LEFT);
		
			
			info.setFont(new Font("���� ���", 0, 30));
			info.setBackground(color);
			info.setForeground(color);
			info.setHorizontalAlignment(SwingConstants.CENTER);
			
			label.setFont(new Font("���� ���", 0, 20));
			label.setBackground(color);
			label.setForeground(color);
			label.setHorizontalAlignment(SwingConstants.LEFT);
			
			add(title);
			add(info);
			add(label);
		}
	}
	class search extends JPanel{//�˻� ��ưâ
		public search() {			
			JButton searchs;
			
			setBackground(Color.DARK_GRAY);
			setLayout(new GridLayout(1, 1));
			
			searchs = new JButton("�˻�");
			
			searchs.setFont(new Font("���� ���", 0, 25));
			searchs.setBackground(Color.DARK_GRAY);
			searchs.setForeground(Color.WHITE);
			add(searchs);
			dict handler = new dict();
			searchs.addActionListener(handler);
		}
		private class dict implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent event) {
				//�ܾ� ã��
				//�� ���
			}
		}
	}
	
	class ButtonFrame extends JPanel{//���� ��ư �Է�â
		public ButtonFrame() {
			JButton[] words = new JButton[4];//����

			setBackground(color1);
			setLayout(new GridLayout(1, 4, 5, 5));
			
			words[0] = new JButton("����");
			words[1] = new JButton("����");
			words[2] = new JButton("����");
			words[3] = new JButton("ĳ����");

			for(int i=0; i<4; i++)
			{
				words[i].setFont(new Font("���� ���", 0, 25));
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
				//�Ҹ� ���
			}
		}	
	}
	public static void dictionary(String wordss)//��&��� �����
	{
		JTextField textfield = new JTextField();
		JFrame frame = new JFrame();
		
		frame.add(textfield, BorderLayout.NORTH);
		
	}
	public static void main(String[] args) {//����
		new dic();
		dictionary("a");
	}
}
