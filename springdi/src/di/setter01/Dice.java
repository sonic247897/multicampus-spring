package di.setter01;
import java.util.Random;
public class Dice extends Random implements AbstractDice{
	// �⺻������ �߰�
	public Dice() {
		
	}
	
	public int getDiceValue(){
		// 1~6 �ֻ���
		return nextInt(6)+1;
	}
}
