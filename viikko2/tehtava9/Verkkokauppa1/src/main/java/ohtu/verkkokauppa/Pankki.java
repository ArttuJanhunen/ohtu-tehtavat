package ohtu.verkkokauppa;

import ohtu.interfaces.KirjanpitoInterface;
import ohtu.interfaces.PankkiInterface;

public class Pankki implements PankkiInterface {

    private KirjanpitoInterface kirjanpito;

    public Pankki(KirjanpitoInterface k) {
        kirjanpito = k;
    }

    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa) {
        kirjanpito.lisaaTapahtuma("tilisiirto: tililtä " + tilille + " tilille " + tilille + " viite " + viitenumero
                + " summa " + summa + "e");

        // täällä olisi koodi joka ottaa yhteyden pankin verkkorajapintaan
        return true;
    }

}
