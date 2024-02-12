package Core.patients.Impl;

import Core.clients.Owner;
import Core.patients.*;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimmable, Huntable {
    public Dog(String nickname, Owner owner, LocalDate birthDate, Illness ilness) {
        super(nickname, owner, birthDate, ilness); // сходи в родительсккий класс и вызови 4 параметра
    }

    public Dog() {
        super();
    }



    @Override
    public void go() {
        System.out.println("Собака бежит");

    }

    @Override
    public void swim() {
        System.out.println("Собака плывет");

    }
}
