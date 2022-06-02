import java.io.*;
import java.util.*;
import core.data.*;

public class Woo {

  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
  private int totalMoney;
  private Match thisMatch = new Match();

  private InputStreamReader isr;
  private BufferedReader in;
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~
  public void welcomeMessage() {
    String s;
    s = "<<<Preparing for hellfire>>>" +
    "You are kidnapped by the mafia because of your enormous debt caused by your" +
    " addiction to gambling. You are offered a final chance to pay off your debt." +
    " Not to worry, though, as you will be assisted with our PREDICTION GEN. Will" +
    " you get off debt-free or will you suffer in damnation?";
    //maybe some art or GUI feature here
    s = "Are you ready?";
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
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  public static void main(String[] args) {
    Match match = new Match();
    welcomeMessage();
    System.out.println("What teams would you like to see?");
    System.out.println("Choose team 1: ");
    String list = "1: The Guard \n2: 100 Thieves \n3: XSET \n4: Ghost Gaming \n5: NRG \n6: TSM";

    Scanner pick = new Scanner(System.in);
    String choice = pick.nextLine();
    choice = choice.toLowerCase();
    try {
      if (choice.equals("1")) {
        match.setTeam1("The Guard");
        //choices2 = "1: 100 Thieves \n2: XSET \n3: Ghost Gaming \n4: NRG \n5: TSM";
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

  }//end main

}//end class YoRPG
