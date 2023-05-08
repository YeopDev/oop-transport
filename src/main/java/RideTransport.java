public class RideTransport {
    public static void main(String[] args) {
        /**
         * Human이 대중교통을 이용합니다.
         * 1. 대중교통은 버스:1500원, 지하철:1200원 입니다.
         * 2. Human은 소지금을 가지고 있고, 각각 대중교통을 이용할 때마다 그에 따른 비용을 지불합니다.
         */
        Human human = new Human("사람1",20000);

        Bus bus51 = new Bus(51);
        SubWay subWay1 = new SubWay(1);

        bus51.ride(human);
        subWay1.ride(human);

        human.showStatus();

    }
}
