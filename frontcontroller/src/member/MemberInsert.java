package member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import front.fw.Action;

// /member/customer/insert.do로 요청하면 실행할 클래스
public class MemberInsert implements Action {
	@Override
	public void run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청정보 추출해서 dao의 insert메소드를 호출(서블릿 대신 작동하는 일반 자바 클래스)
		System.out.println("회원가입 실행하기");
	}
}
