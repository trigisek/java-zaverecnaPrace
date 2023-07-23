package projekt;
public class Uzivatel {
    // zalozeni promenych
    private String jmeno;
    private String prijmeni;
    private int vek;
    private int telefonniCislo;
    //vytvoreni konstruktoru
    public Uzivatel(String jmeno, String prijmeni, int vek, int telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }
    //vytvoreni getteru na ziskani udaju

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getVek() {
        return vek;
    }

    public int getTelefon() {
        return telefonniCislo;
    }
    // pomoci metody override prevedeme na text, jinak by nam kod vyhazoval spatne udaje

    @Override
    public String toString(){
        return "Jmeno: " + getJmeno() + " " + "Prijmeni: " + getPrijmeni() + " " + "Vek: " + getVek() + " " + "Telefon: " + getTelefon();
    }
}