public class Maringotka extends  Obydli{
    protected int rychlost;

    public Maringotka(int plocha, int pocetMistnost, int rychlost) {
        super(plocha, pocetMistnost);
        this.rychlost = rychlost;
    }

    @Override
    public String toString() {
        return "Maringotka{" +
                "rychlost=" + rychlost +
                ", plocha=" + plocha +
                ", pocetMistnost=" + pocetMistnost +
                '}';
    }

    public int getRychlost() {
        return rychlost;
    }

    public void setRychlost(int rychlost) {
        this.rychlost = rychlost;
    }
}
