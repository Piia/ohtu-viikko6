
package ohtu;

import javax.swing.JTextField;


public class Erotus extends Lasku {

    public Erotus(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        sovellus.miinus(luku());
        super.suorita();
    }

}
