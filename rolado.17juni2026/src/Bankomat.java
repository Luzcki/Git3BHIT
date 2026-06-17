import Java.util.Scanner;
public class Bankomat {
    boolean kontaktlos = false;

    public Bankomat() {

    }

    public void startup() {
        System.out.println("Wändebau AG Bankomat v1.1");

    }
    public boolean isKontaktlos() {
        return kontaktlos;
    }

    public void setKontaktlos(boolean kontaktlos) {
        this.kontaktlos = kontaktlos;
    }
}
