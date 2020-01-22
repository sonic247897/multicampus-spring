package di.constructor.basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	// 생성자나 setter메소드를 만들어야 개발자나 spring이 외부에서 값을 줄 수 있다.
	public InsaImpl(MemberDAO dao) {
		super();
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
