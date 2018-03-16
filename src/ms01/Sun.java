package ms01;


public class Sun implements Person{
	private String friend;
	
	public void bap() {
		System.out.println("?˜„ë¯¸ë°¥ ?‹«?–´ ?‹«?–´===> ?‚œ ë¹µì´ ì¢‹ì•„");
	}
	public void setFriend(String friend) {
		this.friend=friend;
	}
	public void getFriend() {
		System.out.println("?•„?“¤?˜ ì¹œêµ¬"+friend+"?…?‹ˆ?‹¤");
	}
}
