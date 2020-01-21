package basic;
public class TestMain {
	public static void main(String[] args) {
		// 0. 직접 new에서 생성하므로 결합도가 높다. ->수정시 직접 고쳐야 할 부분이 많다.
		// Insa insa = new InsaImpl();
		
		// 1. 생성자를 호출하는 방식
		/*MemberDAO dao = new MemberDAO();
		Insa insa = new InsaImpl(dao);
		*/
		
		//2.setter메소드를 호출하는 방식
		MemberDAO dao = new MemberDAO();
		Insa insa = new InsaImpl();
		insa.setDao(dao);
		
		MemberDTO user = new MemberDTO("jang","1234","장동건");
		insa.addUser(user);

	}

}
