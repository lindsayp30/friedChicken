import java.io.*;
import java.util.*;
import core.data.*;

public class Woo {

  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
  private int totalMoney;
  private Match thisMatch = new Match();

  private InputStreamReader isr;
  private BufferedReader in;
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
        match.setTeam1("The Guard");
      } else if (choice.equals("2")) {
        match.setTeam1("The 100 Thieves");
      } else if (choice.equals("3")) {
        match.setTeam1("XSET");
      } else if (choice.equals("4")) {
        match.setTeam1("Ghost Gaming");
      } else if (choice.equals("5")) {
        match.setTeam1("NRG");
      } else if (choice.equals("6")) {
        match.setTeam1("TSM");
      }
    }
    catch(IOException e) {
    }
    //player chooses team2
    System.out.println("Choose team 2: ");
    Scanner pick2 = new Scanner(System.in);
    String list2 = "1: The Guard \n2: 100 Thieves \n3: XSET \n4: Ghost Gaming \n5: NRG \n6: TSM";
    String choice2 = pick2.nextLine();
    choice2 = choice2.toLowerCase();
    try {
      if !(choice2.equals(choice)) {
        if (choice2.equals("1")) {
          match.setTeam2("The Guard");
        } else if (choice2.equals("2")) {
          match.setTeam2("The 100 Thieves");
        } else if (choice2.equals("3")) {
          match.setTeam2("XSET");
        } else if (choice2.equals("4")) {
          match.setTeam2("Ghost Gaming");
        } else if (choice2.equals("5")) {
          match.setTeam2("NRG");
        } else if (choice2.equals("6")) {
          match.setTeam2("TSM");
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

    /* PRINTING STATS BS
    ArrayList<Match> info1 = match.fetchList(team1.getName(), team1.getMap());
    String abc = match.fetchString("all abc's")
    */

    choose();

  }//end main

}//end class
