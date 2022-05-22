import java.util.Scanner;
public class Main implements colorInterface
{
    public static void main (String[]args)
    {
        //Setting up Scanner
        Scanner scan = new Scanner(System.in);
        //Variables to use for scanner
        String playerName,nameConfirm,notRightResponse,itemChoice;
        //Beginning of adventure
        System.out.println("First before you begin your adventure, What is your name?");
        System.out.print(">");
        //Utilizes Sccanner in the beginning
        playerName = scan.nextLine();
        //Setting up the Users Character name and stats
        playerStats newPlayer = new playerStats(playerName,10,4,5,3,0,0,0,0,0);
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
       System.out.println("You suddenly wake up to someone scratching the door."
       +"\nYou don't know who it is but you open the door anyways");
        /* Saving this for later
        //This happens when you pick sword
        if (itemChoice.equalsIgnoreCase("sword"))
        {
            //10,4,5,3,0,0,0,0,0
            playerClasses swordsManRole = new playerClasses(playerName,10,4,5,3,0,5,5,5,5,false,false,false);
            swordsManRole.setClassSwordsman(true);
            swordsManRole.setClassAssassin(false);
            swordsManRole.setClassTank(false);
            swordsManRole.setAttackDamage(newPlayer.getAttackDamage() + swordsManRole.getAttackModifier());
        }
        //Checks if dagger was picked
        else if(itemChoice.equalsIgnoreCase("dagger"))
        {
            playerClasses assassinRole = new playerClasses(playerName,10,4,5,3,0,0,0,0,0,false,false,false);
        }
        //Checks if shield was picked
        else if (itemChoice.equalsIgnoreCase("shield"))
        {

        }
        */

    }
}
