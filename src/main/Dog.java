package main;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String nickname, Owner owner, LocalDate birthDate, Illness ilness) {
        super(nickname, owner, birthDate, ilness); // сходи в родительсккий класс и вызови 4 параметра
    }

    public Dog() {
        super();
    }
}
