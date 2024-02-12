package Core.personnel.Impl;

import Core.patients.Animal;
import Core.personnel.Personnel;

import java.util.Map;

public class Doctor extends Personnel implements Curable, Ondutable {
    private final Map<Integer, String> diagnoses = Map.of(1, "чумка",2, "лишай", 3, "бешенство");

    public String doDiagnose (Animal patient){
        int key = (int)( Math.random() * 3);
        return patient.name + " подхватил болезнь " + diagnoses.get(key);
    }
    @Override
    public void heal() {

    }

    @Override
    public void Watch() {

    }
}
