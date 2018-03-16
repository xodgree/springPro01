package chap02;
//����� ������ �����ϰ�, ��ȣ ��ġ ����(matchPassword)�� ��ȣ ���� ���(changePassword)�� �����Ѵ�.
public class User {
	private String id;
	private String password;
	
	//�����ڸ� ���ؼ� �ʿ��� ���� ���޹޴´�.(������ ���)
	public User(String id,String password) {
		this.id = id;
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public boolean matchPassword(String inputPasswd) {
		return password.equals(inputPasswd);
	}
	public void changePassword(String oldPassword, String newPassword) {
		if(!matchPassword(oldPassword))
			throw new IllegalArgumentException("illegal password");
		password = newPassword;
	}
}
