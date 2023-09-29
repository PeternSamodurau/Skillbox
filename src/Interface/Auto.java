package Interface;

public abstract class Auto implements Mashine {
    public int id;
    public String name;

    public Auto(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
