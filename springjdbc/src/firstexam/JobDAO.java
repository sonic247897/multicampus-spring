package firstexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

// hr계정의 job테이블을 제어하는 DAO클래스
@Repository("jobdao")
public class JobDAO {
	@Autowired
	JdbcTemplate mytemplate;
	
	// job테이블의 레코드 개수를 리턴하는 메소드
	public int count() {
		return mytemplate.queryForObject("select count(*) from jobs", 
									Integer.class);
	}
}
