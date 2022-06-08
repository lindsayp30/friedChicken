import java.util.ArrayList;

public class Team {
  private ArrayList<Player> team = new ArrayList<Player>();
  private String teamName;
  private int roundsWon, roundsLost;
  private Player p1, p2, p3, p4, p5;

  public Team() {

  }

  public Team(Player uno, Player dos, Player tres, Player cuatro, Player cinco) {
    //team = t;
    p1 = uno;
    p2 = dos;
    p3 = tres;
    p4 = cuatro;
    p5 = cinco;
    teamName = uno.getTeamName();
  }

  public void addPlayer(Player p){
    team.add(p);
  }

  private static String mvp;

  //calculated through ACS for winning team
  public String calcMVP() {
    if ((p1.getACS() > p2.getACS()) && (p1.getACS() > p3.getACS()) && (p1.getACS() > p4.getACS()) && (p1.getACS() > p5.getACS())) {
      mvp = p1.getName();
    } else if ((p2.getACS() > p1.getACS()) && (p2.getACS() > p3.getACS()) && (p2.getACS() > p4.getACS()) && (p2.getACS() > p5.getACS())) {
      mvp = p2.getName();
    } else if ((p3.getACS() > p1.getACS()) && (p3.getACS() > p2.getACS()) && (p3.getACS() > p4.getACS()) && (p3.getACS() > p5.getACS())) {
      mvp = p3.getName();
    } else if ((p4.getACS() > p1.getACS()) && (p4.getACS() > p2.getACS()) && (p4.getACS() > p3.getACS()) && (p4.getACS() > p5.getACS())) {
      mvp = p4.getName();
    } else if ((p5.getACS() > p1.getACS()) && (p5.getACS() > p2.getACS()) && (p5.getACS() > p3.getACS()) && (p5.getACS() > p4.getACS())) {
      mvp = p5.getName();
    }
    return mvp;
  }

  private static String lvp;

  public String calcLVP() {
    if ((p1.getACS() < p2.getACS()) && (p1.getACS() < p3.getACS()) && (p1.getACS() < p4.getACS()) && (p1.getACS() < p5.getACS())) {
      mvp = p1.getName();
    } else if ((p2.getACS() < p1.getACS()) && (p2.getACS() < p3.getACS()) && (p2.getACS() < p4.getACS()) && (p2.getACS() < p5.getACS())) {
      mvp = p2.getName();
    } else if ((p3.getACS() < p1.getACS()) && (p3.getACS() < p2.getACS()) && (p3.getACS() < p4.getACS()) && (p3.getACS() < p5.getACS())) {
      mvp = p3.getName();
    } else if ((p4.getACS() < p1.getACS()) && (p4.getACS() < p2.getACS()) && (p4.getACS() < p3.getACS()) && (p4.getACS() < p5.getACS())) {
      mvp = p4.getName();
    } else if ((p5.getACS() < p1.getACS()) && (p5.getACS() < p2.getACS()) && (p5.getACS() < p3.getACS()) && (p5.getACS() < p4.getACS())) {
      mvp = p5.getName();
    }
    return lvp;
  }

  public int averageKills() {
    int totalKills = 0;
    totalKills = p1.getKills() + p2.getKills() + p3.getKills() + p4.getKills() + p5.getKills();
    return totalKills / 5;
  }

  public int averageDeath() {
    int totalDeaths = 0;
    totalDeaths = p1.getDeaths() + p2.getDeaths() + p3.getDeaths() + p4.getDeaths() + p5.getDeaths();
    return totalDeaths / 5;
  }

  public int averageACS() {
    int totalACS = 0;
    totalACS = p1.getACS() + p2.getACS() + p3.getACS() + p4.getACS() + p5.getACS();
    return totalACS / 5;
  }

  public int averageADR() {
    int totalADR = 0;
    totalADR = p1.getADR() + p2.getADR() + p3.getADR() + p4.getADR() + p5.getADR();
    return totalADR / 5;
  }

  public int averageKAST() {
    int totalKast = 0;
    totalKast = p1.getKAST() + p2.getKAST() + p3.getKAST() + p4.getKAST() + p5.getKAST();
    return totalKast / 5;
  }

  public String getName() {
    return teamName;
  }

  public String setName(String name) {
    teamName = name;
    return teamName;
  }

  public String toString() {
    return teamName;
  }

}
