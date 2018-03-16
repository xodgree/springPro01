package chap02;

public class AuthFailLogger {
	private int threshold;
	private int failCounts;
	
	public void insertBadPw(String userId, String inputPw) {
		System.out.printf("AuthFail [type=badpw,userid=%s, pw=%s]\n",userId,inputPw);
		failCounts++;
		if(threshold > 0 && failCounts > threshold) {
			notifyTooManyFail();
			failCounts = 0;
		}
	}
	private void notifyTooManyFail() {
		System.out.println("�ʹ� ���� �α��� �õ� ����");
	}
	public void setThreshold(int thresold) {
		this.threshold = thresold;
	}
}
