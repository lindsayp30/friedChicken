import java.util.ArrayList;

public class Team {
  private ArrayList<Player> team = new ArrayList<Player>();
  private String teamName;

  public Team() {

  }

  public Team(ArrayList<Player> t, String tN) {
    team = t;
    teamName = tN;
  }

  //calculated through ACS for winning team
  public String calcMVP() {
    String mvp = "";
    int mvpACS = team.get(0).getACS();
    for (int i = 0; i < team.size()-1; i++) {
      if (team.get(i).getACS() > mvpACS) {
        mvpACS = team.get(i).getACS();
        mvp = team.get(i).getName();
      }
    }
    return mvp;
  }

  public String calcLVP() {
    String lvp = "";
    int lvpACS = team.get(0).getACS();
    for (int i = 0; i < team.size()-1; i++) {
      if (team.get(i).getACS() < lvpACS) {
        lvpACS = team.get(i).getACS();
        lvp = team.get(i).getName();
      }
    }
    return lvp;
  }

  public int averageKills() {
    int totalKills = 0;
    for (int i = 0; i < team.size(); i++) {
      totalKills += team.get(i).getKills();
    }
    return totalKills / 5;
  }

  public int averageDeath() {
    int totalDeaths = 0;
    for (int i = 0; i < team.size(); i++) {
      totalDeaths += team.get(i).getDeaths();
    }
    return totalDeaths / 5;
  }

  public int averageACS() {
    int totalACS = 0;
    for (int i = 0; i < team.size(); i++) {
      totalACS += team.get(i).getACS();
    }
    return totalACS / 5;
  }

  public int averageADR() {
    int totalADR = 0;
    for (int i = 0; i < team.size(); i++) {
      totalADR += team.get(i).getADR();
    }
    return totalADR / 5;
  }

  public int averageKAST() {
    int totalKast = 0;
    for (int i = 0; i < team.size(); i++) {
      totalKast += team.get(i).getKAST();
    }
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
