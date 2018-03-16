package chap02;

public class PasswordChangeService {
	private UserRepository userRepository;
	
	//생성자를 통해서 필요한 값을 전달받는다.(생성자 방식)
	public PasswordChangeService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	public void changePassword(String userId, String oldPw, String newPw) {
		User user = userRepository.findUserById(userId);
		if(user == null)
			throw new UserNotFoundException();
		
		user.changePassword(oldPw, newPw);
		System.out.println("changePassword"+":"+newPw);
	}
}
