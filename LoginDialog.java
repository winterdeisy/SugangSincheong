package _1010;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginDialog extends JDialog {
	private static final long serialVersionUID = 1L;

	private JTextField tfId;
	private JPasswordField tfPassword;
	
	private SLogin sLogin;
	
	public LoginDialog(Frame parent) { 
		super(parent, "LoginDialog", true); //modal
		this.setLocation(parent.getX()+30 , parent.getY()+30);
		this.setSize(200,300);
		
		//Box Layout : ���μ����� y������ �ϳ��� �ٰ� �ϱ�
		LayoutManager layoutManager1 = new FlowLayout();
		LayoutManager layoutManager2 = new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS);
		this.setLayout(layoutManager2);
		
		JPanel line1 = new JPanel();
		this.add(line1);
		JLabel lbId = new JLabel("���̵�: ");
		JTextField tfId = new JTextField();
		tfId.setColumns(10);
		line1.add(lbId);
		line1.add(tfId);
		
		JPanel line2 = new JPanel();
		this.add(line2);
		JLabel lbPassword = new JLabel("��й�ȣ: ");
		JTextField tfPassword = new JTextField();
		tfPassword.setColumns(10);
		line2.add(lbPassword);
		line2.add(tfPassword);
		
		JPanel line3 = new JPanel();
		this.add(line3);
		JButton btLogin = new JButton("�α���");
		line3.add(btLogin);
		
		ActionHandler actionHandler = new ActionHandler();
		btLogin.addActionListener(actionHandler);
		
		this.sLogin = new SLogin();
	}
	
	private void login() {
		String id = this.tfId.getText();
		String password = this.tfPassword.getText();
		
		VLogin vLogin = sLogin.login(id, password);
		if (vLogin == null) {
			// ���̵� ���ų� ��й�ȣ�� Ʋ�Ƚ��ϴ�.
		}

	}
	private class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			login();
		}		
	}
}
