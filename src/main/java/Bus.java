public class Bus {
    private int id;
    private int sales;
    private int inRide;

    public Bus(int id) {
        this.id = id;
    }

    public void ride(Human human) {
        human.payments(1_500);
        this.inRide++;
        this.sales += 1_500;
    }

    public void showBusStatus() {
        System.out.println("버스" + this.id + "의 오늘탔던 손님 수는" + this.inRide + "이고, 매출액은 " + this.sales + "원 입니다.");
    }

}
