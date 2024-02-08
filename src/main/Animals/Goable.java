package main.Animals;

public interface Goable {
    void go();
    default double getRunSpeed() {
        return 10;
    }
}
