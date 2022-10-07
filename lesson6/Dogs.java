package lesson6;

public class Dogs extends Animal{
    private  int swim = 5;
    public Dogs(int run, String nickname, String whatanimal) {
        super(run, nickname, "Собака");
    }
    public void doAction() {

        if (swim <= dogMaxDistanceSwim){
            System.out.printf("%s проплывает %d м. %n", super.getNickname(), swim);
        } else System.out.printf("Собака столько не проплывёт! %n", super.getNickname());
    }
}
