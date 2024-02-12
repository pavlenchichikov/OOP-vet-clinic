package Core;

import Core.patients.Animal;
import Core.patients.Impl.*;
import Core.personnel.Personnel;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.getType;

public class VeterinaryClinic {


    private List<Animal> patients;
    private List<Personnel> personnel;

    public VeterinaryClinic() {
        this.personnel = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public List<Animal> getPatients() {
        return patients;
    }

    public List<Personnel> getPersonnel() {
        return personnel;
    }

    public void hireEmployee(Personnel employee) {
        personnel.add(employee);

    }

    public void addPatients(Animal animal) {
        patients.add(animal);


    }

    public List<Animal> getGoables() {
        List<Animal> result = new ArrayList<Animal>();
        for (Animal animal : patients) {
            if (animal instanceof Goable) result.add(animal);
        }
        return result;


    }

    public List<Animal> getFlyables() {
        List<Animal> result = new ArrayList<Animal>();
        for (Animal animal : patients) {
            if (animal instanceof Flyable) result.add(animal);
        }
        return result;

    }

    public List<Animal> getSwimmables() {
        List<Animal> result = new ArrayList<Animal>();
        for (Animal animal : patients) {
            if (animal instanceof Swimmable) result.add(animal);
        }
                return result;


        }

}