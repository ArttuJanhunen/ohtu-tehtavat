package ohtu.verkkokauppa;

import ohtu.interfaces.ViitegeneraattoriInterface;

public class Viitegeneraattori implements ViitegeneraattoriInterface{

    private static Viitegeneraattori instanssi;

    public static Viitegeneraattori getInstance() {
        if (instanssi == null) {
            instanssi = new Viitegeneraattori();
        }

        return instanssi;
    }
    
    private int seuraava;
    
    private Viitegeneraattori(){
        seuraava = 1;    
    }
    
    public int uusi(){
        return seuraava++;
    }
}
