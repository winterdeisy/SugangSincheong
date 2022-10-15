package _1010;

public class PMainFrame {

	//연결되어야 하는 것, 메인화면 안에 로그인 화면이 존재
	private static PLogin pLogin;
	
	public PMainFrame() {
		this.pLogin = new PLogin();
		
	}

	public void show() {
		VLogin vLogin = this.pLogin.show();
		
	}

}
