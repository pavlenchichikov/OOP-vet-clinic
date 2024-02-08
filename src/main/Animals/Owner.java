package main.Animals;

public class Owner {
    String Fullname;

    public Owner(String fullname) {
        Fullname = fullname;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "Fullname='" + Fullname + '\'' +
                '}';
    }
}

