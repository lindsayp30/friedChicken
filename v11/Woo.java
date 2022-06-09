import core.data.*;
import java.util.*;
import java.io.*;

public class Woo {

  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
  private static int totalMoney = 1000000;

  private static String thvs = "100 Thieves";
  private static String xset = "XSET";
  private static String ghst = "Ghost Gaming";
  private static String grd = "The Guard";
  private static String tsm = "TSM";
  private static String nrg = "NRG";
  private static String optc = "OpTic Gaming";
  private static String eg = "Evil Geniuses";
  private static String lg = "Luminosity";
  private static String faze = "FaZe";
  private static String c9 = "Cloud9";
  private static String sen = "Sentinels";

  private static String fra = "Fracture";
  private static String bre = "Breeze";
  private static String ice = "Icebox";
  private static String bin = "Bind";
  private static String hav = "Haven";
  private static String spl = "Split";
  private static String asc = "Ascent";

  public static String choice;
  private static String t1Choice;
  private static String t2Choice;
  private static String mapChoice;

  private static int avACS1;
  private static int avADR1;
  private static int avKills1;
  private static int avDeaths1;
  private static int avKAST1;
  private static int avRounds1;

  private static int avACS2;
  private static int avADR2;
  private static int avKills2;
  private static int avDeaths2;
  private static int avKAST2;
  private static int avRounds2;

  private static boolean ACSGreater1;
  private static boolean ADRGreater1;
  private static boolean killsGreater1;
  private static boolean deathsGreater1;
  private static boolean KASTGreater1;
  private static boolean roundsGreater1;

  private static String choice4;

  private static int t1Count;
  private static int t2Count;

  private static Team predWinner;
  private static String predMVP;

  public static final String reset = "\u001B[0m";
  public static final String yellow = "\u001B[33m";
  public static final String red = "\u001B[31m";
  public static final String red_back = "\u001B[41m";
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~
  public static void welcomeMessage() {
    String s = red_back + "<<<Preparing for hellfire>>>" + reset +
    yellow + "\nYou are kidnapped by the mafia because of your enormous debt caused" +
    " by your addiction to gambling. \nYou are offered a final chance to pay off" +
    " your debt. \nNot to worry, though, as you will be assisted with our PREDICTION" +
    "_GEN." + reset + red_back + "\nWill you get off debt-free or will you suffer " +
    "in damnation?" + reset;
    System.out.println(s);
    System.out.println(yellow + "Are you ready?" + reset);
    while (true) {
      Scanner pick = new Scanner(System.in);
      String choice = pick.nextLine();
      choice = choice.toLowerCase();
      if (choice.equals("yes")) {
        break;
      }
    }
  }//end welcomeMessage()


  public static void playGame() {

    //player chooses team1
    System.out.println("\n" + red + "Choose team 1: " + reset);
    String list = "1: " + thvs +
    "\n2: " + xset +
    "\n3: " + ghst +
    "\n4: " + grd +
    "\n5: " + tsm +
    "\n6: " + nrg +
    "\n7: " + optc +
    "\n8: " + eg +
    "\n9: " + lg +
    "\n10: " + faze +
    "\n11: " + c9 +
    "\n12: " + sen;
    System.out.println(list);
    while (true) {
      Scanner pick = new Scanner(System.in);
      choice = pick.nextLine();
      choice = choice.toLowerCase();
      int numChoice = Integer.parseInt(choice);
      if ((0 < numChoice) && (numChoice < 13)) {
        if (choice.equals("1")) {
          t1Choice = thvs;
          break;
        } else if (choice.equals("2")) {
          t1Choice = xset;
          break;
        } else if (choice.equals("3")) {
          t1Choice = ghst;
          break;
        } else if (choice.equals("4")) {
          t1Choice = grd;
          break;
        } else if (choice.equals("5")) {
          t1Choice = tsm;
          break;
        } else if (choice.equals("6")) {
          t1Choice = nrg;
          break;
        } else if (choice.equals("7")) {
          t1Choice = optc;
          break;
        } else if (choice.equals("8")) {
          t1Choice = eg;
          break;
        } else if (choice.equals("9")) {
          t1Choice = lg;
          break;
        } else if (choice.equals("10")) {
          t1Choice = faze;
          break;
        } else if (choice.equals("11")) {
          t1Choice = c9;
          break;
        } else if (choice.equals("12")) {
          t1Choice = sen;
          break;
        }
      }
    }


    //player chooses team2
    System.out.println("\n" + red + "Choose team 2: " + reset);
    String list2 = "1: " + thvs +
    "\n2: " + xset +
    "\n3: " + ghst +
    "\n4: " + grd +
    "\n5: " + tsm +
    "\n6: " + nrg +
    "\n7: " + optc +
    "\n8: " + eg +
    "\n9: " + lg +
    "\n10: " + faze +
    "\n11: " + c9 +
    "\n12: " + sen;
    System.out.println(list2);
    while (true) {
    Scanner pick2 = new Scanner(System.in);
    String choice2 = pick2.nextLine();
    choice2 = choice2.toLowerCase();
    int numChoice2 = Integer.parseInt(choice2);
    if (!(choice2.equals(choice))) {
      if ((0 < numChoice2) && (numChoice2 < 13)) {
        if (choice2.equals("1")) {
          t2Choice = thvs;
          break;
        } else if (choice2.equals("2")) {
          t2Choice = xset;
          break;
        } else if (choice2.equals("3")) {
          t2Choice = ghst;
          break;
        } else if (choice2.equals("4")) {
          t2Choice = grd;
          break;
        } else if (choice2.equals("5")) {
          t2Choice = tsm;
          break;
        } else if (choice2.equals("6")) {
          t2Choice = nrg;
          break;
        } else if (choice2.equals("7")) {
          t2Choice = optc;
          break;
        } else if (choice2.equals("8")) {
          t2Choice = eg;
          break;
        } else if (choice2.equals("9")) {
          t2Choice = lg;
          break;
        } else if (choice2.equals("10")) {
          t2Choice = faze;
          break;
        } else if (choice2.equals("11")) {
          t2Choice = c9;
          break;
        } else if (choice2.equals("12")) {
          t2Choice = sen;
          break;
        }
      }
  }
}

    //player chooses map
    System.out.println("\n" + red + "Choose a map: " + reset);
    String list3 = "1: " + fra +
    "\n2: " + bre +
    "\n3: " + ice +
    "\n4: " + bin +
    "\n5: " + hav +
    "\n6: " + spl +
    "\n7: " + asc;
    System.out.println(list3);
    while (true) {
    Scanner pick3 = new Scanner(System.in);
    String choice3 = pick3.nextLine();
    choice3 = choice3.toLowerCase();
    int numChoice3 = Integer.parseInt(choice3);
      if ((0 < numChoice3) && (numChoice3 < 8)) {
      if (choice3.equals("1")) {
        mapChoice = fra;
        break;
      } else if (choice3.equals("2")) {
        mapChoice = bre;
        break;
      } else if (choice3.equals("3")) {
        mapChoice = ice;
        break;
      } else if (choice3.equals("4")) {
        mapChoice = bin;
        break;
      } else if (choice3.equals("5")) {
        mapChoice = hav;
        break;
      } else if (choice3.equals("6")) {
        mapChoice = spl;
        break;
      } else if (choice3.equals("7")) {
        mapChoice = asc;
        break;
      }
    }
  }


    //load data into players
    DataSource data = DataSource.connect("./VCTmastersv8.csv").load();

    ArrayList<Player> allPlayers  = data.fetchList("Player", "player_name", "team", "map", "kills", "deaths", "acs", "adr", "kast", "date", "rounds_won", "rounds_lost");

    //filter out all players on team1 that match the map picked
    ArrayList<Player> team1Players = new ArrayList<Player>();
    for(Player p : allPlayers){
      if(p.getTeamName().equals(t1Choice) && p.getMap().equals(mapChoice.toLowerCase())){
        team1Players.add(p);
      }
    }

    //filter out all players on team2 that match the map picked
    ArrayList<Player> team2Players = new ArrayList<Player>();
    for(Player p : allPlayers){
      if(p.getTeamName().equals(t2Choice) && p.getMap().equals(mapChoice.toLowerCase())){
        team2Players.add(p);
      }
    }

    //put players on team 1, separate by match dates
    ArrayList<Team> team1 = new ArrayList<Team>();
    for(int i = 0 ; i <= team1Players.size() - 5; i+=5){
      team1.add(new Team(team1Players.get(i), team1Players.get(i+1), team1Players.get(i+2), team1Players.get(i+3), team1Players.get(i+4)) );
      //System.out.println(team1.get(i / 5));
    }

    //put players on team 2, separate by match dates
    ArrayList<Team> team2 = new ArrayList<Team>();
    for(int i = 0 ; i <= team2Players.size() - 5; i+=5){
      team2.add(new Team(team2Players.get(i), team2Players.get(i+1), team2Players.get(i+2), team2Players.get(i+3), team2Players.get(i+4)) );
      //System.out.println(team2.get(i / 5));
    }

    //collect average statistics for team 1 over all instances of maps
    for(Team t : team1) {
      avACS1 += t.averageACS();
      avADR1 += t.averageADR();
      avKills1 += t.averageKills();
      avDeaths1 += t.averageDeath();
      avKAST1 += t.averageKAST();
      avRounds1 += t.getRoundDifference();
    }

    avACS1 /= team1.size();
    avADR1 /= team1.size();
    avKills1 /= team1.size();
    avDeaths1 /= team1.size();
    avKAST1 /= team1.size();
    avRounds1 /= team1.size();

    //collect average statistics for team 2 over all instances of maps
    for(Team t : team2) {
      avACS2 += t.averageACS();
      avADR2 += t.averageADR();
      avKills2 += t.averageKills();
      avDeaths2 += t.averageDeath();
      avKAST2 += t.averageKAST();
      avRounds2 += t.getRoundDifference();
    }

    avACS2 /= team2.size();
    avADR2 /= team2.size();
    avKills2 /= team2.size();
    avDeaths2 /= team2.size();
    avKAST2 /= team2.size();
    avRounds2 /= team2.size();


    //print statistics for each team
    if (team1.size() == 0 || team2.size() == 0) {
      System.out.println(red_back + "This combination does not exist. It is up to you to guess." + reset);
    } else {
      System.out.println("\n" + red_back + "<<<STATS FOR TEAM 1>>>" + reset);
      System.out.println("average ACS:" + avACS1 );
      System.out.println("average ADR:" + avADR1 );
      System.out.println("average kills:" + avKills1 );
      System.out.println("average deaths:" + avDeaths1 );
      System.out.println("average KAST:" + avKAST1 );
      System.out.println("average round difference:" + avRounds1 );

      System.out.println("\n" + red_back + "<<<STATS FOR TEAM 2>>>" + reset);
      System.out.println("average ACS:" + avACS2 );
      System.out.println("average ADR:" + avADR2 );
      System.out.println("average kills:" + avKills2 );
      System.out.println("average deaths:" + avDeaths2 );
      System.out.println("average KAST:" + avKAST2 );
      System.out.println("average round difference:" + avRounds2 );

    }

    System.out.println("\n" + yellow + "Choose the victor: " +
    "\n1: " + t1Choice + "\n2: " + t2Choice + "" + reset);

    while (true) {
      Scanner pick4 = new Scanner(System.in);
      choice4 = pick4.nextLine();
      choice4 = choice4.toLowerCase();
      if (choice4.equals("1")) {
        break;
      } else if (choice4.equals("2")) {
        break;
      } else {

      }
    }

    if (choice4.equals("1")) {
    System.out.println("\n" + yellow + "Choose the MVP: " + "\n" + "Team 1 Players: " + reset);
    for (int i = 0; i < team1Players.size(); i++) {
      System.out.println(i + ": " + team1Players.get(i).getName());
    }
  } else {
    System.out.println(yellow + "\n" + "Team 2 Players: " + reset);
    for (int j = 0; j < team2Players.size(); j++) {
      System.out.println(j + ": " + team2Players.get(j).getName());
    }
  }

    // while (true) {
    //   Scanner pick5 = new Scanner(System.in);
    //   String choice5 = pick5.nextLine();
    //   choice5 = choice5.toLowerCase();
    //   if ()
    //   for (int k = 0; k < team1Players.size(); k++) {
    //
    //   }
    //   if (name.equals(choice5))
    //   break;
    // } //ends while loop

    if (totalMoney <= 0) {
      System.out.println("\n" + red + "Your life was taken away due to your inability to read stats." + reset);
      System.exit(0);
    }
    System.out.println("\n" + yellow + "Insert the amount you would like to bet (must be greater than $50,000): " + reset);
    System.out.println("Remaining money: " + totalMoney);
    Scanner playerBet = new Scanner(System.in);
    String choice6 = playerBet.next();
    int theBet = Integer.parseInt(choice6);
    while (true) {
      if(theBet >= 50000) {
        totalMoney -= theBet;
        break;
      } else {
        System.out.println("That is not a valid amount.");
        Scanner playerBetr = new Scanner(System.in);
        String choice6r = playerBet.next();
        int theBet = Integer.parseInt(choice6r);
      }
    }

    //make our prediction
    //compare each team's average statistics

    //ACS compare
    if(avACS1 > avACS2){
      ACSGreater1 = true;
      t1Count +=1;
    }
    else {
      ACSGreater1 = false;
      t2Count +=1;
    }

    //ADR compare
    if(avADR1 > avADR2){
      ADRGreater1 = true;
      t1Count +=1;

    }
    else {
      ADRGreater1 = false;
      t2Count +=1;

    }

    //kills compare
    if(avKills1 > avKills2){
      killsGreater1 = true;
      t1Count +=1;
    }
    else {
      killsGreater1 = false;
      t2Count +=1;

    }

    //deaths compare
    if(avDeaths1 < avDeaths2){
      deathsGreater1 = false;
      t1Count +=1;
    }
    else {
      deathsGreater1 = true;
      t2Count +=1;

    }

    //KAST compare
    if(avKAST1 > avKAST2){
      KASTGreater1 = true;
      t1Count +=1;
    }
    else {
      KASTGreater1 = false;
      t2Count +=1;

    }

    //round diff compare
    if(avRounds1 > avRounds2){
      roundsGreater1 = true;
      t1Count +=1;
    }
    else {
      roundsGreater1 = false;
      t2Count +=1;

    }


    //have counter to see who has more stats that are better
    //greater number means team will win
    //if equal, 50/50 chance of either team winning
    if(t1Count > t2Count){
      predWinner = team1.get(0);
      predMVP = team1.get(0).calcMVP();
    }
    else if( t2Count > t1Count){
      predWinner = team2.get(0);
      predMVP = team2.get(0).calcMVP();
    }
    else if(t1Count == t2Count){
      System.out.println("Both teams have an equal chance of winning.");
      System.out.println("Remaining money: "+ totalMoney);
    }

    System.out.println("\nLet's see if your guess on the winning team is right...");
    if (choice4.equals(predWinner)) {
      delay(1000);
      System.out.println(yellow + "Right on!" + reset);
      totalMoney += theBet;
      delay(1000);
      System.out.println("Remaining money: "+ totalMoney);
    } else {
      delay(1000);
      System.out.println(red + "Very off..." + reset);
      delay(1000);
      System.out.println("Remaining money: "+ totalMoney);
    }

    System.out.println("\nLet's see if your guess on the MVP is right...");
    if (choice4.equals(predMVP)) {
      delay(1000);
      System.out.println(yellow + "Right on!" + reset);
      totalMoney += theBet;
      delay(1000);
      System.out.println("Remaining money: "+ totalMoney);
    } else {
      delay(1000);
      System.out.println(red + "Very off..." + reset);
      delay(1000);
      System.out.println("Remaining money: "+ totalMoney);
    }

  } //end playGame()

  private static void delay( int n )
  {
  try {
    Thread.sleep(n);
  } catch( InterruptedException e ) {
    System.exit(0);
  }
  }

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  public static void main(String[] args) {
    //welcome the player into the game... explain situation
    welcomeMessage();

    for (int i = 0; i < 3; i++) {
      playGame();
      delay(1000);
    }

    delay(1000);
    if (totalMoney > 0) {
      System.out.println("\n" + yellow + "You successfully escaped! Your debt is non-existent" +
      " and now you can enjoy your life. :)" + reset);
    } else {
      System.out.println("Remaining money: "+ totalMoney);
      System.out.println("\n" + red + "You didn't escape... Your life was taken away from" +
      " you." + reset);
    }

  }//end main

}//end class
