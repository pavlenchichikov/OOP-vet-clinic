import Core.patients.*;
import Core.personnel.Impl.Doctor;
import Core.VeterinaryClinic;

public class Main {
    public static void main (String[] args) {

            VeterinaryClinic clinic = new VeterinaryClinic();
            System.out.println(clinic.getPatients());
            System.out.println(clinic.getPersonnel());

            Doctor doctor = new Doctor();
            clinic.hireEmployee(doctor);
            Animal patient1 = new Animal("Шелли");
            Animal catty = new Animal("Мурка");
            Animal ducky = new Animal ("Ути");
            clinic.addPatients(catty);
            clinic.addPatients(ducky);
            clinic.addPatients(patient1);


            System.out.println(clinic.getPatients());
            System.out.println(clinic.getPersonnel());
            System.out.println(clinic.getGoables());
            System.out.println(clinic.getPersonnel());
            System.out.println(clinic.getPatients());
            System.out.println(doctor.doDiagnose(patient1));
            System.out.println(clinic.getGoables()); // Вывожу всех бегающих
            System.out.println(clinic.getFlyables()); // Вывожу всех летающих
            System.out.println(clinic.getSwimmables());// Вывожу всех плавающих

    }


}









