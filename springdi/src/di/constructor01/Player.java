package di.constructor01;

// Player가 갖고 있는 Dice를 외부에서(스프링 컨테이너) Injection받아 사용해야하므로
// Injection받을 수 있도록 미리 준비해야 한다.
// 		=> Constructor or Setter메소드
public class Player implements AbstractPlayer{
	// 상위타입으로 받아야 다른타입도 받을 수 있다 - 다형성
	// Dice d = new Dice();
	AbstractDice d;
	// 상위타입으로 받아야 다른타입도 받을 수 있다 - 다형성
	public Player(AbstractDice d) {
		super();
		this.d = d;
	}
	
	// totalValue: 프로그램이 실행될 때 발생하는 값이 연결되므로 멤버변수라도 di 적용X
	int totalValue=0;
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	public int getTotalValue(){
		return totalValue;
	}
}