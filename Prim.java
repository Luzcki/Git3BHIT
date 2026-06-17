public class Prim {
    public static void main(String[] args) {
        int zahl = 7;  // andere Zahl hier einsetzen

        if (zahl <= 1) {
            System.out.println(zahl + " ist keine Primzahl.");
        } else if (zahl == 2 || zahl == 3) {
            System.out.println(zahl + " ist eine Primzahl.");
        } else if (zahl % 2 == 0 || zahl % 3 == 0) {
            System.out.println(zahl + " ist keine Primzahl.");
        } else {
            System.out.println(zahl + " ist eine Primzahl.");
        }
    }
}