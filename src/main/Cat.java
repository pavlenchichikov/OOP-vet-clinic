package main;

import java.time.LocalDate;

public class Cat extends Animal {

    Double discont;
    public Cat(String nickname, Owner owner, LocalDate birthDate, Illness ilness, Double discount) {
        super(nickname, owner, birthDate, ilness);
        this.discont = discount;
    }

    public Cat() {
        super();
        this.discont = 100.0;
    }

    public Double getDiscont() {
        return discont;
    }

    public void setDiscont(Double discont) {
        this.discont = discont;
    }

    @Override
    public String toString() {
        return super.toString()+"Discont ("+discont+")";
    }
    public static void meow() {
        System.out.println("мяу!");
    }


}


