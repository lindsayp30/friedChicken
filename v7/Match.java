public class Match {
  private String mapName;
  private Team team1;
  private int roundsWon, roundsLost;

  //connect team1 with roundsWon, team2 with roundsLost

  public Match() {

  }

  public Match(String m, Team t1) {
    mapName = m;
    team1 = t1;
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

  public void setTeam1(Team x) {
    team1 = x;
  }


  public String getWinner() {
    if (roundsWon > roundsLost) {
      return team1 + "";
    }
    return team2 + "";
  }

  public String getLoser() {
    if (roundsLost > roundsWon) {
      return team2 + "";
    }
    return team1 + "";
  }

  public int getWinnerScore() {
    if (roundsWon > roundsLost) {
      return roundsWon;
    }
    return roundsLost;
  }

  public int getLoserScore() {
    if (roundsWon > roundsLost) {
      return roundsLost;
    }
    return roundsWon;
  }

  public void setWon(int x){
    roundsWon = x;
  }

  public void setLost(int x){
    roundsLost = x;
  }

  public int getWon(){
    return roundsWon;
  }

  public int getLost(){
    return roundsLost;
  }

  public static void main(String[] args) {
    Team uno = new Team();
    Team dos = new Team();
    Match amatch = new Match("Ascent", uno, dos);
    System.out.println(amatch.getTeam1());

  }

}
