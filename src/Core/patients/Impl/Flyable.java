package Core.patients.Impl;

public interface Flyable {
    void fly();

    default double getFlySpeed() {
        return 10;
    }
}
