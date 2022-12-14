package _1010;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		//attributes
		
		//화면 사이즈를 가져옴
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(screenSize.width/2 - this.getWidth() / 2,20);
		
		this.setSize(400, 600);
		this.setTitle("명지대학교 수강신청 시스템");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//components
		LayoutManager layoutManager = new BorderLayout();
		this.setLayout(layoutManager);
		
		SugangsincheongPanel sugangsincheongPanel = new SugangsincheongPanel();
		this.add(sugangsincheongPanel, BorderLayout.CENTER); 
		
		LoginDialog loginPanel = new LoginDialog(this); 

		loginPanel.setVisible(true); 
		
	}

}
