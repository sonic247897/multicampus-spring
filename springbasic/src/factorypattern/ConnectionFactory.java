package factorypattern;
public class ConnectionFactory {
	public Connection getConnection(String str) {
		// ����ڰ� �빮�ڷ� �Է����� �ҹ��ڷ� �Է����� �𸣹Ƿ�
		String url = str.toLowerCase();
		// �ձ��ڰ� oracle�̸� ����Ŭ ��ü �����ؼ� ����
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
