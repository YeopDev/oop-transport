public class SubWay {
    private int id;
    private int sales; // 매출액
    private int inRide; // 손님탑승 횟수

    public SubWay(int id){
        this.id = id;
    }

    public void ride(Human human) {
        human.payments(1_200);
        this.inRide++;
        this.sales += 1_200;
    }

    public void showSubWayStatus(){
        System.out.println("지하철" + this.id +"의 오늘탔던 손님 수는"+ this.inRide + "이고, 매출액은 "+ this.sales + "원 입니다.");
    }

}
