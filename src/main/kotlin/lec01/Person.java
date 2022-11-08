package lec01;

import org.jetbrains.annotations.NotNull;

public class Person {
    private final String name;


    public Person(String name) {
        this.name = name;
    }

    // 플랫폼 타입 : 다른 프로그래밍 언어에서 넘어온 타입들을 플랫폼 타입이라고 함.
    // Kotlin에서 Java 코드를 사용할 때 플랫폼 타입 사용에 유의해야한다.
    // 최대한 annotation을 활용해주자
    // @NotNull -> String
    // @Nullable -> String?
    // 없다면 -> String?
    @NotNull
    public String getName() {
        return name;
    }
}
