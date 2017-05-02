package ohtu;

import javax.swing.JTextField;

public class Summa extends Lasku {
    
    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }
    
    @Override
    public void suorita() {
        sovellus.plus(luku());
        super.suorita();
    }
    
}
