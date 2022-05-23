import java.util.Scanner;
import java.lang.Math;
public class Main implements colorInterface
{
    public static void main (String[]args)
    {
        //Setting up Scanner
        Scanner scan = new Scanner(System.in);
        //Variables to use for scanner
        String playerName,nameConfirm,notRightResponse,fightOrRun,itemChoice,fightGremlin;
        //Beginning of adventure
        System.out.println("First before you begin your adventure, What is your name?");
        System.out.print(">");
        //Utilizes Sccanner in the beginning
        playerName = scan.nextLine();
        //Setting up the Users Character name and stats
        playerStats newPlayer = new playerStats(playerName,10,4,5,10,0,0,0,0,0);
        //Confirms if your name is correct
        System.out.println("So your name is " + newPlayer.getPlayerName() + ". Is that right?");
        System.out.println(TEXT_GREEN + "Yes" + TEXT_RESET +" or "+ TEXT_RED + "No" + TEXT_RESET);
        System.out.print(">");
        nameConfirm = scan.nextLine();
        //Variable to make sure you entered a valid option
        boolean unknownOption = true;
        //if statement to check if user entered anything besides yes or no
        if (!nameConfirm.equalsIgnoreCase("Yes") && !nameConfirm.equalsIgnoreCase("No"))
        {
            while (unknownOption == true)
            {
                if (unknownOption == true)
                {
                    System.out.println("That is not a valid option please Enter " + TEXT_GREEN + "Yes" + TEXT_RESET + " or " + TEXT_RED + " No" + TEXT_RESET);
                    System.out.print(">");
                    notRightResponse = scan.next();
                    if (notRightResponse.equalsIgnoreCase("Yes") || notRightResponse.equalsIgnoreCase("No"))
                    {
                        unknownOption = false;
                    }//end of nested if
                    else
                    {
                        unknownOption = true;
                    }//end of nested else
                }//end of nested if
            }//end of while loop
        }//end of if Statement
        //Make boolean placeholder and set it to false until user likes name
        boolean likeName = false;
        //while loop to check if the user is satisfied with their name
        if (nameConfirm.equalsIgnoreCase("Yes")) //Checks if you entered yes
        {
            likeName = true;
        }
        //While loop to make sure you like your name
        while (likeName == false)
        {
            //Checks if user picked no so they can change name
            if(nameConfirm.equalsIgnoreCase("No"))
            {
                System.out.println("What is your name?");
                System.out.print(">");
                playerName = scan.nextLine();
                System.out.println(playerName + " is your desired name?");
                System.out.println(TEXT_GREEN + "Yes" + TEXT_RESET + " or " + TEXT_RED + "No" + TEXT_RESET);
                nameConfirm = scan.nextLine();
                if (nameConfirm.equalsIgnoreCase("Yes"))
                {
                    likeName = true;
                    newPlayer.setPlayerName(playerName);
                }//end of nested if
                else
                {
                 likeName = false;
                }//end of nested else statement
            }//end of if loop
        }//end of while loop
        //Starts story
        //Creating outsider enemy
        enemiesStats homelessMan = new enemiesStats("Outsider",4,5,1,2);
       System.out.println("You suddenly wake up to someone scratching the door."
       +"\nYou don't know who it is but you open the door anyways."
       + "\nYou got jumped by some outsider!!!"
       + "What will you do? Will you " + TEXT_RED + "fight " + TEXT_RESET + "or " + TEXT_GREEN + "run" + TEXT_RESET + "?");
        System.out.print(">");
        fightOrRun = scan.nextLine();
        while(homelessMan.getEnemyHealth() >= 0)
        {
            if (fightOrRun.equalsIgnoreCase("fight"))
            {

                int damageDealt = newPlayer.getAttackDamage() - homelessMan.getEnemyDefense();
                int remainingHP = homelessMan.getEnemyHealth() - damageDealt;
                homelessMan.setEnemyHealth(remainingHP);
                newPlayer.fighting();
                if (homelessMan.getEnemyHealth() <= 0)
                {
                    System.out.println("You dealt " + damageDealt + " damage to the " + homelessMan.getEnemyName() + "!");
                    System.out.println("You knock him down but you are surpised that he is still standing!");
                    System.out.println("What will you do?");
                    System.out.println("Will you " + TEXT_RED + "fight " + TEXT_RESET + "or " + TEXT_GREEN + "run" + TEXT_RESET +"?" );
                    System.out.print(">");
                    fightOrRun = scan.nextLine();
                }
            }
            else if (fightOrRun.equalsIgnoreCase("Run"))
            {
                newPlayer.run();
                System.out.println("You see the outsider creeping towards you slowly");
                System.out.println("Will you " + TEXT_RED + "fight " + TEXT_RESET + "or " + TEXT_GREEN + "run" + TEXT_RESET + "?");
                System.out.print(">");
                fightOrRun = scan.nextLine();
            }

        }
        //Happens after you defeat homeless man
        System.out.println("You defeated the outsider!!");
        System.out.println("After you defeat the outsider you start to run and see a shadowy figure chase you!"
        +"\nYou start to panic and find a shed nearby."
        +"\nYou quickly sprint towards the shed and break the door down"
        +"\nOnce in the shed you see three items, a " + TEXT_RED + "sword" + TEXT_RESET + ", a" + TEXT_BLUE + " dagger" + TEXT_RESET + ", and a " + TEXT_GREEN + "shield" + TEXT_RESET + "."
        +"\nWhich item will you choose?");
        System.out.print(">");
        itemChoice = scan.nextLine();
        //new enemy "gremlin" stats
        //boolean to make sure you die when your hp reaches 0
        boolean playerHealth = false;
        enemiesStats gremlin = new enemiesStats("gremlin",10,4,5,8);
        //making roles so player can choose it
        playerClasses assassinRole = new playerClasses(playerName, newPlayer.getHealth(), newPlayer.getAttackDamage(), newPlayer.getDefense(), newPlayer.getSpeed(), newPlayer.getCurrentBalance(), 2,2,0,0,false,false,false);
        playerClasses swordsmanRole = new playerClasses(playerName, newPlayer.getHealth(), newPlayer.getAttackDamage(), newPlayer.getDefense(), newPlayer.getSpeed(), newPlayer.getCurrentBalance(), 1,1,1,1,false,false,false);
        playerClasses tankRole = new playerClasses(playerName, newPlayer.getHealth(), newPlayer.getAttackDamage(), newPlayer.getDefense(), newPlayer.getSpeed(), newPlayer.getCurrentBalance(), 0,0,2,2,false,false,false);
        if (itemChoice.equalsIgnoreCase("sword"))
        {
           swordsmanRole.setClassSwordsman(true);
           swordsmanRole.setAttackDamage(swordsmanRole.getAttackDamage() + swordsmanRole.getAttackModifier());
           swordsmanRole.setDefense(swordsmanRole.getDefense() + swordsmanRole.getDefenseModifier());
           swordsmanRole.setSpeed(swordsmanRole.getSpeed() + swordsmanRole.getSpeedModifier());
           swordsmanRole.setHealth(swordsmanRole.getHealth() + swordsmanRole.getHealthModifer());
           System.out.println("You pick up the sword and defend yourself with it");
        }
        else if (itemChoice.equalsIgnoreCase("dagger"))
        {
            assassinRole.setClassAssassin(true);
            assassinRole.setSpeed(assassinRole.getSpeed() + assassinRole.getSpeedModifier());
            assassinRole.setAttackDamage(assassinRole.getAttackDamage() + assassinRole.getAttackModifier());
            System.out.println("You pick up the dagger and start to defend yourself with it.");
        }
        else if(itemChoice.equalsIgnoreCase("shield"))
        {
            tankRole.setClassTank(true);
            tankRole.setHealth(tankRole.getHealth() + tankRole.getHealthModifer());
            tankRole.setDefense(tankRole.getDefense() + tankRole.getHealthModifer());
            System.out.println("You pick up the shield and start to defend yourself with it");
        }
        //boolean to see if you run away
        boolean runAway = false;
        while (gremlin.getEnemyHealth() >= 0 && runAway == false && tankRole.getHealth() > 0 && swordsmanRole.getHealth() > 0 && assassinRole.getHealth() > 0)
        {
            System.out.println("What will you do?");
            System.out.println("Will you " + TEXT_RED + "fight " + TEXT_RESET + "or " + TEXT_GREEN + "run" + TEXT_RESET + "?");
            System.out.print(">");
            fightGremlin = scan.nextLine();
            //Checks if you fight this gremlin
            if (fightGremlin.equalsIgnoreCase("fight"))
            {
                //Variables to use when taking damage
                int enemyDamageDealt;
                int playerDamageDealt;
                int playerRemainingHP;
                int enemyRemaingHP;
                if(tankRole.getClassTank() == true)
                {
                    if (tankRole.getSpeed() > gremlin.getEnemySpeed())
                    {
                        System.out.println("You moved faster than this gremlin and hit him!");
                        //Math for when attacking
                        playerDamageDealt = Math.abs(tankRole.getAttackDamage() - gremlin.getEnemyDefense());
                        enemyRemaingHP = gremlin.getEnemyHealth() - playerDamageDealt;
                        gremlin.setEnemyHealth(enemyRemaingHP);
                        System.out.println("You hit the gremlin for " + TEXT_RED + playerDamageDealt + TEXT_RESET + " damage!");
                        System.out.println("The gremlin has " + TEXT_RED + gremlin.getEnemyHealth() + TEXT_RESET + "HP left!");
                        System.out.println("However the gremlin has hit you back!");
                        //Math for when enemy attacks you
                        enemyDamageDealt = Math.abs(gremlin.getEnemyAttack() - tankRole.getDefense());
                        playerRemainingHP = tankRole.getHealth() - enemyDamageDealt;
                        tankRole.setHealth(playerRemainingHP);
                        System.out.println("You got hit by the gremlin for " + TEXT_RED + enemyDamageDealt + TEXT_RESET + " damage!");
                        System.out.println("You have " + TEXT_RED + tankRole.getHealth() + TEXT_RESET + "HP left");
                    }
                }
                else if (swordsmanRole.getClassSwordsman() == true)
                {

                }
                else if (assassinRole.getClassAssassin() == true)
                {
                    assassinRole.setHealth(0);
                }
            }
            else if(fightGremlin.equalsIgnoreCase("run"))
            {
                tankRole.running();
                System.out.println("You ran to a nearby farm and stopped there");
                runAway = true;
            }//end of else if
        }//end of while loop
        if (runAway == true)
        {
            //Ran away like a bitch ending
            System.out.println("After running away from this ugly gremlin you started to get really tired");
            System.out.println("You started to feel the fatigue of running away and blacked out");
            System.out.println("To be continued?");
        }
        else if (tankRole.getHealth() <= 0 || assassinRole.getHealth()  <= 0 || swordsmanRole.getHealth() <= 0)
        {
            //Got killed by gremlin ending
            System.out.println("You start to lose a lot of blood from this gremlin");
            System.out.println("You have died from multiple stab wounds the gremlin gave you");
            System.out.println("However you feel a sharp pain from the stab wounds and wake up");
            System.out.println("To be continued??");
        }
    }
}
