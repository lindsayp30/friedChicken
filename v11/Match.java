public class Match {
  private String mapName;
  private Team team1, team2;
  private int t1score, t2score;

  //connect team1 with t1score, team2 with t2score

  public Match() {

  }

  public Match(String m, Team t1, Team t2) {
    mapName = m;
    team1 = t1;
    team2 = t2;
  }

  public String getMap() {
    return mapName;
  }

  public void setMap(String m) {
    mapName = m;
  }

  public Team getTeam1() {
    return team1;
  }

  public Team getTeam2() {
    return team2;
  }

  public void setTeam1(String x) {
    //team1 = (Team) x;
  }

  public void setTeam2(String x) {
    //team2 = (Team) x;
  }

  public String getWinner() {
    if (t1score > t2score) {
      return team1 + "";
    }
    return team2 + "";
  }

  public String getLoser() {
    if (t1score > t2score) {
      return team2 + "";
    }
    return team1 + "";
  }

  public int getWinnerScore() {
    if (t1score > t2score) {
      return t1score;
    }
    return t2score;
  }

  public int getLoserScore() {
    if (t1score > t2score) {
      return t2score;
    }
    return t1score;
  }

  public static void main(String[] args) {
    Team uno = new Team();
    Team dos = new Team();
    Match amatch = new Match("Ascent", uno, dos);
    System.out.println(amatch.getTeam1());

  }

}
