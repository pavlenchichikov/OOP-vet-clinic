package Core.Patients.Impl;

import Core.Clients.Owner;
import Core.Patients.Animal;
import Core.Patients.Illness;

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
    

