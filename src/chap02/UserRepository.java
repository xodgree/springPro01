package chap02;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
	
	private Map<String, User> userMap = new HashMap<>();
	
	public User findUserById(String id) {
		return userMap.get(id);
	}
	//set메서드를 이용해서 필요한 값을 전달받는다.(프로퍼티 설정 방식)
	public void setUsers(List<User> users) {
		for(User u:users)
			userMap.put(u.getId(), u);
	}
}
