package Interface;

public class Bus extends Auto implements Comparable<Bus> {
    public String noNameBus;

    public Bus(int id, String name,String noNameBus) {
        super(id, name);
        this.noNameBus = noNameBus;
    }

    @Override
    public void run() {
        System.out.println("I am a Bus , i  am run");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", noNameBus='" + noNameBus + '\'' +
                '}';
    }


    @Override
    public int compareTo(Bus o) {
        return this.name.compareTo(o.name);
    }
}
