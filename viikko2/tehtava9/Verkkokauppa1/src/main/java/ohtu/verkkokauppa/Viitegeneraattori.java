package ohtu.verkkokauppa;

import org.springframework.stereotype.Component;

import ohtu.interfaces.ViitegeneraattoriInterface;

@Component
public class Viitegeneraattori implements ViitegeneraattoriInterface {

    private int seuraava;

    public Viitegeneraattori() {
        seuraava = 1;
    }

    public int uusi() {
        return seuraava++;
    }
}
