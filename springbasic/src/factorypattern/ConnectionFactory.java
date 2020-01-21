package factorypattern;
public class ConnectionFactory {
	public Connection getConnection(String str) {
		// 사용자가 대문자로 입력할지 소문자로 입력할지 모르므로
		String url = str.toLowerCase();
		// 앞글자가 oracle이면 오라클 객체 생성해서 리턴
		if (url.indexOf("oracle") >= 0) {
			return new OracleConnection(url);
		} else if (url.indexOf("mysql") >= 0) {
			return new MySQLConnection(url);
		} else if (url.indexOf("mongo") >= 0) {
			return new MongoConnection(url);
		} else {
			return null;
		}
	} 	
}
