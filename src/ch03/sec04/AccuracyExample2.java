package ch03.sec04;

public class AccuracyExample2 {
	public static void main(String[] args) {
		//사과 문제의 개선코드
		int apple = 1;
		int totalPieces = apple * 10;
		int number = 7;

		double result = totalPieces - number; //10-7

		//정확한 실수의 값을 얻고싶으면 정수로 먼저 계산 후 실수로 변경
		System.out.println("10 조각에서 남은 양: " + result);
		System.out.println("사과 1개에서 남은 양: " + result/10);
	}
}