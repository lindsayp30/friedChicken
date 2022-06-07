import core.data.*;
import java.util.*;
import java.io.*;

public class Woo {

  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
  private static int totalMoney;
  //private Match thisMatch = new Match();

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

  private static String t1Choice;
  private static String t2Choice;
  private static String mapChoice;
  //private static Match t1Matches = new Match();
  //private static Match t2Matches = new Match();

  private static int avACS1;
  private static int avADR1;
  private static int avKills1;
  private static int avDeaths1;
  private static int avKAST1;

  private static int avACS2;
  private static int avADR2;
  private static int avKills2;
  private static int avDeaths2;
  private static int avKAST2;

  public static final String reset = "\u001B[0m";
  public static final String yellow = "\u001B[33m";
  public static final String red = "\u001B[31m";
  public static final String red_back = "\u001B[41m";
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~
  public static void welcomeMessage() {
    String s = red_back + "<<<Preparing for hellfire>>>" + reset +
    yellow + "\nYou are kidnapped by the mafia because of your enormous debt caused" +
    "by your addiction to gambling. \nYou are offered a final chance to pay off" +
    " your debt. \nNot to worry, though, as you will be assisted with our PREDICTION" +
    "GEN." + reset + red_back + "\nWill you get off debt-free or will you suffer " +
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

  public static String choice;

  public static void playGame() {


    //player chooses team1
    System.out.println(red + "Choose team 1: " + reset);
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
    System.out.println(red + "Choose team 2: " + reset);
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
    System.out.println(red + "Choose a map: " + reset);
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

    ArrayList<Player> allPlayers  = data.fetchList("Player", "player_name", "team", "map", "kills", "deaths", "acs", "adr", "kast", "date");

    //filter out all players on team1 that match the map picked
    ArrayList<Player> team1Players = new ArrayList<Player>();
    for(Player p : allPlayers){
      if(p.getTeamName().equals(t1Choice) && p.getMap().equals(mapChoice.toLowerCase())){
        team1Players.add(p);
      }
    }
    System.out.println("players filtered in team 1: " + team1Players);


    //filter out all players on team2 that match the map picked
    ArrayList<Player> team2Players = new ArrayList<Player>();
    for(Player p : allPlayers){
      if(p.getTeamName().equals(t2Choice) && p.getMap().equals(mapChoice.toLowerCase())){
        team2Players.add(p);
      }
    }
    System.out.println("players filtered in team 2: " + team2Players);

    if (team1Players.size() == 0 && team2Players.size() == 0) {
      System.out.println(red_back + "This combination does not exist. It is up to you to guess." + reset);
    }

    //put the players on their respective teams

    //put players on team 1, separate by match dates
    ArrayList<Team> team1 = new ArrayList<Team>();
    for(int i = 0 ; i < team1Players.size() - 4; i+=5){
      team1.add(new Team(team1Players.get(i), team1Players.get(i+1), team1Players.get(i+2), team1Players.get(i+3), team1Players.get(i+4)) );
      //System.out.println(team1.get(i / 5));
    }

    //put players on team 2, separate by match dates
    ArrayList<Team> team2 = new ArrayList<Team>();
    for(int i = 0 ; i < team2Players.size() - 4; i+=5){
      team1.add(new Team(team2Players.get(i), team2Players.get(i+1), team2Players.get(i+2), team2Players.get(i+3), team2Players.get(i+4)) );
      //System.out.println(team2.get(i / 5));
    }


    for(Team t : team1) {
      avACS1 += t.averageACS();
      avADR1 += t.averageADR();
      avKills1 += t.averageKills();
      avDeaths1 += t.averageDeath();
      avKAST1 += t.averageKAST();
    }
    System.out.println(avACS1 / team1.size());







  } //end playGame()

/*
  public static void choose() {
    System.out.println("Who do you think the victor is?");
    Scanner guess = new Scanner(System.in);
    String answer = guess.nextLine();
    answer = answer.toLowerCase();
    try {
      if (answer.equals(t1Choice)) {
        if (match.getWinner().equals(t1Choice)) {
          System.out.println("Right! Take the money!");
          totalMoney += 500;
        } else {
          System.out.println("Wrong... There goes your money.");
          totalMoney -= 500;
        }
      } else if (answer.equals(t2Choice)) {
        if (match.getWinner().equals(t2Choice)) {
          System.out.println("Right! Take the money!");
          totalMoney += 500;
        } else {
          System.out.println("Wrong... There goes your money.");
          totalMoney -= 500;
        }
      }
    }
    catch(IOException e) {
    }
  }
  */
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  public static void main(String[] args) {
    Match match = new Match();
    //welcome the player into the game... explain situation
    welcomeMessage();

    playGame();

    //ArrayList<Match> info1 = match.fetchList(team1, , team1.getMap());
    //String abc = match.fetchString("all abc's")

    //choose();

  }//end main

}//end class
