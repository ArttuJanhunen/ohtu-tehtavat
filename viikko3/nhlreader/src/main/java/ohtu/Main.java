package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.http.client.fluent.Request;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    String url = "https://nhlstatisticsforohtu.herokuapp.com/players";

    String bodyText = Request.Get(url).execute().returnContent().asString();

    /*System.out.println("json-muotoinen data:");
    System.out.println(bodyText);*/

    Date date = new Date();
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    


    Gson mapper = new Gson();
    Player[] players = mapper.fromJson(bodyText, Player[].class);
    Arrays.sort(players);

    System.out.println("Suomalaiset NHL-pelaajat:");
    System.out.println("Ajankohtainen (" +format.format(date)+ ") Tilanne:");
    System.out.println("");
    for (Player player : players) {
      if (player.getNationality().equals("FIN")) {
        System.out.println(player);
      }
    }
  }

}
