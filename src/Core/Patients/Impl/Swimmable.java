package Core.Patients.Impl;

public interface Swimmable {
    void swim();
    default double getSwimSpeed() {
        return 10;
    }
}
