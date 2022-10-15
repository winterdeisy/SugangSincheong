package _1010;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EAccount {
	//���� ��ī��Ʈ
	private String id;
	private String password;
	private String name;
	
	public EAccount() {
		// TODO Auto-generated constructor stub
	}

	public VLogin getLogin(String id, String password) {
		VLogin vLogin = null;
		try {
			File file = new File("data/account");
			Scanner scanner = new Scanner(file);
			// file read
			boolean found = false;
			while(scanner.hasNext() && !found) {  //������ �ְų� ��ã�Ұų�
				this.id = scanner.next();
				this.password = scanner.next();
				this.name = scanner.next();
				
				if(this.id.compareTo(id) == 0) {
					found = true;
				}
			}
			scanner.close(); //����ϰ� ���� close �ʼ�
			
			if(found) {
				vLogin = new VLogin(); 
				vLogin.setId(this.id);
				vLogin.setPassword(this.password);
				vLogin.setName(this.name);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return vLogin;
	}

}
