public class Administrator extends Uzivatel{
    private int telefoniCislo;

    public Administrator(String jmeno, String heslo, int telefoniCislo) {
        super(jmeno, heslo);
        this.telefoniCislo = telefoniCislo;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "telefoniCislo=" + telefoniCislo +
                ", jmeno='" + jmeno + '\'' +
                ", heslo='" + heslo + '\'' +
                '}';
    }

    public int getTelefoniCislo() {
        return telefoniCislo;
    }

    public void setTelefoniCislo(int telefoniCislo) {
        this.telefoniCislo = telefoniCislo;
    }
}
