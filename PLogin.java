package _1010;

import java.util.Scanner;

public class PLogin {

	//PLogin�� SLogin�� ����
	private SLogin sLogin;
	public PLogin() {
		this.sLogin = new SLogin();
	}

	public VLogin show() {
		System.out.print("���̵� �Է� �ϼ���: ");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.next(); //���̵�
		System.out.print("��й�ȣ�� �Է� �ϼ���: ");
		String password = scanner.next(); //��й�ȣ
		scanner.close();

		//sLogin���� id�� password�� �ְ� �α���, VLoginInfo�� ����
		VLogin vLogin = sLogin.login(id, password); 
		if(vLogin == null) {
			System.out.print("���̵� ���ų� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			
		}
		System.out.println("�α��� ����!");
		return vLogin;
		
	}

}