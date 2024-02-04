package main;

import java.time.LocalDate;

public class Duck extends Animal{
    public Duck(String nickname, Owner owner, LocalDate birthDate, Illness ilness) {
        super(nickname, owner, birthDate, ilness);
    }
    public static void duckmovement() {
        swim();
        fly();
        go();
    }

}
