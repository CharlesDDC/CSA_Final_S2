public class playerClasses extends playerStats
{
    private boolean classTank;
    private boolean classSwordsman;
    private boolean classAssassin;
    private int healthModifier;
    private int attackModifer;
    private int defenseModifer;
    private int speedModifer;

    //constructors
    public playerClasses(String playerName, int playerLevel, int health, int attackDamage, int defense, int speed, int currentBalance, boolean classTank, boolean classSwordsman, boolean classAssassin,int healthModifier,int attackModifer,int defenseModifer, int speedModifer)
    {
        super(playerName, playerLevel, health, attackDamage, defense, speed, currentBalance);
        this.classTank = classTank;
        this.classSwordsman = classSwordsman;
        this.classAssassin = classAssassin;
        this.healthModifier = healthModifier;
        this.attackModifer = attackModifer;
        this.defenseModifer = defenseModifer;
        this.speedModifer = speedModifer;
    }
    //Getters
    public boolean getClassTank()
    {
        return classTank;
    }

    public boolean getClassSwordsman()
    {
        return classSwordsman;
    }

    public boolean getClassAssassin()
    {
        return classAssassin;
    }

    public int getHealthModifier()
    {
        return healthModifier;
    }

    public int getAttackModifer()
    {
        return attackModifer;
    }

    public int getDefenseModifer()
    {
        return defenseModifer;
    }

    public int getSpeedModifer()
    {
        return speedModifer;
    }
    //Setters
    public void setClassTank(boolean newClassTank)
    {
        classTank = newClassTank;
    }
    public void setClassSwordsman(boolean newClassSwordsman)
    {
        classSwordsman = newClassSwordsman;
    }
    public void setClassAssassin(boolean newClassAssassin)
    {
        classAssassin = newClassAssassin;
    }

    //Brain Method
    //Change Player Stats off of what Class the user picked

    //toString
    public String toString()
    {
        String output;
        output = super.toString()
                + "\nClass Tank: "  + classTank
                + "\nClass Swordsman: "  + classSwordsman
                + "\nClass Assassin: " + classAssassin;
        return output;
    }


}
