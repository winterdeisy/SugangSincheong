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
		super(parent, "LoginDialog", false); //modal
		this.setLocation(parent.getX()+30 , parent.getY()+30);
		this.setSize(430,300);
		
		LayoutManager layoutManager = new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS);
		this.setLayout(layoutManager);
		
		//타이틀
		JPanel Title = new JPanel();
		Title.setBackground(Color.yellow);
		this.add(Title);
		JLabel titleLabel = new JLabel("수강신청 시스템");
		titleLabel.setFont(new Font(null,Font.BOLD,25));
		Title.add(titleLabel);
		
		//아이디
		JPanel line1 = new JPanel();
		line1.setBackground(Color.pink);
		this.add(line1);
		JLabel lbId = new JLabel("아이디: ");
		JTextField tfId = new JTextField();
		tfId.setColumns(10);
		line1.add(lbId);
		line1.add(tfId);
		
		//비밀번호
		JPanel line2 = new JPanel();
		line2.setBackground(Color.blue);
		this.add(line2);
		JLabel lbPassword = new JLabel("비밀번호: ");
		JTextField tfPassword = new JTextField();
		tfPassword.setColumns(10);
		line2.add(lbPassword);
		line2.add(tfPassword);
		
		//버튼
		JPanel line3 = new JPanel();
		line3.setBackground(Color.green);
		this.add(line3);
		JButton btLogin = new JButton("로그인");
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
			// 아이디가 없거나 비밀번호가 틀렸습니다.
		}

	}
	private class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			login();
		}		
	}
}
