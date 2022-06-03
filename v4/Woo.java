import core.data.*;
import java.util.*;

public class Woo {

  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
  private int totalMoney;
  private Match thisMatch = new Match();

  private String thvs = "100 Thieves";
  private String xset = "XSET";
  private String ghst = "Ghost Gaming";
  private String grd = "The Guard";
  private String tsm = "TSM";
  private String nrg = "NRG";
  private String optc = "OpTic Gaming";
  private String eg = "Evil Geniuses";
  private String lg = "Luminosity";
  private String faze = "FaZe";
  private String c9 = "Cloud9";
  private String sen = "Sentinels";

  private String t1Choice;
  private String t2Choice;
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~
  public void welcomeMessage() {
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
  }//end newGame()

  public boolean playGame() {
    DataSource data = DataSource.connect("VCTmastersv1.csv").load();
    data.printUsageString();


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
    //Match match = new Match();
    //welcome the player into the game... explain situation
    welcomeMessage();
    //player chooses team1
    System.out.println("What teams would you like to see?");
    System.out.println("Choose team 1: ");
    String list = "1: The Guard \n2: 100 Thieves \n3: XSET \n4: Ghost Gaming \n5: NRG \n6: TSM";
    Scanner pick = new Scanner(System.in);
    String choice = pick.nextLine();
    choice = choice.toLowerCase();
    try {
      if (choice.equals("1")) {
        t1Choice = grd;
      } else if (choice.equals("2")) {
        t1Choice = thvs;
      } else if (choice.equals("3")) {
        t1Choice = xset;
      } else if (choice.equals("4")) {
        t1Choice = ghst;
      } else if (choice.equals("5")) {
        t1Choice = nrg;
      } else if (choice.equals("6")) {
        t1Choice = tsm;
      }
    }
/*  private String thvs = "100 Thieves";
  private String xset = "XSET";
  private String ghst = "Ghost Gaming";
  private String grd = "The Guard";
  private String tsm = "TSM";
  private String nrg = "NRG";
  private String optc = "OpTic Gaming";
  private String eg = "Evil Geniuses";
  private String lg = "Luminosity";
  private String faze = "FaZe";
  private String c9 = "Cloud9";
  private String sen = "Sentinels";
  */

    catch(IOException e) {
    }
    //player chooses team2
    System.out.println("Choose team 2: ");
    Scanner pick2 = new Scanner(System.in);
    String list2 = "1: The Guard \n2: 100 Thieves \n3: XSET \n4: Ghost Gaming \n5: NRG \n6: TSM";
    String choice2 = pick2.nextLine();
    choice2 = choice2.toLowerCase();
    try {
      if (!(choice2.equals(choice))) {
        if (choice.equals("1")) {
          t2Choice = grd;
        } else if (choice.equals("2")) {
          t2Choice = thvs;
        } else if (choice.equals("3")) {
          t2Choice = xset;
        } else if (choice.equals("4")) {
          t2Choice = ghst;
        } else if (choice.equals("5")) {
          t2Choice = nrg;
        } else if (choice.equals("6")) {
          t2Choice = tsm;
        }
      }
    }
    catch(IOException e) {
    }
    //player chooses map
    System.out.println("Choose a map: ");
    Scanner mapPick = new Scanner(System.in);
    String mapList = "1: Ascent \n2: Bind \n3: Breeze \n4: Split \n5: Haven \n6: Fracture \n7: Icebox";
    String mapChoice = mapList.nextLine();
    try {
        if (mapChoice.equals("1")) {
          match.setMap("Ascent");
        } else if (mapChoice.equals("2")) {
          match.setMap("Bind");
        } else if (mapChoice.equals("3")) {
          match.setMap("Breeze");
        } else if (mapChoice.equals("4")) {
          match.setMap("Split");
        } else if (mapChoice.equals("5")) {
          match.setMap("Haven");
        } else if (mapChoice.equals("6")) {
          match.setMap("Fracture");
        } else if (mapChoice.equals("7")) {
          match.setMap("Icebox");
        }
    }
    catch(IOException e) {
    }

    //ArrayList<Match> info1 = match.fetchList(team1, , team1.getMap());
    //String abc = match.fetchString("all abc's")

    choose();

  }//end main

}//end class
