package _1010;

//��Ʈ�ѷ�, �𵨿��� �����͸� ��û��
public class SLogin {

	//�𵨰� ����
	private EAccount eAccount; 
	
	public SLogin() {
		this.eAccount = new EAccount();
	}

	public VLogin login(String id, String password) {
		//id�� password�� �ְ� �α��������� �޾ƿ�
		VLogin vLogin = this.eAccount.getLogin(id, password); 
		return vLogin;
	}

}
