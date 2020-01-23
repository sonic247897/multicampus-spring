package di.setter.basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	
	public InsaImpl() {
		System.out.println("InsaImpl 기본생성자");
	}
	
	// 생성자나 setter메소드를 만들어야 개발자나 spring이 외부에서 값을 줄 수 있다.
	// Constructor Injection으로 MemberDAO객체를 주입받기 위해 필요
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("InsaImpl 매개변수 1개 생성자");
	}
	// setter Injection으로 MemberDAO객체를 주입받기 위해 setter메소드를 준비
	
	public MemberDAO getDao() {
		return dao;
	}
	
	
	public void setDao(MemberDAO dao) {
		System.out.println("setter메소드 호출");
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
