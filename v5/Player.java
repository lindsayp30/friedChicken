public class Player {
  private String name;
  private int kills, deaths, acs, adr, kast;
  private float kd;

  public Player(String n, int k, int d, int ac, int ad, int ka) {
    name = n;
    kills = k;
    deaths = d;
    acs = ac;
    adr = ad;
    kast = ka;
    kd = k/d;
  }

  public String getName() {
    return name;
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

  public String toString() {
    return name;
  }

}
