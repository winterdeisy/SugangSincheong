package _1010;

//컨트롤러, 모델에서 데이터를 요청함
public class SLogin {

	//모델과 연결
	private EAccount eAccount; 
	
	public SLogin() {
		this.eAccount = new EAccount();
	}

	public VLogin login(String id, String password) {
		//id와 password를 주고 로그인정보를 받아옴
		VLogin vLogin = this.eAccount.getLogin(id, password); 
		return vLogin;
	}

}
