package di.constructor.basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	// �����ڳ� setter�޼ҵ带 ������ �����ڳ� spring�� �ܺο��� ���� �� �� �ִ�.
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
