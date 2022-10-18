package _1010;

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		//attributes
		this.setSize(400, 600);
		this.setTitle("명지대학교 수강신청 시스템");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LayoutManager layoutManager = new BorderLayout();
		this.setLayout(layoutManager);
		
		//components
		LoginPanel loginPanel = new LoginPanel();
		this.add(loginPanel, BorderLayout.NORTH); 
		
		SugangsincheongPanel sugangsincheongPanel = new SugangsincheongPanel();
		this.add(sugangsincheongPanel, BorderLayout.CENTER); 
	}

}
