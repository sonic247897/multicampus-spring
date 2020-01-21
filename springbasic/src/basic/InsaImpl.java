package basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	// 0. 직접 new에서 생성 - 클래스에서 멤버변수(dao)를 선언과 초기화를 같이 함
	// 		=>결합도가 높아 쓰지 않는다!
	// 		=>보통 사용하는 쪽(외부)에서 new로 생성해서 사용-생성자, setter메소드 구현
	// dao = new MemberDAO();

	// 1. 생성자를 이용해서 작업
	public InsaImpl() { //기본생성자
		
	}	
	
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
	}
	
	// 2. setter메소드를 이용해서 작업하는 방법
	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}
	
	
	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);		
	}


	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

}
