import java.io.*;
import java.util.*;

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

  }//end playGame()
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  public static void main(String[] args) {
    welcomeMessage();
  }//end main

}//end class YoRPG
