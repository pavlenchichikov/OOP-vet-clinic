package main;

import java.time.LocalDate;

public class Fish extends Animal{
    public Fish(String nickname, Owner owner, LocalDate birthDate, Illness ilness) {
        super(nickname, owner, birthDate, ilness);
    }

    public static void swim() {
        System.out.println("плавает");

    }
    
}
