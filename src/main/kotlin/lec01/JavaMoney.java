package lec01;

import org.jetbrains.annotations.NotNull;

public class JavaMoney implements Comparable<JavaMoney>{
    private final long amount;

    public JavaMoney(long amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(@NotNull JavaMoney o) {
        return Long.compare(this.amount, o.amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JavaMoney javaMoney = (JavaMoney) o;

        if (amount != javaMoney.amount) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (amount ^ (amount >>> 32));
    }
}
