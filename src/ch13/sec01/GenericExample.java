package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        //제네릭: 아직 정해지지 않은 타입에 대해 그때그때 다르게 정의 가능
        Box<String> box = new Box<>();
        box.content = "안녕하세요";
        String content = box.content;

        Box<Integer> box2 = new Box<>();
        box2.content = 10;
        int content2 = box2.content;


        //box.content = "문자열";
        //box.content = 1; //Integer타입
        //box.content = new Bottle();

        //String content = (String)box.content;
        //System.out.println(content);


    }
}
