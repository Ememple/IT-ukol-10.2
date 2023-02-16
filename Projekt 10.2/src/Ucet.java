import java.util.Random;

public class Ucet {
    protected int castka;

    public Ucet(int castka) {
        this.castka = castka;
    }

    @Override
    public String toString() {
        return "Ucet{" +
                "castka=" + castka +
                '}';
    }

    public int getCastka() {
        return castka;
    }

    public void setCastka(int castka) {
        this.castka = castka;
    }

    Random r = new Random();
    int vkladRandom= r.nextInt(15000)+10000;

    public String vklad(){
        castka=vkladRandom+getCastka();
    return "Částka na účtu:"+getCastka();
    }

    int vyberRandom = r.nextInt(15000)+10000;

    public String vyber(){
        if (vyberRandom>getCastka()){
            System.out.println("Nelze provést akci");
        }
        else
        castka=getCastka()-vyberRandom;
        return "Částka na účtu:"+getCastka();
    }

}
