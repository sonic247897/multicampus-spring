package front.fw;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 모든 요청이 FrontServlet을 통해 들어올 수 있도록 설정
@WebServlet(name="front", urlPatterns= {"*.do", "*.jsp", "*.html"}) // 서블릿 명을 정의
public class FrontServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 요청 정보를 분석해서 추출 - 어떤 path로 요청할지 ???
		// http://localhost:8088/frontcontroller/product/test.do처럼 
		// 중간에 이름 넣어도 가능
		System.out.println("요청받기");
		// /frontcontroller
		System.out.println("request.getContextPath()=> " 
								+request.getContextPath());
		// contextpath~ 나머지 요청된 주소
		System.out.println("request.getRequestURI()=> "
								+request.getRequestURI());
		// 내가 원하는 path=URI-ContextPath
		String contextPath = request.getContextPath();
		String requestURI = request.getRequestURI();
		String path = requestURI.substring(contextPath.length());
		System.out.println("path=> "+path); // /product/test.do
		
		//2. 추출한 요청 path로 등록되어 있는 실행할 클래스 정보를 찾아오는 작업
		// RequestMapping객체에 의뢰 => RequestMapping객체의 메소드를 호출하면
		//							실제 실행할 객체를 찾아서 리턴
		RequestMapping mappingObj = new RequestMapping();
		Action action = mappingObj.mapping(path); //다형성
		
		//3. Action객체의 메소드를 호출
		action.run(request, response);
		
		//4. run메소드의 실행결과를 받아서 응답view를 찾는다.
		
		//5. 응답view로 forward or redirect
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
