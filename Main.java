package _1010;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		//������ ������
//		JFrame mainFrame = new JFrame();
//		mainFrame.setBounds(100, 100, 1000, 500);
//		mainFrame.setTitle("�������б� ������û �ý���");
//		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFrame login = new JFrame();
		login.setBounds(400, 200, 380, 180);
		login.setTitle("�α���");
		login.setLayout(null);
		
		JLabel loginLabel = new JLabel("���̵�: ");
		loginLabel.setSize(80, 30);
		loginLabel.setLocation(30,30);
		loginLabel.setHorizontalAlignment(loginLabel.CENTER);
		
		login.add(loginLabel);
		
		JTextField loginText = new JTextField();
		loginText.setSize(130, 30);
		loginText.setLocation(110, 30);
		
		login.add(loginText);
		
		loginLabel = new JLabel("��й�ȣ: ");
		loginLabel.setSize(80, 30);
		loginLabel.setLocation(30,70);
		
		login.add(loginLabel);
		
		loginText = new JTextField();
		loginText.setSize(130, 30);
		loginText.setLocation(110, 70);

		login.add(loginText);
		
		login.setVisible(true);
		
		
		PMainFrame pMainFrame = new PMainFrame();
		pMainFrame.show();

	}
}
