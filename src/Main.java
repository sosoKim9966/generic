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
/*
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
*/

/*

//static 제네릭 메서드 오류 예시
class ClassName<E> {

*/
/*
    클래스와 같은 E 타입이더라도
    static 메소드는 객체가 생성되기 이전 시점에
    메모리에 먼저 올라가기 때문에
    E 유형을 클래스로부터 얻어올 방법이 없다.
*//*


*/
/*
    static E genericMethod(E o) {  => Error
        return o;
    }
*//*
}
*/

//스테틱 제네릭 메서드 사용 예시
class ClassName<E> {

    private E element; //제네릭 변수 타입

    void set(E element) { //제네릭 파라미터 메소드
        this.element = element;
    }

    E get() { //제네릭 타입 반환 메소드
        return element;
    }

    //아래 메소드의 E타입은 제네릭 클래스의 E타입과 다른 독립적인 타입이다.
    static <E> E genericMethod1(E o) { //제네릭 메소드
        return o;
    }

    static <T> T genericMethod2(T o) { //제네릭 메소드
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

/*
        //제네릭 클래스 + 메소드 예시
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

        ==> 클래스에서 지정한 제네릭 유형과 별도로 메소드에서 독립적으로 제네릭 유형을 선언하여 쓸 수 있다. => 정적 메소드로 선언 할 때 필요!
*/

/*
        //static 제네릭 메서드 오류 예시
        ClassName 객체가 생성되기 전에 접근할 수 있으나 유형을 지정할 방법이 없기에 에러가 남
        ClassName.getGnericMethod(3);

        ==> 제네릭이 사용되는 메소드를 정적메소드로 두고 싶은 경우 제네릭 클래스와 별도로 독립적인 제네릭이 사용되어야 함.
*/

/*
        //스테틱 제네릭 메서드 사용 예시
        ClassName<String> a = new ClassName<>();
        ClassName<Integer> b = new ClassName<>();

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

        //제네릭 메소드1 Integer
        System.out.println("<E> return Type : " + ClassName.genericMethod1(3).getClass().getName());

        //제네릭 메소드1 String
        System.out.println("<E> return Type : " + ClassName.genericMethod1("ABCD").getClass().getName());

        //제네릭 메소드2 ClassName a
        System.out.println("<T> return Type : " + ClassName.genericMethod2(a).getClass().getName());

        //제네릭 메소드2 Double
        System.out.println("<T> return Type : " + ClassName.genericMethod2(0.3).getClass().getName());


        ==>  제네릭 메소드는 제네릭 클래스 타입과 별도로 지정됨.
             <>괄호 안에 타입을 파라미터로 보내 제네릭 타입을 지정해주는 것.


*/



    }
}
