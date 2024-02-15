package Core.drugstore;

public abstract class Component implements Comparable<Component> {
    private String title;
    private Double weight;
    private int power;

    public Component(String title, Double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("title = %s, weight = %s, power = %s", title, power);
    }

    @Override
    public int compareTo(Component o) {
        return this.power - o.power;
    }
}

