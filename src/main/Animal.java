package main;

import java.time.LocalDate;

public class Animal  {
    protected String Nickname; // видно в классе Animal и во всех наследниках (наследование)
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    public Animal(){

        this.Nickname = "Кличка";
        this.owner = new Owner("Хозяин");
        this.birthDate = LocalDate.now();
        this.illness = new Illness("Болеет");
    }

    public String getNickname() {
        return Nickname;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    // Это пустой констуктор (по умолчанию)
    public Animal(String nickname, Owner owner, LocalDate birthDate, Illness ilness) {
        this.Nickname = nickname;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = ilness;
    }
    public String getType(){
        return getClass().getSimpleName();    }
    public void lifecycle(){
        wakeUp( "5:00");
        hunt();
        eat();
        sleep();
    }
    private void wakeUp(){
        System.out.println("Животное проснулось");
    }
    private void wakeUp(String time){
        System.out.println("животное" + Nickname + "проснулось в " + time);
    }

    private void hunt (){
        System.out.println("Животное охотится");
    }
    public void eat(){
        System.out.println("Животное ест");
    }
    private void sleep(){
        System.out.println("Животное спит");
    }

    @Override
    public String toString() {
        return String.format("nickname = %s, bd = %s, owner = %s, illness = %s",Nickname, birthDate, owner, illness);
    }
    public static void go() { System.out.println("идет"); }
    public static void swim() { System.out.println("плывет"); }
    public static void fly() { System.out.println("летит"); }
}


