package main.Personnel;
import main.Animals.Illness;
import main.Animals.Owner;

import java.time.LocalDate;
public abstract class Personnel {

        public String name;
        public LocalDate birthDate;


        public Personnel (String name, LocalDate birthDate) {
            this.name = name;
            this.birthDate = birthDate;
        }

        public Personnel (String name) {
            this.name = name;
            this.birthDate = LocalDate.now();
        }

        public Personnel() {
            this("Имя", LocalDate.now());
        }

        public String getType() {
            return getClass().getSimpleName();
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return String.format("name = %s, bd = %s ", name, birthDate);
        }

}
