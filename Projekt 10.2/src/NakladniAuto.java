public class NakladniAuto extends Auto{
    private int hmotnost;

    public NakladniAuto(int rychlost, String spz, int hmotnost) {
        super(rychlost, spz);
        this.hmotnost = hmotnost;
    }

    @Override
    public String toString() {
        return "NakladniAuto{" +
                "hmotnost=" + hmotnost +
                ", rychlost=" + rychlost +
                ", spz='" + spz + '\'' +
                '}';
    }

    public int getHmotnost() {
        return hmotnost;
    }

    public void setHmotnost(int hmotnost) {
        this.hmotnost = hmotnost;
    }
}
