public class Obydli{
    protected int plocha;
    protected int pocetMistnost;

    public Obydli(int plocha, int pocetMistnost) {
        this.plocha = plocha;
        this.pocetMistnost = pocetMistnost;
    }

    @Override
    public String toString() {
        return "Obydli{" +
                "plocha=" + plocha +
                ", pocetMistnost=" + pocetMistnost +
                '}';
    }

    public int getPlocha() {
        return plocha;
    }

    public void setPlocha(int plocha) {
        this.plocha = plocha;
    }

    public int getPocetMistnost() {
        return pocetMistnost;
    }

    public void setPocetMistnost(int pocetMistnost) {
        this.pocetMistnost = pocetMistnost;
    }
}
