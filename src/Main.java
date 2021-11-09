// 제네릭 클래스
/*
제네릭 클래스
class ClassName<E> {

    private E element;  //제네릭 타입 변수

    void set(E element) {  //제네릭 파라미터 메소드
        this.element = element;
    }

    E get() { // 제네릭 타입 반환 메소드
        return element;
    }
}
*/

/*
제네릭을 두개 사용한 클래스
class ClassName<K, V> {
    private K first;  // K 타입(제네릭)
    private V second; // V 타입(제네릭)

    void set(K first, V second) {
        this.first = first;
        this.second = second;
    }

    K getFirst() {
        return  first;
    }

    V getSecond() {
        return  second;
    }


}
*/

//제네릭 메서드 사용
class ClassName<E> {

    private E element; //제네릭 타입 변수

    void set(E element) {  //제네릭 파라미터 메소드
        this.element = element;
    }

    E get() { //제네릭 타입 반환 메소드
        return element;
    }

    <T> T genericMethod(T o) {  //제네릭 메소드
        return o;
    }

}



//메인 클래스
public class Main {
    public static void main(String[] args) {

/*
        //제네릭 클래스를 사용한 main
        ClassName<String> a = new ClassName<String>();
        ClassName<Integer> b = new ClassName<Integer>();

        a.set("10");
        b.set(10);

        System.out.println("a data : " + a.get());
        //반환된 변수의 타입 출력
        System.out.println("a E Type : " + a.get().getClass().getName());

        System.out.println();

        System.out.println("b data " + b.get());
        //반환된 변수의 타입 출력
        System.out.println("b E Type " + b.get().getClass().getName());
*/

/*
        // 제네릭을 두개 사용한 클래스의 메인
        ClassName<String, Integer> a = new ClassName<String, Integer>();

        a.set("10", 10);

        System.out.println("first data : " + a.getFirst());
        //반환된 변수의 타입 출력
        System.out.println("K Type : " + a.getFirst().getClass().getName());

        System.out.println("second data : " + a.getSecond());
        //반환된 변수의 타입 출력
        System.out.println("V Type : " + a.getSecond().getClass().getName());
*/

        ClassName<String> a = new ClassName<String>();
        ClassName<Integer> b = new ClassName<Integer>();

        a.set("10");
        b.set(10);

        System.out.println("a data : " + a.get());
        //반환된 변수의 타입 출력
        System.out.println("a E Type : " + a.get().getClass().getName());

        System.out.println();

        System.out.println("b data : " + b.get());
        //반환된 변수의 타입 출력
        System.out.println("b E Type : " + b.get().getClass().getName());

        System.out.println();

        //제네릭 메소드 Integer
        System.out.println("<T> return Type : " + a.genericMethod(3).getClass().getName());

        //제네릭 메소드 String
        System.out.println("<T> return Type : " + a.genericMethod("ABCD").getClass().getName());

        //제네릭 메소드 ClassName b
        System.out.println("<T> return Type : " + a.genericMethod(b).getClass().getName());
    }
}
