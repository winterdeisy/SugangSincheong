package _1010;

//데이터를 담는 그릇, 밸류 오브젝트
public class VLogin {
	
	private String id;
	private String password;
	private String name;

	public VLogin() {
		// TODO Auto-generated constructor stub
	}

	//위의 변수들을 바꾸거나 읽을 때
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
