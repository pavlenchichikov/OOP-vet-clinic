package Core.patients.Impl;

public interface Swimmable {
    void swim();
    default double getSwimSpeed() {
        return 10;
    }
}
