package main.Animals;

import java.time.LocalDate;

public class Fish extends Animal implements Swimmable {
    public Fish(String nickname, Owner owner, LocalDate birthDate, Illness ilness) {
        super(nickname, owner, birthDate, ilness);
    }

    @Override
    public void eat() {
        System.out.println("Рыба ест");
    }

    @Override
    public void swim() {

    }
}
    

