package ms01;


public class Daughter implements Person{
	private String friend;
	
	public void bap() {
		System.out.println("?��미밥 ?��?�� ?��?��===> ?�� ??�? 좋아 ");
	}
	public void setFriend(String friend) {
		this.friend=friend;
	}
	public void getFriend() {
		System.out.println("?��?�� 친구"+friend+"?��?��?��");
	}
}
