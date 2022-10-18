package _1010;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private SLogin sLogin;
	private JTextField tfId;
	private JPasswordField tfPassword;
	
	public LoginPanel() {
		LayoutManager layoutManager = new GridLayout(3, 2);
		this.setLayout(layoutManager);
				
		//components
		JLabel lbId = new JLabel("아이디");
		this.add(lbId);
		
		this.tfId = new JTextField();
		this.tfId.setColumns(10);
		this.add(this.tfId);
		
		JLabel lbPassword = new JLabel("비밀번호");
		this.add(lbPassword);
		
		this.tfPassword = new JPasswordField();
		this.tfPassword.setColumns(10);
		this.add(this.tfPassword);
		
		JButton btLogin = new JButton("로그인");
		this.add(btLogin);
		
		ActionHandler actionHandler = new ActionHandler();
		btLogin.addActionListener(actionHandler);
		
		this.sLogin = new SLogin();
	}
	
	private void login() {
		String id = this.tfId.getText();
		String password = this.tfPassword.getText();

		VLogin vLogin = sLogin.login(id, password); 
		if(vLogin == null) {
			System.out.print("아이디가 없거나 비밀번호가 틀렸습니다.");
			
		}
	}
	private class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			login();
		}
		
	}

}
