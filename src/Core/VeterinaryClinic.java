package Core;

import Core.Patients.Impl.Cat;
import Core.Patients.Impl.Dog;
import Core.Patients.Impl.Goable;
import Core.Personnel.Impl.Doctor;
import Core.Personnel.Impl.Janitor;
import Core.Personnel.Impl.Nurse;
import Core.Personnel.Personnel;

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
        Dog dog = new Dog();
        list.add(cat);
        list.add(cat2);
        list.add(dog);

        System.out.println("Численность пациентов: " + list.size());
        System.out.println(list);

    }
}

