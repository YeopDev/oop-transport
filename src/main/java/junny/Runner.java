package junny;

public class Runner {
    public static void main(String[] args) {
        Transport bus = new Transport.Bus();
        Transport subway = new Transport.SubWay();

        bus.visit();
        bus.visit();
        bus.visit();
        subway.visit();
        subway.visit();
        subway.visit();

        System.out.println(bus.statistics());
        System.out.println(subway.statistics());
    }
}
