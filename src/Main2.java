import Core.Patients.Animal;
import Core.Patients.Impl.Cat;
import Core.Patients.Impl.Dog;
import Core.Patients.Impl.Goable;

import java.util.ArrayList;
import java.util.List;

    public class Main2 {
        public static void main(String[] args) {
            List<Goable> list = new ArrayList<>();
            Cat cat = new Cat();
            Dog dog = new Dog();
            list.add(cat);
            list.add(dog);
            System.out.println(list);
            Animal animal = new Animal() { // анонимный класс
                @Override
                public void eat() {

                }
            };

        }
    }


