package Core.patients.Impl;

public interface Goable {
    void go();
    default double getRunSpeed() {
        return 10;
    }
}
