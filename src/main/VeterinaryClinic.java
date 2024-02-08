package main;

import main.Animals.*;
import main.Personnel.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.getType;

public class VeterinaryClinic {
    public static void main(String[] args){



        Doctor doctor = new Doctor();
        Nurse nurse = new Nurse();
        Janitor janitor = new Janitor();

        Nurse nurseOne = new Nurse();
        Nurse nurseTwo = new Nurse();
        Nurse nurseThree = new Nurse();


        List<Personnel> staff = new ArrayList<>();
        staff.add(doctor);
        staff.add(nurse);
        staff.add(janitor);


        System.out.println("Численность персонала: " + staff.size());
        System.out.println(staff);



        ArrayList<Goable> list = new ArrayList<>();

        Cat cat = new Cat();
        Cat cat2 = new Cat();
        list.add(cat);
        list.add(cat2);

        System.out.println("Численность пациентов: " + list.size());
        System.out.println(list);

    }
}

