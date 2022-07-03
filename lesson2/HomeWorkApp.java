package lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(summpridel());
        proverkachisla(-2);
        System.out.println(proverkachislaboolean(-5));
        printstroki("Печать ", 10);
        System.out.println("");
        System.out.println(opredvisokgoda(2022));
    }

    private static boolean summpridel() {
        int a = 2;
        int b = 8;
        if (a + b >= 10 && a + b <= 20){
            return true;
        }else {
            return false;
        }
    }

   private static void proverkachisla(int chislo) {
        if (chislo >= 0){
            System.out.println("Число положительное");
        }
        else {System.out.println("Число отрицательное");}
   }

    private static boolean proverkachislaboolean(int chislo2) {
        if (chislo2 >= 0) {
            return true;
        }else {
            return false;
        }
    }

    private static void printstroki(String text, int a) {
        for (int i = 0; i < a; i++) {
            System.out.print(text );
        }

    }

    private static boolean opredvisokgoda(int god) {
        int i = 0;
        if (god % 400.0 == 0){
           return true;
        }else if (god % 100.0 == 0){
            return false;
        }else if (god % 4.0 == 0){
            return true;
        }else
            return false;
    }
}
