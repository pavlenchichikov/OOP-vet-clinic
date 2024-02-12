package Core.patients;

import Core.clients.Owner;

import java.time.LocalDate;

public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    // protected видно в классе и во всех наследниках
    protected static String nickName;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    public Animal(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }



    public Animal() {
        this("Кличка", new Owner("Хозяин"), LocalDate.now(), new Illness("Болеет"));
    }

    public String getNickName() {
        return nickName;
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



    private void wakeUp() {
        wakeUp("12:00");
    }

    private void wakeUp(String time) {
        System.out.println("Животное " + nickName + " проснулось в " + time);
    }
    public String getType() {
        return getClass().getSimpleName();
    }
    private void hunt() {
        System.out.println("Животное " + nickName + " охотится!");
    }


    private void sleep() {
        System.out.println("Животное " + nickName + " уснуло!");
    }

    public void fly() {
        System.out.println("Животное " + nickName + " летает по своим делам");
    }
    public void swim() {
        System.out.println("Животное " + nickName + " уплыло в закат");
    }
    @Override
    public String toString() {
        return String.format("nickName = %s, bd = %s, owner = %s, illness = %s", nickName, birthDate, owner, illness);
    }
}

