package _1010;

public class PMainFrame {

	//����Ǿ�� �ϴ� ��, ����ȭ�� �ȿ� �α��� ȭ���� ����
	private static PLogin pLogin;
	
	public PMainFrame() {
		this.pLogin = new PLogin();
		
	}

	public void show() {
		VLogin vLogin = this.pLogin.show();
		
	}

}
