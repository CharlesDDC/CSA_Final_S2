public class playerStats
{
    //Instance Variables
    private String playerName;

    private int playerLevel;
    private int health;
    private int attackDamage;
    private int defense;
    private int speed;
    private int currentBalance;

    //Constructor
    public playerStats(String playerName,int playerLevel, int health, int attackDamage, int defense, int speed, int currentBalance)
    {
        this.playerLevel = playerLevel;
        this.playerName = playerName;
        this.health = health;
        this.attackDamage = attackDamage;
        this.defense = defense;
        this.speed = speed;
        this.currentBalance = currentBalance;
    }

    //Getters
    public String getPlayerName()
    {
        return playerName;
    }

    public int getLevel()
    {
        return playerLevel;
    }

    public int getHealth()
    {
        return health;
    }

    public int getAttackDamage()
    {
        return attackDamage;
    }

    public int getDefense()
    {
        return defense;
    }

    public int getSpeed()
    {
        return speed;
    }

    public int getCurrentBalance()
    {
        return currentBalance;
    }
    //Setters
    public void setPlayerName(String newPlayerName)
    {
        playerName = newPlayerName;
    }

    public void setLevel(int newPlayerLevel)
    {
        playerLevel = newPlayerLevel;
    }

    public void setHealth(int newHealth)
    {
        health = newHealth;
    }

    public void setAttackDamage(int newAttackDamage)
    {
        attackDamage = newAttackDamage;
    }

    public void setDefense(int newDefense)
    {
        defense = newDefense;
    }

    public void setSpeed(int newSpeed)
    {
        speed = newSpeed;
    }

    public void setCurrentBalance(int newCurrentBalance)
    {
        currentBalance = newCurrentBalance;
    }

    //toString
    public String toString()
    {
        String output;
        output = "Player Stats: "
                + "\nPlayer Name: " + playerName
                + "\nPlayer Level: " + playerLevel
                + "\nPlayer Health: " + health
                + "\nPlayer Attack Damage: " + attackDamage
                + "\nPlayer Defense: " + defense
                + "\nPlayer Speed: " + speed
                + "\nTotal Balance: " + currentBalance;
        return output;
    }
}
