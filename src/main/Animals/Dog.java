package main.Animals;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimmable, Huntable {
    public Dog(String nickname, Owner owner, LocalDate birthDate, Illness ilness) {
        super(nickname, owner, birthDate, ilness); // сходи в родительсккий класс и вызови 4 параметра
    }

    public Dog() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    @Override
    public void go() {

    }

    @Override
    public void swim() {

    }
}
