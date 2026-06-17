public class Zahlungsmittel {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Baageld");
        System.out.println("Bargeld Challenge");

        Bankomat neuerBankomat = new Bankomat();
        neuerBankomat.setKontaktlos(true);
        neuerBankomat.startup();

        Sparschwein neuesSparschwein = new Sparschwein();
        neuesSparschwein.sparen(50);
        

        System.out.println("Test");

        System.out.println("Bageld");

    }
}