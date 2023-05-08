public class Human {
    private String name;
    private int money;

    public Human(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void payments(int sales){
        this.money -= sales;
    }

    public void showStatus(){
        System.out.printf("%s씨는 남은 소지금이 %d원입니다.", money, name);
    }
}
