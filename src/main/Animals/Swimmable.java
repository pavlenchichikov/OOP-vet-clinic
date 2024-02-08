package main.Animals;

public interface Swimmable {
    void swim();
    default double getSwimSpeed() {
        return 10;
    }
}
