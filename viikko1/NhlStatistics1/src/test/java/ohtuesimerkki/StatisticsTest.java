package ohtuesimerkki;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class StatisticsTest {

  Reader readerStub = new Reader() {

    public List<Player> getPlayers() {
      ArrayList<Player> players = new ArrayList<>();

      players.add(new Player("Semenko", "EDM", 4, 12));
      players.add(new Player("Lemieux", "PIT", 45, 54));
      players.add(new Player("Kurri", "EDM", 37, 53));
      players.add(new Player("Yzerman", "DET", 42, 56));
      players.add(new Player("Gretzky", "EDM", 35, 89));

      return players;
    }
  };

  Statistics stats;

  @Before
  public void setUp() {
    // luodaan Statistics-olio joka käyttää "stubia"
    stats = new Statistics(readerStub);
  }

  @Test
  public void searchReturnsPlayer() {
    Player testPlayer = new Player("Semenko", "EDM", 4, 12);

    assertEquals(testPlayer.toString(), stats.search("Semenko").toString());
  }

  @Test
  public void searchReturnsNullIfNoPlayersAreFound() {

    assertEquals(null, stats.search("Pertti"));
  }

  @Test
  public void teamReturnsRightPlayers() {
    Player testPlayer = new Player("Lemieux", "PIT", 45, 54);

    Player teamsearched = stats.team("PIT").get(0);

    assertEquals(testPlayer.toString(), teamsearched.toString());

  }

  @Test
  public void topscorersReturnsTop() {
    Player testPlayer = new Player("Gretzky", "EDM", 35, 89);

    Player topScorer = stats.topScorers(1).get(0);

    assertEquals(testPlayer.toString(), topScorer.toString());

  }

}
