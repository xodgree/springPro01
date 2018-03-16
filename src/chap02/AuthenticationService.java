package chap02;

public class AuthenticationService {
	private UserRepository userRepository;
	private AuthFailLogger failLogger;
	public AuthInfo authenticate(String id, String password) {
		User user = userRepository.findUserById(id);
		if(user == null)
			throw new UserNotFoundException();
		
		if(!user.matchPassword(password)) {
			failLogger.insertBadPw(id, password);
			throw new AuthException();
		}else {
			System.out.println("ok--->"+id+": "+password);
		}
		return new AuthInfo(user.getId());
	}
	//set�޼��带 �̿��ؼ� �ʿ��� ���� ���޹޴´�.(������Ƽ ���� ���)
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	public void setFailLogger(AuthFailLogger failLogger) {
		this.failLogger = failLogger;
	}
}
