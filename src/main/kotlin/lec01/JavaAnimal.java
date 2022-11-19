package lec01;

public abstract class JavaAnimal {
    // protected 는 같은 패키지에서는 default 와 같이 접근 제한이 없지만,
    // 다른 패키지에서는 자식 클래스만 접근을 허용한다.
    protected final String species;
    protected final int legCount;

    public JavaAnimal(String species, int legCount) {
        this.species = species;
        this.legCount = legCount;
    }

    abstract public void move();

    public String getSpecies() {
        return species;
    }

    public int getLegCount() {
        return legCount;
    }
}
