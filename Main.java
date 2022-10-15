package _1010;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Main {

	public static void main(String[] args) {
		//윈도우 껍데기
		JFrame mainFrame = new JFrame();
		JLabel label = new JLabel("아이디를 입력하세요: ");
		JTextArea textId = new JTextArea("id");
		textId.setSize(10, 4); //높이
		mainFrame.add(label);
		mainFrame.add(textId);
		mainFrame.setSize(500,500);
		mainFrame.setVisible(true);
		
		
		PMainFrame pMainFrame = new PMainFrame();
		pMainFrame.show();

	}
}
