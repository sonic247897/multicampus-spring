package di.setter01;
import java.util.Random;
public class Dice extends Random implements AbstractDice{
	// 기본생성자 추가
	public Dice() {
		
	}
	
	public int getDiceValue(){
		// 1~6 주사위
		return nextInt(6)+1;
	}
}
