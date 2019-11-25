
package ohtu.matkakortti;

import ohtu.matkakortti.Maksukortti;
import ohtu.matkakortti.Kassapaate;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class KassapaateTest {

    Kassapaate kassa;
    Maksukortti kortti;

    @Before
    public void setUp() {
        kassa = new Kassapaate();
        kortti = mock(Maksukortti.class);
    }

    @Test
    public void kortiltaVelotetaanHintaJosRahaaOn() {
        when(kortti.getSaldo()).thenReturn(10);
        kassa.ostaLounas(kortti);

        verify(kortti, times(1)).getSaldo();
        verify(kortti).osta(eq(Kassapaate.HINTA));
    }

    @Test
    public void kortiltaEiVelotetaJosRahaEiRiita() {
        when(kortti.getSaldo()).thenReturn(4);
        kassa.ostaLounas(kortti);

        verify(kortti, times(1)).getSaldo();
        verify(kortti, times(0)).osta(anyInt());
    }

    @Test
    public void lataaLisaaRahaaKortilleJosSummaPositiivinen() {
        Maksukortti testikortti = mock(Maksukortti.class);
        when(testikortti.getSaldo()).thenReturn(10);

        kassa.lataa(testikortti, 10);

        verify(testikortti).lataa(10);

    }

    @Test
    public void eiLadataNegatiivistaSummaaKortille() {
        Maksukortti testikortti = mock(Maksukortti.class);
        when(testikortti.getSaldo()).thenReturn(0);

        kassa.lataa(kortti, -10);

        verify(testikortti, times(0)).lataa(anyInt());
    }

}
