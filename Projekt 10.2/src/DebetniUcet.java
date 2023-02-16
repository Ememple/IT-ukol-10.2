public class DebetniUcet extends Ucet{
    private int debet;

    public DebetniUcet(int castka, int debet) {
        super(castka);
        this.debet = debet;
    }

    @Override
    public String toString() {
        return "DebetniUcet{" +
                "debet=" + debet +
                ", castka=" + castka +
                '}';
    }

    public int getDebet() {
        return debet;
    }

    public void setDebet(int debet) {
        this.debet = debet;
    }
    public String vklad(){
        castka=vkladRandom+getCastka();
        return "Částka na účtu:"+getCastka();
    }
    public String vyber(){
        if (vyberRandom>getCastka()+getDebet()){
            System.out.println("Nelze provést akci");
        }
        else
            castka=getCastka()-vyberRandom;
        return "Částka na účtu:"+getCastka();
    }
}
