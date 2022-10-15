package _1010;

import java.util.Scanner;

public class PLogin {

	//PLogin은 SLogin과 연결
	private SLogin sLogin;
	public PLogin() {
		this.sLogin = new SLogin();
	}

	public VLogin show() {
		System.out.print("아이디를 입력 하세요: ");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.next(); //아이디
		System.out.print("비밀번호를 입력 하세요: ");
		String password = scanner.next(); //비밀번호
		scanner.close();

		//sLogin에게 id와 password를 주고 로그인, VLoginInfo를 리턴
		VLogin vLogin = sLogin.login(id, password); 
		if(vLogin == null) {
			System.out.print("아이디가 없거나 비밀번호가 틀렸습니다.");
			
		}
		System.out.println("로그인 성공!");
		return vLogin;
		
	}

}