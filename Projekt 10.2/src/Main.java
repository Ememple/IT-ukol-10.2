import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. ukol
        Auto auto = new Auto(50, " ABC 52 36");
        NakladniAuto nakladniAuto = new NakladniAuto(70,"A3D 25 42", 25000);
        System.out.println(auto);
        System.out.println(nakladniAuto);
        System.out.println();

        //2. ukol
        Ucet ucet = new Ucet(20000);
        System.out.println(ucet);
        System.out.println("Vklad: "+ucet.vkladRandom);
        System.out.println(ucet.vklad());
        System.out.println("Výběr: "+ucet.vyberRandom);
        System.out.println(ucet.vyber());
        System.out.println();

        DebetniUcet debetniUcet = new DebetniUcet(20000,20000);
        System.out.println(debetniUcet);
        System.out.println("Vklad: "+debetniUcet.vkladRandom);
        System.out.println(debetniUcet.vklad());
        System.out.println("Výběr: "+debetniUcet.vyberRandom);
        System.out.println(debetniUcet.vyber());
        System.out.println();

        //3.ukol
        Uzivatel uzivatel1 = new Uzivatel("Děda","Ta dnesni mladez");
        Uzivatel uzivatel2 = new Uzivatel("Umpalump", "Nechapu156");
        Uzivatel uzivatel3= new Uzivatel("Maxwell", "Kočka dělá Kňá");
        Administrator administrator1= new Administrator("Franta", "Garáž666",759685596);
        Administrator administrator2= new Administrator("Pepa", "IT je zabava587", 379197579);

        Uzivatel[] uzivatele = new Uzivatel[]{uzivatel1,uzivatel2,uzivatel3,administrator1,administrator2};
        int delkaHesla=Integer.MAX_VALUE;
        String nejkratsiHeslo ="";
        for (int i = 0; i<uzivatele.length; i++){
            System.out.println(uzivatele[i]);
            if (delkaHesla>uzivatele[i].getHeslo().length()){
                delkaHesla=uzivatele[i].getHeslo().length();
            nejkratsiHeslo=uzivatele[i].getJmeno();
            }
        }
        System.out.println("Nejkratší heslo má uživatel: "+nejkratsiHeslo);
        System.out.println();

        //4.ukol
        Obydli obydli1 = new Obydli(500, 6);
        Obydli obydli2= new Obydli(200, 3);
        Obydli obydli3= new Obydli(50,1);
        Maringotka maringotka1 = new Maringotka(100, 2,90);
        Maringotka maringotka2= new Maringotka(800,8,60);


        Maringotka[] obydli= new Maringotka[]{obydli1, obydli2, obydli3, maringotka1,maringotka2,};
        int velikostPlochy=Integer.MAX_VALUE;
        int povolenaRychlost=Integer.MIN_VALUE;
        String nejvetsiRychlost="";
        String nejmensiObydli="";
        for (int i = 0; i<obydli.length; i++) {
            System.out.println(obydli[i]);
            if (velikostPlochy>obydli[i].getPlocha()){
                velikostPlochy=obydli[i].getPlocha();
                nejmensiObydli= String.valueOf(obydli[i]);
            }
            if (povolenaRychlost<obydli[i].getRychlost()){
                povolenaRychlost=obydli[i].getRychlost();
                nejmensiObydli=String.valueOf(obydli[i]);
            }
        }
        System.out.println();
        System.out.println(nejmensiObydli);
        System.out.println(nejvetsiRychlost);




    }
}