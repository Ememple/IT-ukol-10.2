public class Uzivatel {
    protected String jmeno;
    protected String heslo;

    public Uzivatel(String jmeno, String heslo) {
        this.jmeno = jmeno;
        this.heslo = heslo;
    }

    @Override
    public String toString() {
        return "Uzivatel{" +
                "jmeno='" + jmeno + '\'' +
                ", heslo='" + heslo + '\'' +
                '}';
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getHeslo() {
        return heslo;
    }

    public void setHeslo(String heslo) {
        this.heslo = heslo;
    }
}
