import core.data.*;
import java.util.*;

public class Woo {

  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
  private int totalMoney;
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
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~
  public static void welcomeMessage() {
    String s = "<<<Preparing for hellfire>>>" +
    "\nYou are kidnapped by the mafia because of your enormous debt caused by your" +
    "\n addiction to gambling. You are offered a final chance to pay off your debt." +
    "\n Not to worry, though, as you will be assisted with our PREDICTION GEN. Will" +
    "\n you get off debt-free or will you suffer in damnation?";
    //maybe some art or GUI feature here
    System.out.println("Are you ready?");
    while (true) {
      Scanner pick = new Scanner(System.in);
      String choice = pick.nextLine();
      choice = choice.toLowerCase();
      if (choice.equals("yes")) {
        break;
      }
    }
  }//end welcomeMessage()

  public static boolean playGame() {


    //player chooses team1
    System.out.println("What teams would you like to see?");
    System.out.println("Choose team 1: ");
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
    Scanner pick = new Scanner(System.in);
    String choice = pick.nextLine();
    choice = choice.toLowerCase();
    try {
      if (choice.equals("1")) {
        t1Choice = thvs;
      } else if (choice.equals("2")) {
        t1Choice = xset;
      } else if (choice.equals("3")) {
        t1Choice = ghst;
      } else if (choice.equals("4")) {
        t1Choice = grd;
      } else if (choice.equals("5")) {
        t1Choice = tsm;
      } else if (choice.equals("6")) {
        t1Choice = nrg;
      } else if (choice.equals("7")) {
        t1Choice = optc;
      } else if (choice.equals("8")) {
        t1Choice = eg;
      } else if (choice.equals("9")) {
        t1Choice = lg;
      } else if (choice.equals("10")) {
        t1Choice = faze;
      } else if (choice.equals("11")) {
        t1Choice = c9;
      } else if (choice.equals("12")) {
        t1Choice = sen;
      }
    }
    catch(IOException e) {
    }

    //player chooses team2
    System.out.println("Choose team 2: ");
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
    Scanner pick2 = new Scanner(System.in);
    String choice2 = pick2.nextLine();
    choice2 = choice2.toLowerCase();
    try {
      if (!(choice2.equals(choice))) {
        if (choice2.equals("1")) {
          t2Choice = thvs;
        } else if (choice2.equals("2")) {
          t2Choice = xset;
        } else if (choice2.equals("3")) {
          t2Choice = ghst;
        } else if (choice2.equals("4")) {
          t2Choice = grd;
        } else if (choice2.equals("5")) {
          t2Choice = tsm;
        } else if (choice2.equals("6")) {
          t2Choice = nrg;
        } else if (choice2.equals("7")) {
          t2Choice = optc;
        } else if (choice2.equals("8")) {
          t2Choice = eg;
        } else if (choice2.equals("9")) {
          t2Choice = lg;
        } else if (choice2.equals("10")) {
          t2Choice = faze;
        } else if (choice2.equals("11")) {
          t2Choice = c9;
        } else if (choice2.equals("12")) {
          t2Choice = sen;
        }
      }
    }
    catch(IOException e) {
    }

    //player chooses map
    System.out.println("Choose a map: ");
    String list3 = "1: " + fra +
    "\n2: " + bre +
    "\n3: " + ice +
    "\n4: " + bin +
    "\n5: " + hav +
    "\n6: " + spl +
    "\n7: " + asc;
    Scanner pick3 = new Scanner(System.in);
    String choice3 = pick3.nextLine();
    choice3 = choice3.toLowerCase();
    try {
      if (choice3.equals("1")) {
        mapChoice = fra;
      } else if (choice3.equals("2")) {
        mapChoice = bre;
      } else if (choice3.equals("3")) {
        mapChoice = ice;
      } else if (choice3.equals("4")) {
        mapChoice = bin;
      } else if (choice3.equals("5")) {
        mapChoice = hav;
      } else if (choice3.equals("6")) {
        mapChoice = spl;
      } else if (choice3.equals("7")) {
        mapChoice = asc;
      }
    }
    catch(IOException e) {
    }

    //load data into players
    DataSource data = DataSource.connect("VCTmastersv1.csv").load();
    data.printUsageString();
    ArrayList<Player> allPlayers  = data.fetchList("player_name", "team", "kills", "deaths", "acs", "adr", "kast");

  }//end playGame()

  public void choose() {
    System.out.println("Who do you think the victor is?");
    Scanner guess = new Scanner(System.in);
    String answer = guess.nextLine();
    answer = answer.toLowerCase();
    try {
      if (answer.equals(team1.getName())) {
        if (match.getWinner() == team1) {

        } else {

        }
      } else if (answer.equals(team2.getName())) {
        if (match.getWinner() == team2) {

        } else {

        }
      }
    }
    catch(IOException e) {
    }
  }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  public static void main(String[] args) {
    Match match = new Match();
    //welcome the player into the game... explain situation
    welcomeMessage();

    playGame();

    //ArrayList<Match> info1 = match.fetchList(team1, , team1.getMap());
    //String abc = match.fetchString("all abc's")

    choose();

  }//end main

}//end class
