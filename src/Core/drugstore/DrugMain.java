package Core.drugstore;



import Core.drugstore.components.Azitronite;
import Core.drugstore.components.Penicilin;
import Core.drugstore.components.Water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DrugMain  {
    public static void main(String[] args) {
        Component water = new Water("water", 10D, 1);
        Component azitronite = new Azitronite("azitronite", 2D, 14);
        Component penicillin = new Penicilin("penicillin", 1.6D, 6);

   //     Pharmacy2 p1 = new Pharmacy2();
     //   p1.addComponents(water, azitronite);

       // Pharmacy2 p2 = new Pharmacy2();
   //     p2.addComponents(water, penicillin);

   //     Pharmacy2 p3 = new Pharmacy2();
     //   p3.addComponents(penicillin, azitronite);


     //   List<Component> components = new ArrayList<Component>();
   //     components.add(azitronite);
        //components.add(water);
      //  components.add(penicillin);
    //    System.out.println(components);

  //      Collections.sort(components);
//        System.out.println(components);

//        Iterator<Component> iterator = p1;
//
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }

        ///for (Component c : p2) {
           /// System.out.println(" " + c);

        Pharmacy p1 = new Pharmacy();
        p1.addComponents(water, azitronite, penicillin);
        Pharmacy p2 = new Pharmacy();
        p2.addComponents(azitronite, penicillin);
        Pharmacy p3 = new Pharmacy();
        p3.addComponents(water);

        List<Pharmacy> phsy = new ArrayList<>();
        phsy.add(p1);
        phsy.add(p2);
        phsy.add(p3);

        System.out.println(phsy);
        Collections.sort(phsy);
        System.out.println(phsy);
    }
}



