package ms01;


public class Sun implements Person{
	private String friend;
	
	public void bap() {
		System.out.println("?��미밥 ?��?�� ?��?��===> ?�� 빵이 좋아");
	}
	public void setFriend(String friend) {
		this.friend=friend;
	}
	public void getFriend() {
		System.out.println("?��?��?�� 친구"+friend+"?��?��?��");
	}
}
