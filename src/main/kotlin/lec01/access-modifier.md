# Java와 코틀린의 가시성제어

## Java
- public : 모든 곳에서 접근 가능
- protected : 같은 패키지 또는 하위클래스에서만 접근 가능
- default : 같은 패키지에서만 접근 가능
- private : 선언된 클래스 내에서만 접근 가능

## Kotlin
- public : 모든 곳에서 접근 가능
- protected : **선언된 클래스** 또는 하위 클래스에서만 접근 가능
- internal : 같은 모듈에서만 접근 가능
- private : 선언된 클래스 내에서만 접근 가능


### 여러가지
- Java의 기본 접근 지시어는 default
- Kotlin의 기본 접근 지시어는 public

- 코틀린은 .kt 파일에 변수, 함수, 클래스 여러개를 바로 만들 수 있다.

- internal은 바이트 코드 상 public이 된다.
-> 때문에 Java 코드에서는 Kotlin 모듈의 internal 코드를 가져올 수 있다.

- Kotlin의 protected와 Java의 protected는 다르다.
-> Java는 같은 패키지의 Kotlin protected 멤버에 접근할 수 있다.







