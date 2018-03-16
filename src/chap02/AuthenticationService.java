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
	//set메서드를 이용해서 필요한 값을 전달받는다.(프로퍼티 설정 방식)
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	public void setFailLogger(AuthFailLogger failLogger) {
		this.failLogger = failLogger;
	}
}
