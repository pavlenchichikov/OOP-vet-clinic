package Core.Patients;

public class Illness {
    String Title;

    public Illness(String title) {
        Title = title;
    }

    @Override
    public String toString() {
        return "Illness{" +
                "Title='" + Title + '\'' +
                '}';
    }
}
