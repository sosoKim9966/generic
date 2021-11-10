# generic

>데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 방법

```
ArrayList<Integer> list1 = new ArrayList<Integer>();
ArrayList<String> list2 = new ArrayList<String>();

LinkedList<Double> list3 = new LinkedList<Double>();
LinkedList<Character> list4 = new LikedList<Character>();

```


<> 괄호 안에 들어가는 타입을 지정해준다.

---

### 제네릭은 **클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것.**

특정타입을 미리 지정해주는 것이 아닌 필요에 의해 지정할 수 있도록 하는 일반(Generic) 타입이라는 것.

- _사실, 지정된다는 것 보다는 타입의 경계를 지정하고, **컴파일 때** 해당 타입으로 캐스팅하여 매개변수화 된 유형을 삭제하는 것._

---

##제네릭의 장점

1. 제네릭을 사용하면 잘못된 타입이 들어올 수 있는 것을 컴파일 단계에서 방지할 수 있다.
2. 클래스 외부에서 타입을 지정해주기 때문에 따로 타입을 체크하고 변환해줄 필요가 없음. = 관리하기 편함
3. 비슷한 기능을 지원하는 경우 코드의 재사용성이 높아짐.

---

##제네릭 사용법

타입|설명
:------:|:------------:
 \< T \> |Type
 \< E \> |Element
 \< K \> |Key
 \< V \> |Value
 \< N \> |Number

---

###1. 클래스, 인터페이스 선언

&nbsp;

```

public class ClassName <T> { ... }
public Interface InterfaceName <T> { ... }

```

T 타입은 해당 블럭 { ...  } 안에서까지 유효

&nbsp;

제네릭 타입을 두 개로 둘 수 있음. (대표적으로 타입 인자로 두 개 받는 HashMap)

```

public class ClassName<T, K> { .. }
public Interface InterfaceName <T, K> { ... }

//HashMap 의 경우 아래와 같이 선언되었을 것
public Class HashMap<K, V> { ... }

```

이렇듯 데이터 타입을 외부로부터 지정할 수 있도록 할 수 있음.

```

public class ClassName<T, K> { ... }

public Class Main {
    public static void main(String[] args) {
        className<String, Integer> a = new ClassName<String, Integer>();
    }
}

```
&nbsp;

&nbsp;

위의 예시대로라면 T = String, K = Integer

주의해야 할 점은 타입 파라미터로 명시 할 수 있는 것은 참조 타입(Reference Type)밖에 올 수 없다. 즉, int, double, char 같은 primitive type은 올 수 없다.
그래서 int형 double형 등 primitive Type의 경우 Integer, Double 같은 Wrapper Type으로 쓰는 이유가 바로 위와 같은 이유.

또한 바꿔 말하면 참조 타입이 올 수 있다는 것은 사용자가 정의한 클래스도 타입으로 올 수 있다는 뜻.

&nbsp;

```

public class ClassName<T> { ... }

public class Student { ... }
 
public class Main {
    public static void main(String[] args) {
        ClassName<Student> a = new ClassName<Student>();
    }
}

```

&nbsp;

&nbsp;

---

###2. 제네릭 클래스

> **Main 클래스 참조**

&nbsp;

---

&nbsp;

&nbsp;

###3. 제네릭 메소드

선언 방법

&nbsp;

```

public <T> T genericMethod(T o) {
    ...
}

[접근제어자] <제네릭 타입> [반환타입] [메소드명]([제네릭타입] [파라미터]) {
    // 텍스트
}

```

**정적 메소드로 선언 할 때 필요**

&nbsp;

&nbsp;

---

&nbsp;

###제한된 Genric(제네릭)과 와일드 카드

&nbsp;

제네릭은 참조 타입 모두 될 수 있음.

만약 특정 범위 내로 좁혀서 제한하고 싶다면 extends, spuer, ?(와일드 카드 - 알수 없는 타입)를 사용

&nbsp;

```

<K extends T>  // T와 T의 자손 타입만 가능 (K는 들어오는 타입으로 지정 됨)
<K super T>    // T와 T의 부모(조상) 타입만 가능(K는 들어오는 타입으로 지정 됨)

<? extends T>  // T와 T의 자손 타입만 가능
<? extends T>  // T와 T의 부모(조상) 타입만 가능
<?>            // 모든 타입 가능. < ? extends Object>와 같은 의미

------------------------------------------------------------------------

/*
Number와 이를 상속하는 Integer, Short, Double, Long 등의
타입이 지정될 수 있으며, 객체 혹은 메소드를 호출할 경우
K는 지정된 타입으로 변환이 된다.
*/
<K extends N>

Number와 이를 상속하는 Integer, Short, Double, Long 등의
타입이 지정될 수 있으며, 객체 혹은 메소드를 호출 할 경우 지정 되는 타입이 없어
타입 참조를 할 수는 없다.
<? extends T>  // T와 T의 자손 타입만 가능

=> 특정 타입의 데이터를 조작하고자 할 경우에는 K 같이 특정 제네릭 인수로 지정 해주어야 함.

```


