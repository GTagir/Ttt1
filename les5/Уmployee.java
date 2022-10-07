package les5;

public class Уmployee {
    private String FIO;

    private String doljnost;
    private String email;
    private String telepfone;
    private Double zp;

    private int vozrast;

    public Уmployee(String FIO, String doljnost, String email, String telepfone, Double zp, int vozrast) {
        this.FIO = FIO;
        this.doljnost = doljnost;
        this.email = email;
        this.telepfone = telepfone;
        this.zp = zp;
        this.vozrast = vozrast;
    }
    @Override
    public String toString() {
        return "Уmployee{" +
                "FIO='" + FIO + '\'' +
                ", doljnost='" + doljnost + '\'' +
                ", email='" + email + '\'' +
                ", telepfone='" + telepfone + '\'' +
                ", zp=" + zp +
                ", vozrast=" + vozrast +
                '}';
    }

    public int getVozrast() {
        return vozrast;
    }
}
