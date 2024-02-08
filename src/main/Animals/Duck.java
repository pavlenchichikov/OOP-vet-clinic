package main.Animals;

import java.time.LocalDate;

public class Duck extends Animal implements Swimmable, Flyable, Goable {
    public Duck(String nickname, Owner owner, LocalDate birthDate, Illness ilness) {
        super(nickname, owner, birthDate, ilness);
    }

    @Override
    public void eat() {
        System.out.println("Утка ест");
    }


    @Override
    public void fly() {

    }

    @Override
    public void go() {

    }

    @Override
    public void swim() {

    }
}
