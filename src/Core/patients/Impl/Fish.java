package Core.patients.Impl;

import Core.clients.Owner;
import Core.patients.Animal;
import Core.patients.Illness;

import java.time.LocalDate;

public class Fish extends Animal implements Swimmable, Huntable {
    public Fish(String nickname, Owner owner, LocalDate birthDate, Illness ilness) {
        super(nickname, owner, birthDate, ilness);
    }



    @Override
    public void swim() {

    }
}
    

