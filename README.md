# TNPG: friedChicken

**Members: Lindsay Phung, Lea Kwok, and Nina Jiang**

**Duckies: Tommy, Gunter, Miss Alpaca**

---

*Project Description:*

Valorant is a 5v5 tactical FPS. One team has an objective to plant the spike and the other team must stop them from planting on certain sites or defuse the spike before it explodes. A team wins by winning 13 rounds first, and a game can go into overtime if both teams reach 12 rounds. An overtime is won by a team winning consecutive attack and defense rounds (win by 2).

In the competitive scene, there are many teams competing in Riot-sponsored competitions, the biggest one being Valorant Champions Tour, which has three main events a year: Master 1, Masters 2, and Champions. At these three events, the top teams from each region compete to crown an international winner.

We aim to use match statistics from previous matches from VCT to predict whether a team will win a future match versus another one. This is helpful for predicting whether a team will win a tournament or not, and helps the user bet on the right team to win.  

To add fun, the player will be told that they are kidnapped by the mafia because of their enormous debt caused by their gambling problem. They are offered one last chance to pay off their debt with the aid of our project, a prediction generator, by betting on the correct team in VCT. The project will also aid them in suggesting the proper amount of money to bet to maximize gains, as long as the user inputs their starting amount.

*Match Statistics Used:*
 * ACS - Average Combat Score measures a combination of kills, assists, and damage done
 * ADR - Average Damage per Round
 * KAST - Kills, Assists, Survive %, Trades
 * K/D ratio - Number of kills divided by number of deaths
 * Round differential - the difference between the number of rounds won and rounds lost

*How-to-Launch Instructions:*
1. Clone this repo.
2. Launch a terminal session and go to the directory containing Woo.java
3. Run these commands: 
   ```
   $ javac -classpath .:./sinbad.jar -d . Woo.java
   $ java -classpath .:./sinbad.jar Woo
   ```

