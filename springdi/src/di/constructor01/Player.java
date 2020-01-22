package di.constructor01;

// Player�� ���� �ִ� Dice�� �ܺο���(������ �����̳�) Injection�޾� ����ؾ��ϹǷ�
// Injection���� �� �ֵ��� �̸� �غ��ؾ� �Ѵ�.
// 		=> Constructor or Setter�޼ҵ�
public class Player implements AbstractPlayer{
	// ����Ÿ������ �޾ƾ� �ٸ�Ÿ�Ե� ���� �� �ִ� - ������
	// Dice d = new Dice();
	AbstractDice d;
	// ����Ÿ������ �޾ƾ� �ٸ�Ÿ�Ե� ���� �� �ִ� - ������
	public Player(AbstractDice d) {
		super();
		this.d = d;
	}
	
	// totalValue: ���α׷��� ����� �� �߻��ϴ� ���� ����ǹǷ� ��������� di ����X
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