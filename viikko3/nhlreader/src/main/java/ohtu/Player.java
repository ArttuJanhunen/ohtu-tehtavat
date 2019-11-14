
package ohtu;

public class Player implements Comparable<Player> {
    private String name;
    private String nationality;
    private int goals;
    private int assists;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getGoals() {
        return goals;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getAssists() {
        return assists;
    }

    public int getTotal() {
        return goals + assists;
    }

    @Override
    public String toString() {
        return name + " Maalit: " + goals + " Syötöt: " + assists + " Yhteensä: " + getTotal();
    }

    @Override
    public int compareTo(Player p) {
        if (getTotal() < p.getTotal()) {
            return 1;
        } else if (getTotal() > p.getTotal()) {
            return -1;
        }
        return 0;
    }

}
