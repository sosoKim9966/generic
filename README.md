# generic

>데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 방법

```
ArrayList<Integer> list1 = new ArrayList<Integer>();
ArrayList<String> list2 = new ArrayList<String>();

LinkedList<Double> list3 = new LinkedList<Double>();
LinkedList<Character> list4 = new LikedList<Character>();

```
<> 괄호 안에 들어가는 타입을 지정해준다.

### 제네릭은 **클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것.**

특정타입을 미리 지정해주는 것이 아닌 필요에 의해 지정할 수 있도록 하는 일반(Generic) 타입이라는 것.

- _사실, 지정된다는 것 보다는 타입의 경계를 지정하고, **컴파일 때** 해당 타입으로 캐스팅하여 매개변수화 된 유형을 삭제하는 것._

---

제네릭의 장점

1. 제네릭을 사용하면 잘못된 타입이 들어올 수 있는 것을 컴파일 단계에서 방지할 수 있다.
2. 클래스 외부에서 타입을 지정해주기 때문에 따로 타입을 체크하고 변환해줄 필요가 없음. = 관리하기 편함
3. 비슷한 기능을 지원하는 경우 코드의 재사용성이 높아짐.

---

제네릭 사용법

|타입|설명|
|---|:------:|
|<T>|Type|
|<E>|Element|
|<K>|Key|
|<V>|Value|
|<N>|Number|