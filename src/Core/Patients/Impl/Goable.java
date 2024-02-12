package Core.Patients.Impl;

public interface Goable {
    void go();
    default double getRunSpeed() {
        return 10;
    }
}
