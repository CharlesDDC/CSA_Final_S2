import java.util.Scanner;
public class Main implements colorInterface
{
    public static void main (String[]args)
    {
        //Setting up Scanner
        Scanner scan = new Scanner(System.in);
        //Variables to use for scanner
        String playerName,nameConfirm;
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
        //Checks if you entered yes
        //Make boolean placeholder and set it to false until user likes name
        boolean likeName = false;
        //while loop to check if the user is satisfied with their name
        if (nameConfirm.equalsIgnoreCase("Yes"))
        {
            likeName = true;
        }
        while (likeName == false)
        {
            if(nameConfirm.equalsIgnoreCase("No"))
            {
                System.out.println("What is your name?");
                System.out.print(">");
                playerName = scan.nextLine();
                System.out.println(playerName + "is your desired name?");
                System.out.println(TEXT_GREEN + "Yes" + TEXT_RESET + " or " + TEXT_RED + "No" + TEXT_RESET);
                nameConfirm = scan.nextLine();
                if (nameConfirm.equalsIgnoreCase("Yes"))
                {
                    likeName = true;
                }
                else
                {
                 likeName = false;
                }
            }
        }


    }
}
