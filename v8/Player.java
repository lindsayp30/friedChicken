public class Player {
  private String name, team_name, map, date;
  private int kills, deaths, acs, adr, kast;
  private float kd;

  public Player(String b){
    name = b;
  }

  public Player(String n, String t, String m, int k, int d, int ac, int ad, int ka, String da) {
    name = n;
    team_name = t;
    kills = k;
    map = m;
    deaths = d;
    acs = ac;
    adr = ad;
    kast = ka;
    kd = k/d;
    date = da;
  }

  public String getName() {
    return name;
  }

  public String getTeamName(){
    return team_name;
  }

  public String getMap() {
    return map;
  }

  public int getKills() {
    return kills;
  }

  public int getDeaths() {
    return deaths;
  }

  public float getKDRatio(){
    return kd;
  }

  public int getACS() {
    return acs;
  }

  public int getADR() {
    return adr;
  }

  public int getKAST() {
    return kast;
  }

  public String getDate(){
    return date;
  }

  public String toString() {
    return name;
  }

}
