//----------GUI----------
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//-----------------------

//----------WOO----------
// import core.data.*;
import java.util.*;
import java.io.*;
//-----------------------

public class GUI {

//----------GUI----------
  JFrame game;
  Container con;
  JPanel titlePanel, startLabel, text, choicePanel, playerPanel;
  JLabel titleLabel, moneyLabel;
  Font titleFont = new Font("Blaka", Font.PLAIN, 65);
  Font font = new Font("Anton", Font.PLAIN, 15);
  JButton startButton, choice1, choice2, choice3, choice4, choice5, choice6, choice7, choice8, choice9, choice10, choice11, choice12;
  JTextArea textArea;

  String round;

  TitleScreenHandler tsHandler = new TitleScreenHandler();
  ChoiceHandler choiceHandler = new ChoiceHandler();
//-----------------------

//----------WOO----------
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

// private static String choice4;

private static int t1Count;
private static int t2Count;

private static Team predWinner;
private static String predMVP;
private static Team yourWinner;
private static String yourMVP;

public static final String reset = "\u001B[0m";
public static final String yellow = "\u001B[33m";
public static final String red = "\u001B[31m";
public static final String red_back = "\u001B[41m";
//-----------------------

  public GUI() {
    game = new JFrame();
    game.setSize(800, 600);
    game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    game.getContentPane().setBackground(Color.black);
    game.setLayout(null);
    game.setVisible(true);
    con = game.getContentPane();

    titlePanel = new JPanel();
    titlePanel.setBounds(100, 100, 600, 150);
    titleLabel = new JLabel("VCT Match Predictor");
    titleLabel.setFont(titleFont);

    startLabel = new JPanel();
    startLabel.setBounds(300, 400, 200, 100);
    startLabel.setBackground(Color.black);
    startButton = new JButton("PREPARE FOR HELLFIRE");
    startButton.setFont(font);
    startLabel.addActionListener(tsHandler);
    startLabel.setFocusPainted(false);

    titlePanel.add(titleLabel);
    startLabel.add(startLabel);

    con.add(titlePanel);
    con.add(startButton);
  }

  public void createGameScreen() {
    titlePanel.setVisible(false);
    startLabel.setVisible(false);

    text = new JPanel();
    text.setBounds(100, 100, 600, 250);
    text.setBackground(Color.black);
    con.add(text);

    textArea = new JTextArea();
    textArea.setBounds(100, 100, 600, 250);
    textArea.setBackground(Color.white);
    textArea.setForeground(Color.black);
    textArea.setFont(font);
    textArea.setLineWrap(true);
    text.add(textArea);

    choicePanel = new JPanel();
    choicePanel.setBounds(250, 350, 300, 150);
    choicePanel.setBackground(Color.white);
    choicePanel.setLayout(new GridLayout(4, 3));
    con.add(choicePanel);

    choice1 = new JButton();
    choice1.setBackground(Color.black);
    choice1.setForeground(Color.white);
    choice1.setFont(font);
    choice1.setFocusPainted(false);
    choice1.addActionListener(choiceHandler);
    choice1.setActionCommand("1");
    choicePanel.add(choice1);

    choice2 = new JButton();
    choice2.setBackground(Color.black);
    choice2.setForeground(Color.white);
    choice2.setFont(font);
    choice2.setFocusPainted(false);
    choice2.addActionListener(choiceHandler);
    choice2.setActionCommand("2");
    choicePanel.add(choice2);

    choice3 = new JButton();
    choice3.setBackground(Color.black);
    choice3.setForeground(Color.white);
    choice3.setFont(font);
    choice3.setFocusPainted(false);
    choice3.addActionListener(choiceHandler);
    choice3.setActionCommand("3");
    choicePanel.add(choice3);

    choice4 = new JButton();
    choice4.setBackground(Color.black);
    choice4.setForeground(Color.white);
    choice4.setFont(font);
    choice4.setFocusPainted(false);
    choice4.addActionListener(choiceHandler);
    choice3.setActionCommand("4");
    choicePanel.add(choice4);

    choice5 = new JButton();
    choice5.setBackground(Color.black);
    choice5.setForeground(Color.white);
    choice5.setFont(font);
    choice5.setFocusPainted(false);
    choice5.addActionListener(choiceHandler);
    choice5.setActionCommand("5");
    choicePanel.add(choice5);

    choice6 = new JButton();
    choice6.setBackground(Color.black);
    choice6.setForeground(Color.white);
    choice6.setFont(font);
    choice6.setFocusPainted(false);
    choice6.addActionListener(choiceHandler);
    choice6.setActionCommand("6");
    choicePanel.add(choice6);

    choice7 = new JButton();
    choice7.setBackground(Color.black);
    choice7.setForeground(Color.white);
    choice7.setFont(font);
    choice7.setFocusPainted(false);
    choice7.addActionListener(choiceHandler);
    choice7.setActionCommand("7");
    choicePanel.add(choice7);

    choice8 = new JButton();
    choice8.setBackground(Color.black);
    choice8.setForeground(Color.white);
    choice8.setFont(font);
    choice8.setFocusPainted(false);
    choice8.addActionListener(choiceHandler);
    choice8.setActionCommand("8");
    choicePanel.add(choice8);

    choice9 = new JButton();
    choice9.setBackground(Color.black);
    choice9.setForeground(Color.white);
    choice9.setFont(font);
    choice9.setFocusPainted(false);
    choice9.addActionListener(choiceHandler);
    choice9.setActionCommand("9");
    choicePanel.add(choice9);

    choice10 = new JButton();
    choice10.setBackground(Color.black);
    choice10.setForeground(Color.white);
    choice10.setFont(font);
    choice10.setFocusPainted(false);
    choice10.addActionListener(choiceHandler);
    choice10.setActionCommand("10");
    choicePanel.add(choice10);

    choice11 = new JButton();
    choice11.setBackground(Color.black);
    choice11.setForeground(Color.white);
    choice11.setFont(font);
    choice11.setFocusPainted(false);
    choice11.addActionListener(choiceHandler);
    choice11.setActionCommand("11");
    choicePanel.add(choice11);

    choice12 = new JButton();
    choice12.setBackground(Color.black);
    choice12.setForeground(Color.white);
    choice12.setFont(font);
    choice12.setFocusPainted(false);
    choice12.addActionListener(choiceHandler);
    choice12.setActionCommand("12");
    choicePanel.add(choice12);

    playerPanel = new JPanel();
    playerPanel.setBounds(100, 15, 600, 50);
    playerPanel.setBackground(Color.white);
    con.add(playerPanel);
    moneyLabel = new JLabel("money: ");
    moneyLabel.setFont(font);
    // moneyLabel.setForeground(Color.white);
    playerPanel.add(moneyLabel);

    playerSetUp();
  }

  public void playerSetUp() {
    moneyLabel.setText(" " + totalMoney);

    welcomeMessage();
    chooseTeam1();
  }

  public void welcomeMessage() {
    round = "welcome";
    textArea.setText("\nYou are kidnapped by the mafia because of your enormous debt caused" +
    " by your addiction to gambling. You are offered a final chance to pay off" +
    " your debt. Not to worry, though, as you will be assisted with our PREDICTION" +
    "_GEN." + "\nWill you get off debt-free or will you suffer in damnation?");
    choice1.setText("No.");
    choice2.setText("Yes.");
    choice3.setText("No.");
    choice4.setText("No.");
    choice5.setText("No.");
    choice6.setText("Yes.");
    choice7.setText("No.");
    choice8.setText("No.");
    choice9.setText("No.");
    choice10.setText("No.");
    choice11.setText("No.");
    choice12.setText("No.");

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
  }

  public void chooseTeam1() {
    round = "team1";
    textArea.setText("Choose team 1: " +
    "\n1: " + thvs +
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
    "\n12: " + sen);
    choice1.setText("1");
    choice2.setText("2");
    choice3.setText("3");
    choice4.setText("4");
    choice5.setText("5");
    choice6.setText("6");
    choice7.setText("7");
    choice8.setText("8");
    choice9.setText("9");
    choice10.setText("10");
    choice11.setText("11");
    choice12.setText("12");
  }

  public void chooseTeam2() {
    round = "team2";
    textArea.setText("Choose team 2: " +
    "\n1: " + thvs +
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
    "\n12: " + sen);
    choice1.setText("1");
    choice2.setText("2");
    choice3.setText("3");
    choice4.setText("4");
    choice5.setText("5");
    choice6.setText("6");
    choice7.setText("7");
    choice8.setText("8");
    choice9.setText("9");
    choice10.setText("10");
    choice11.setText("11");
    choice12.setText("12");
  }

  public void chooseMap() {
    round = "map";
    textArea.setText("Choose a map: " +
    "\n1: " + fra +
    "\n2: " + bre +
    "\n3: " + ice +
    "\n4: " + bin +
    "\n5: " + hav +
    "\n6: " + spl +
    "\n7: " + asc);
    choice1.setText("1");
    choice2.setText("2");
    choice3.setText("3");
    choice4.setText("4");
    choice5.setText("5");
    choice6.setText("6");
    choice7.setText("7");
    choice8.setText("");
    choice9.setText("");
    choice10.setText("");
    choice11.setText("");
    choice12.setText("");
  }

  public void chooseVictor() {
    round = "victor";
    textArea.setText("Choose a victor: " +
    "\n<<<STATS FOR TEAM 1>>>" +
    "average ACS:" + avACS1 +
    "average ADR:" + avADR1 +
    "average kills:" + avKills1 +
    "average deaths:" + avDeaths1 +
    "average KAST:" + avKAST1 +
    "average round difference:" + avRounds1 +

    "\n<<<STATS FOR TEAM 2>>>" +
    "average ACS:" + avACS2 +
    "average ADR:" + avADR2 +
    "average kills:" + avKills2 +
    "average deaths:" + avDeaths2 +
    "average KAST:" + avKAST2 +
    "average round difference:" + avRounds2);
    choice1.setText("");
    choice2.setText("");
    choice3.setText("");
    choice4.setText("");
    choice5.setText(team1);
    choice6.setText("");
    choice7.setText("");
    choice8.setText(team2);
    choice9.setText("");
    choice10.setText("");
    choice11.setText("");
    choice12.setText("");
  }

  public class TitleScreenHandler implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      createGameScreen();
    }
  }

  public class ChoiceHandler implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      String yourChoice = event.getActionCommand();

      switch(round) {
      case "welcome":
          switch(yourChoice) {
          case "1": break;
          case "2": break;
          case "3": break;
          case "4": break;
          case "5": break;
          case "6": chooseTeam1(); break;
          case "7": break;
          case "8": break;
          case "9": break;
          case "10": break;
          case "11": break;
          case "12": break;
        }
        break;
      case "team1":
          switch(yourChoice) {
          case "1": t1Choice = thvs; chooseTeam2(); break;
          case "2": t1Choice = xset; chooseTeam2(); break;
          case "3": t1Choice = ghst; chooseTeam2(); break;
          case "4": t1Choice = grd; chooseTeam2(); break;
          case "5": t1Choice = tsm; chooseTeam2(); break;
          case "6": t1Choice = nrg; chooseTeam2(); break;
          case "7": t1Choice = optc; chooseTeam2(); break;
          case "8": t1Choice = eg; chooseTeam2(); break;
          case "9": t1Choice = lg; chooseTeam2(); break;
          case "10": t1Choice = faze; chooseTeam2(); break;
          case "11": t1Choice = c9; chooseTeam2(); break;
          case "12": t1Choice = sen; chooseTeam2(); break;
          }
          break;
       case "team2":
          switch(yourChoice) {
            case "1": t2Choice = thvs; chooseMap(); break;
            case "2": t2Choice = xset; chooseMap(); break;
            case "3": t2Choice = ghst; chooseMap(); break;
            case "4": t2Choice = grd; chooseMap(); break;
            case "5": t2Choice = tsm; chooseMap(); break;
            case "6": t2Choice = nrg; chooseMap(); break;
            case "7": t2Choice = optc; chooseMap(); break;
            case "8": t2Choice = eg; chooseMap(); break;
            case "9": t2Choice = lg; chooseMap(); break;
            case "10": t2Choice = faze; chooseMap(); break;
            case "11": t2Choice = c9; chooseMap(); break;
            case "12": t2Choice = sen; chooseMap(); break;
          }
          break;
        case "map":
          switch(yourChoice) {
            case "1": mapChoice = fra; ch(); break;
            case "2": mapChoice = bre; chooseVictor(); break;
            case "3": mapChoice = ice; chooseVictor(); break;
            case "4": mapChoice = bin; chooseVictor(); break;
            case "5": mapChoice = hav; chooseVictor(); break;
            case "6": mapChoice = spl; chooseVictor(); break;
            case "7": mapChoice = asc; chooseVictor(); break;
            case "8": break;
            case "9": break;
            case "10": break;
            case "11": break;
            case "12": break;
          }
          break;
      }
  }
}

  public void ending() {
    round = "ending";

    textArea.setText("ME: You're done.");

    choice1.setText("");
    choice2.setText("");
    choice3.setText("");
    choice4.setText("");
    choice1.setVisible(false);
    choice2.setVisible(false);
    choice3.setVisible(false);
    choice4.setVisible(false);
  }

  public static void main(String[] args) {
    new GUI();
  }

}


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

// private static String choice4;

private static int t1Count;
private static int t2Count;

private static Team predWinner;
private static String predMVP;
private static Team yourWinner;
private static String yourMVP;

public static final String reset = "\u001B[0m";
public static final String yellow = "\u001B[33m";
public static final String red = "\u001B[31m";
public static final String red_back = "\u001B[41m";
//-----------------------

  public GUI() {
    game = new JFrame();
    game.setSize(800, 600);
    game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    game.getContentPane().setBackground(Color.black);
    game.setLayout(null);
    game.setVisible(true);
    con = game.getContentPane();

    titlePanel = new JPanel();
    titlePanel.setBounds(100, 100, 600, 150);
    titleLabel = new JLabel("VCT Match Predictor");
    titleLabel.setFont(titleFont);

    startButton = new JPanel();
    startButton.setBounds(300, 400, 200, 100);
    startButton.setBackground(Color.black);
    startButton = new JButton("PREPARE FOR HELLFIRE");
    startButton.setFont(font);
    startButton.addActionListener(tsHandler);
    startButton.setFocusPainted(false);

    titlePanel.add(titleLabel);
    startButton.add(startButton);

    con.add(titlePanel);
    con.add(startButton);
  }

  public void createGameScreen() {
    titlePanel.setVisible(false);
    startButton.setVisible(false);

    text = new JPanel();
    text.setBounds(100, 100, 600, 250);
    text.setBackground(Color.black);
    con.add(text);

    textArea = new JTextArea();
    textArea.setBounds(100, 100, 600, 250);
    textArea.setBackground(Color.white);
    textArea.setForeground(Color.black);
    textArea.setFont(font);
    textArea.setLineWrap(true);
    text.add(textArea);

    choicePanel = new JPanel();
    choicePanel.setBounds(250, 350, 300, 150);
    choicePanel.setBackground(Color.white);
    choicePanel.setLayout(new GridLayout(4, 3));
    con.add(choicePanel);

    choice1 = new JButton();
    choice1.setBackground(Color.black);
    choice1.setForeground(Color.white);
    choice1.setFont(font);
    choice1.setFocusPainted(false);
    choice1.addActionListener(choiceHandler);
    choice1.setActionCommand("1");
    choicePanel.add(choice1);

    choice2 = new JButton();
    choice2.setBackground(Color.black);
    choice2.setForeground(Color.white);
    choice2.setFont(font);
    choice2.setFocusPainted(false);
    choice2.addActionListener(choiceHandler);
    choice2.setActionCommand("2");
    choicePanel.add(choice2);

    choice3 = new JButton();
    choice3.setBackground(Color.black);
    choice3.setForeground(Color.white);
    choice3.setFont(font);
    choice3.setFocusPainted(false);
    choice3.addActionListener(choiceHandler);
    choice3.setActionCommand("3");
    choicePanel.add(choice3);

    choice4 = new JButton();
    choice4.setBackground(Color.black);
    choice4.setForeground(Color.white);
    choice4.setFont(font);
    choice4.setFocusPainted(false);
    choice4.addActionListener(choiceHandler);
    choice3.setActionCommand("4");
    choicePanel.add(choice4);

    choice5 = new JButton();
    choice5.setBackground(Color.black);
    choice5.setForeground(Color.white);
    choice5.setFont(font);
    choice5.setFocusPainted(false);
    choice5.addActionListener(choiceHandler);
    choice5.setActionCommand("5");
    choicePanel.add(choice5);

    choice6 = new JButton();
    choice6.setBackground(Color.black);
    choice6.setForeground(Color.white);
    choice6.setFont(font);
    choice6.setFocusPainted(false);
    choice6.addActionListener(choiceHandler);
    choice6.setActionCommand("6");
    choicePanel.add(choice6);

    choice7 = new JButton();
    choice7.setBackground(Color.black);
    choice7.setForeground(Color.white);
    choice7.setFont(font);
    choice7.setFocusPainted(false);
    choice7.addActionListener(choiceHandler);
    choice7.setActionCommand("7");
    choicePanel.add(choice7);

    choice8 = new JButton();
    choice8.setBackground(Color.black);
    choice8.setForeground(Color.white);
    choice8.setFont(font);
    choice8.setFocusPainted(false);
    choice8.addActionListener(choiceHandler);
    choice8.setActionCommand("8");
    choicePanel.add(choice8);

    choice9 = new JButton();
    choice9.setBackground(Color.black);
    choice9.setForeground(Color.white);
    choice9.setFont(font);
    choice9.setFocusPainted(false);
    choice9.addActionListener(choiceHandler);
    choice9.setActionCommand("9");
    choicePanel.add(choice9);

    choice10 = new JButton();
    choice10.setBackground(Color.black);
    choice10.setForeground(Color.white);
    choice10.setFont(font);
    choice10.setFocusPainted(false);
    choice10.addActionListener(choiceHandler);
    choice10.setActionCommand("10");
    choicePanel.add(choice10);

    choice11 = new JButton();
    choice11.setBackground(Color.black);
    choice11.setForeground(Color.white);
    choice11.setFont(font);
    choice11.setFocusPainted(false);
    choice11.addActionListener(choiceHandler);
    choice11.setActionCommand("11");
    choicePanel.add(choice11);

    choice12 = new JButton();
    choice12.setBackground(Color.black);
    choice12.setForeground(Color.white);
    choice12.setFont(font);
    choice12.setFocusPainted(false);
    choice12.addActionListener(choiceHandler);
    choice12.setActionCommand("12");
    choicePanel.add(choice12);

    playerPanel = new JPanel();
    playerPanel.setBounds(100, 15, 600, 50);
    playerPanel.setBackground(Color.white);
    con.add(playerPanel);
    moneyLabel = new JLabel("money: ");
    moneyLabel.setFont(font);
    // moneyLabel.setForeground(Color.white);
    playerPanel.add(moneyLabel);

    playerSetUp();
  }

  public void playerSetUp() {
    moneyLabel.setText(" " + totalMoney);

    welcomeMessage();
    chooseTeam1();
  }

  public void welcomeMessage() {
    round = "welcome";
    textArea.setText("\nYou are kidnapped by the mafia because of your enormous debt caused" +
    " by your addiction to gambling. You are offered a final chance to pay off" +
    " your debt. Not to worry, though, as you will be assisted with our PREDICTION" +
    "_GEN." + "\nWill you get off debt-free or will you suffer in damnation?");
    choice1.setText("No.");
    choice2.setText("Yes.");
    choice3.setText("No.");
    choice4.setText("No.");
    choice5.setText("No.");
    choice6.setText("Yes.");
    choice7.setText("No.");
    choice8.setText("No.");
    choice9.setText("No.");
    choice10.setText("No.");
    choice11.setText("No.");
    choice12.setText("No.");

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
  }

  public void chooseTeam1() {
    round = "team1";
    textArea.setText("Choose team 1: " +
    "\n1: " + thvs +
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
    "\n12: " + sen);
    choice1.setText("1");
    choice2.setText("2");
    choice3.setText("3");
    choice4.setText("4");
    choice5.setText("5");
    choice6.setText("6");
    choice7.setText("7");
    choice8.setText("8");
    choice9.setText("9");
    choice10.setText("10");
    choice11.setText("11");
    choice12.setText("12");
  }

  public void chooseTeam2() {
    round = "team2";
    textArea.setText("Choose team 2: " +
    "\n1: " + thvs +
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
    "\n12: " + sen);
    choice1.setText("1");
    choice2.setText("2");
    choice3.setText("3");
    choice4.setText("4");
    choice5.setText("5");
    choice6.setText("6");
    choice7.setText("7");
    choice8.setText("8");
    choice9.setText("9");
    choice10.setText("10");
    choice11.setText("11");
    choice12.setText("12");
  }

  public void chooseMap() {
    round = "map";
    textArea.setText("Choose a map: " +
    "\n1: " + fra +
    "\n2: " + bre +
    "\n3: " + ice +
    "\n4: " + bin +
    "\n5: " + hav +
    "\n6: " + spl +
    "\n7: " + asc);
    choice1.setText("1");
    choice2.setText("2");
    choice3.setText("3");
    choice4.setText("4");
    choice5.setText("5");
    choice6.setText("6");
    choice7.setText("7");
    choice8.setText("");
    choice9.setText("");
    choice10.setText("");
    choice11.setText("");
    choice12.setText("");
  }

  public void chooseVictor() {
    round = "victor";
    textArea.setText("Choose a victor: " +
    "\n<<<STATS FOR TEAM 1>>>" +
    "average ACS:" + avACS1 +
    "average ADR:" + avADR1 +
    "average kills:" + avKills1 +
    "average deaths:" + avDeaths1 +
    "average KAST:" + avKAST1 +
    "average round difference:" + avRounds1 +

    "\n<<<STATS FOR TEAM 2>>>" +
    "average ACS:" + avACS2 +
    "average ADR:" + avADR2 +
    "average kills:" + avKills2 +
    "average deaths:" + avDeaths2 +
    "average KAST:" + avKAST2 +
    "average round difference:" + avRounds2);
    choice1.setText("");
    choice2.setText("");
    choice3.setText("");
    choice4.setText("");
    choice5.setText(team1);
    choice6.setText("");
    choice7.setText("");
    choice8.setText(team2);
    choice9.setText("");
    choice10.setText("");
    choice11.setText("");
    choice12.setText("");
  }

  public class TitleScreenHandler implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      createGameScreen();
    }
  }

  public class ChoiceHandler implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      String yourChoice = event.getActionCommand();

      switch(round) {
      case "welcome":
          switch(yourChoice) {
          case "1": break;
          case "2": break;
          case "3": break;
          case "4": break;
          case "5": break;
          case "6": chooseTeam1(); break;
          case "7": break;
          case "8": break;
          case "9": break;
          case "10": break;
          case "11": break;
          case "12": break;
        }
      case "team1":
          switch(yourChoice) {
          case "1": t1Choice = thvs; chooseTeam2(); break;
          case "2": t1Choice = xset; chooseTeam2(); break;
          case "3": t1Choice = ghst; chooseTeam2(); break;
          case "4": t1Choice = grd; chooseTeam2(); break;
          case "5": t1Choice = tsm; chooseTeam2(); break;
          case "6": t1Choice = nrg; chooseTeam2(); break;
          case "7": t1Choice = optc; chooseTeam2(); break;
          case "8": t1Choice = eg; chooseTeam2(); break;
          case "9": t1Choice = lg; chooseTeam2(); break;
          case "10": t1Choice = faze; chooseTeam2(); break;
          case "11": t1Choice = c9; chooseTeam2(); break;
          case "12": t1Choice = sen; chooseTeam2(); break;
          }
          break;
       case "team2":
          switch(yourChoice) {
            case "1": t2Choice = thvs; chooseMap(); break;
            case "2": t2Choice = xset; chooseMap(); break;
            case "3": t2Choice = ghst; chooseMap(); break;
            case "4": t2Choice = grd; chooseMap(); break;
            case "5": t2Choice = tsm; chooseMap(); break;
            case "6": t2Choice = nrg; chooseMap(); break;
            case "7": t2Choice = optc; chooseMap(); break;
            case "8": t2Choice = eg; chooseMap(); break;
            case "9": t2Choice = lg; chooseMap(); break;
            case "10": t2Choice = faze; chooseMap(); break;
            case "11": t2Choice = c9; chooseMap(); break;
            case "12": t2Choice = sen; chooseMap(); break;
          }
          break;
        case "map":
          switch(yourChoice) {
            case "1": mapChoice = fra; ch(); break;
            case "2": mapChoice = bre; chooseVictor(); break;
            case "3": mapChoice = ice; chooseVictor(); break;
            case "4": mapChoice = bin; chooseVictor(); break;
            case "5": mapChoice = hav; chooseVictor(); break;
            case "6": mapChoice = spl; chooseVictor(); break;
            case "7": mapChoice = asc; chooseVictor(); break;
            case "8": break;
            case "9": break;
            case "10": break;
            case "11": break;
            case "12": break;
          }
          break;
      }
  }
}

  public void ending() {
    round = "ending";

    textArea.setText("ME: You're done.");

    choice1.setText("");
    choice2.setText("");
    choice3.setText("");
    choice4.setText("");
    choice1.setVisible(false);
    choice2.setVisible(false);
    choice3.setVisible(false);
    choice4.setVisible(false);
  }

  public static void main(String[] args) {
    new GUI();
  }

}
