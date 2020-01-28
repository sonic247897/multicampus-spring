package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		
		// 공유데이터 저장
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=9; ++i) {
			sb.append("9*"+i+"="+9*i+"<br/>");
		}
		mav.addObject("gugu", sb);
		
		// forward할 뷰의 정보를 정의 - 기본이 forward
		mav.setViewName("/WEB-INF/test/result.jsp");
		
		return mav;
	}

}
