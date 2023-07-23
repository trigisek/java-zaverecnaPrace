package projekt;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // vytvoreni instance
        Ovladani ovladani = new Ovladani();
        Scanner sc = new Scanner(System.in);
        // založeni promenych
        int volba = 0;
        String vstupJmeno;
        String vstupPrijmeni;
        int vstupVek;
        int vstupTelefonniCislo;

        // while cyklus na zobrazovani menu pokud uzivatel nezada volbu 4
        while (volba != 4) {
           ovladani.vypisMenu();
           ovladani.vypisPocetUzivatelu();
           //Ošetřeni pokud uzivatel zada text vypise se hlaska a program se spusti znovu
            try {
                volba = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Toto není platná volba. Zadej cislo 1-4 ");
                continue;
            }
            // pouziti switch pro volby od uzivatele
            switch (volba) {
                case 1:
                    System.out.println("Zadejte jméno (velké počáteční písmeno): ");
                    vstupJmeno = sc.nextLine().trim();
                    System.out.println("Zadejte příjmení (velké počáteční písmeno):");
                    vstupPrijmeni = sc.nextLine().trim();
                    System.out.println("Zadejte věk:");
                    //Osetreni zda uzivatel zadal cislo, pokud ne, kod skonci a zacne kod znovu z cyklu while
                    try {
                        vstupVek = Integer.parseInt(sc.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Toto není číslo. Nezoufej a zkus to znovu.");
                        break;
                    }
                    System.out.println("Zadejte telefonní číslo:");
                    //osetreni pokud je zadani cislo, pokud ne, akce skonci a vrati se zacatek cyklu
                    try {
                        vstupTelefonniCislo = Integer.parseInt(sc.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Toto není číselný vstup. Opakujste pokus.");
                        break;
                    }
                    //pridani noveho uzivatele pomoci funkce
                    ovladani.pridatUzivatele(new Uzivatel(vstupJmeno, vstupPrijmeni, vstupVek, vstupTelefonniCislo));
                    break;
                case 2:
                    // vypise vsechny uzivatele
                    ovladani.vypisUzivatele();
                    break;
                case 3:
                    // vyhleda uzivatele podle parametru
                    System.out.println("Zadejte jméno(velké počáteční písmeno): ");
                    vstupJmeno = sc.nextLine().trim();
                    System.out.println("Zadejte příjmení(velké počáteční písmeno):");
                    vstupPrijmeni = sc.nextLine().trim();
                    //vytvoreni pomocne promene
                    Uzivatel pomUzivatel = ovladani.vyhledatUzivatele(vstupJmeno, vstupPrijmeni);
                    // pouziti podminky pro overeni ze uzivatel zadal hledane udaje
                    if (pomUzivatel == null) {
                        System.out.println("Tento uživatele není registrovaný.");
                    } else {
                        System.out.println(" Nalezeny uživatel dle jmena a přijmení: ");
                        System.out.println(pomUzivatel);
                    }
                    break;

                case 4:
                    //pokud uzivatel zada 4, kod se skonci, protoze se splni podminka v cyklu
                    System.out.println("Děkujeme za použití aplikace. Hezký den!");
                    return;
                default:
                    System.out.println("Zadejte číslici 1-4.\n");
            }
        }
    }
}