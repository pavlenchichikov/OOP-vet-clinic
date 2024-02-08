package main.Animals;

import main.Animals.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
            Animal cat = new Cat("Бакс", new Owner("Андрей Геннадьевич"),
                    LocalDate.of(2024, 11, 25), new Illness("Лишай") ,10.0); // Создаем экземпляр класса
           // System.out.println(cat.getNickname());
            //System.out.println(cat.getBirthDate());
            //System.out.println(cat.getOwner());
            //cat.setIllness(new Illness("Здоров"));



            Animal catty = new Cat();
            Dog goodboy = new Dog();

            System.out.println(cat.getType());
            System.out.println(cat);
            Cat.meow();


            List<Animal> animals = new ArrayList<Animal>();

            animals.add(catty);
            animals.add(goodboy);
            animals.add(cat);

            Fish fishy = new Fish("Жора", new Owner("Павел Андреевич"),
                    LocalDate.of(2024, 10, 21), new Illness("Плавниковая гниль"));



            Duck ducky = new Duck ("Ути", new Owner("Геннадий Юрьевич"),
                    LocalDate.of(2020, 11, 22), new Illness("глисты"));




    }


}









