package Dictionary;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		DictionaryGUI gui = new DictionaryGUI();
		gui.setSize(400, 400);
		gui.setLocation(550, 250);
		gui.setVisible(true);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
