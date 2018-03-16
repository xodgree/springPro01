package chap02;
//사용자 정보를 보관하고, 암호 일치 여부(matchPassword)와 암호 변경 기능(changePassword)을 제공한다.
public class User {
	private String id;
	private String password;
	
	//생성자를 통해서 필요한 값을 전달받는다.(생성자 방식)
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
