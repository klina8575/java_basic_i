package test.ch02;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		
		//안에서는 바깥 변수에 접근 가능, 바깥에서는 안의 변수의 접근 불가능.
		if (v1 > 10) {
			int v2 = v1 - 10;
		}
		
//		int v3 = v1 + v2 + 5;

	}

}
