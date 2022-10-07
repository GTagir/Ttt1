package test3;

public class Main {
    private static void doVoice(CanVoice voice){
        voice.voice();
    }
    public static void main(String[] args) {
        Cat murzik = new Cat("Мурзик");
        Dog reks = new Dog("Рекс");

        murzik.run();
        reks.run();
        doVoice(murzik);
        doVoice(reks);

    }
}
