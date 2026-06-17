import Java.util.Scanner;
public class Bankomat {
    private boolean kontaktlos = false;
    private int selection = 0;

    public Bankomat() {

    }

    public void startup() {
        System.out.println("Wändebau AG Bankomat v1.1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte wählen Sie ihren Zahlungsvorgang");
        System.out.println("0: Abdrehen");
        System.out.println("1: Auszahlen mit der Karte");
        System.out.println("2: Einzahlen mit den wunderbaren Scheinen, also unser Bargeld");
        System.out.println("Eingabe: ");
        selection = sc.nextInt();

    }

    public String einzahlung(int einzahlung) {
        return einzahlung+" wunderbare Euros wurden eingezahlt";
    }

    public boolean isKontaktlos() {
        return kontaktlos;
    }

    public void setKontaktlos(boolean kontaktlos) {
        this.kontaktlos = kontaktlos;
    }
}
