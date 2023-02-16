public class Auto {
    protected int rychlost;
    protected  String spz;

    public Auto(int rychlost, String spz) {
        this.rychlost = rychlost;
        this.spz = spz;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "rychlost=" + rychlost +
                ", spz='" + spz + '\'' +
                '}';
    }

    public void setRychlost(int rychlost) {
        this.rychlost = rychlost;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }
}
