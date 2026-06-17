public class Sparschwein {

        private int bargeld;
        private boolean voll;

        public Sparschwein() {
            this.bargeld = 0;
            this.voll = false;
        }

        public void sparen(int bargeld) {
            this.bargeld += bargeld;
            System.out.println("Sie haben schon " + this.bargeld + " wunderbare Euros gespart");
        }
//wow Orlando was ein Wunderbarer Code
        if (this.bargeld >= 100) {
            this.voll = true;
            System.out.println("Sie haben zu viel Bargeld gespart, bitte geben Sie es aus");
        }



}
