package ch16.sec01;

@FunctionalInterface //함수형 인터페이스로 사용하겠다라고 지정(선택사항)
public interface Calculable {
    void calculate(int x, int y);
}
