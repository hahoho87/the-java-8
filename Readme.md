# The Java8
## 1. 함수형 인터페이스와 람다 표현식
### 함수형 인터페이스(Functional Interface)
- 추상메서드를 하나만 가지고 있는 인터페이스
- SAM(Single Abstract Method) 인터페이스
- `@FunctionalInterface` 어노테이션을 가지고 있는 인터페이스

### 자바에서의 함수형 프로그래밍
- 함수를 First class object 로 사용 가능
- 순수 함수(pure function)
  - 사이드 이펙트 없음
  - 상태 없음
- 고차 함수(Higher-Order Function)
  - 함수가 함수를 매개변수로 받을 수 있고 함수 리턴 가능
- 불변성

### 자바에서 제공하는 함수형 인터페이스
#### Function<T, R>
- T 타입을 받아서 R 타입 리턴
  - R apply(T t)
- 함수 조합용 메서드
  - andThen (A -> B)
  - compose (B -> A)
  
#### BiFunction<T, U, R>
- T, U 두개의 값을 받아서 R 타입을 리턴
  - R apply(T t, U u)
  
#### Consumer<T>
- T 타입을 받는 void 리턴 함수 인터페이스
  - void Accept(T t)
  
#### Supplier<T>
- T 타입의 값을 리턴하는 함수 인터페이스
  - T get()
  
#### Predicate<T>
- T 타입을 받아서 boolean을 리턴하는 함수 인터페이스
  - boolean test(T t)
- 함수 조합용 메서드
  - And
  - Or
  - Negate
  
#### UnaryOperator<T>
- Function<T, R> 의 특수한 형태로 T 타입의 값을 받아서 T 타입의 값을 반환

#### BinaryOperator<T>
- BiFunction<T, U, R> 의 특수한 형태로 T 타입의 값 두 개를 받아서 T 타입의 값을 반환

#### 기타
- https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html