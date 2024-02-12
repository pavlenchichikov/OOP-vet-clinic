package Core.Patients.Impl;

public interface Flyable {
    void fly();

    default double getFlySpeed() {
        return 10;
    }
}
