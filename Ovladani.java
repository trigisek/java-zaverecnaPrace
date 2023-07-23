package projekt;

import java.util.ArrayList;
import java.util.List;

public class Ovladani {
    // vytvoreni arralistu pro seznam uzivatelu
    private List<Uzivatel> seznamUzivatelu;
    // vytvoreni konstruktoru
    public Ovladani() {
        seznamUzivatelu = new ArrayList<>();
    }
    // vytvoreni metody pro vypsani menu
    public void vypisMenu(){
        System.out.println("------------------------------------------ ");
        System.out.println("-------------   Vyberte akci   -------------");
        System.out.println("příkazy pro ovládání:");
        System.out.println(" 1 -  Vytvoření nového uživatele");
        System.out.println(" 2 -  Zobrazí všechny uživatele");
        System.out.println(" 3 -  Vyhledat konkrétního uživatele");
        System.out.println(" 4 -  Zavření a ukončení programu");
        System.out.println("------------------------------------------ ");
    }
    // metoda pro vypsani poctu uzivatelu
    public void vypisPocetUzivatelu(){
        System.out.println("------------------------------------------ ");
        System.out.println("Počet uzivatelu: " + seznamUzivatelu.size());
        System.out.println("------------------------------------------ ");
    }
    // metoda pro pridani noveho uzivatele podle instance tridy uzivatel
    public void pridatUzivatele(Uzivatel uzivatel) {
        seznamUzivatelu.add(uzivatel);
    }
    // metoda pro vypis vsech uzivatelu
    public void vypisUzivatele() {
        // osetreni kdyz je prazdy seznam, vypise se neni zadny uzivatel
        if (seznamUzivatelu.isEmpty())
            System.out.print("Zatím neevidujeme žádné uživatele.");
        else
            System.out.println("Výpis uživatelů:");
        // pomoci cyklu vypiseme vsechny uzivatele ze seznamu
        for (Uzivatel uzivatel : seznamUzivatelu) {
            System.out.println(uzivatel);
        }
    }
    //Metoda pro vyhledani uzivatele ze seznamu podle jmena a prijmeni, musi obsahovat stejne velikosti pismen

    public Uzivatel vyhledatUzivatele(String jmeno, String prijmeni) {
        for (Uzivatel uzivatel : seznamUzivatelu) {
            if (uzivatel.getJmeno().equals(jmeno) && uzivatel.getPrijmeni().equals(prijmeni)) {
                return uzivatel;
            }
        }
        return null;
    }
}