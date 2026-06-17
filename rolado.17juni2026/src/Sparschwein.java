public class SelbstbedienungKasse {

        private int bargeld;
        private boolean voll;

        public SelbstbedienungKasse() {
            this.bargeld = 0;
            this.voll = false;
        }

        public void sparen(int bargeld) {
            this.bargeld += bargeld;
            System.out.println("Sie haben schon " + this.bargeld + " wunderbare Euros gespart");
        }

        if (this.bargeld >= 100) {
            this.voll = true;
            System.out.println("Sie haben zu viel Bargeld gespart, bitte geben Sie es aus");
        }



}
