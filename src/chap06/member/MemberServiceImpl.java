package chap06.member;

public class MemberServiceImpl implements MemberService{

	@Override
	public void regist(MemberRegRequest memberRegReq) {
		// TODO Auto-generated method stub
		System.out.println("MemberServiceImpl.regist() ȣ���");
	}

	@Override
	public boolean update(String id, UpdateInfo updateInfo) {
		// TODO Auto-generated method stub
		System.out.println("MemberServiceImpl.update()ȣ���");
		return true;
	}
	

}
