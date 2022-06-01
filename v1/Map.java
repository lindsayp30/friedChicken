public class Map {
  private String mapName;
  private Team team1, team2;

  public Map(String m, Team t1, Team t2) {
    mapName = m;
    team1 = t1;
    team2 = t2;
  }

  public String getMap() {
    return mapName;
  }

  public Team getTeam1() {
    return team1;
  }

  public Team getTeam2() {
    return team2;
  }
}
