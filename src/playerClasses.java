public class playerClasses extends playerStats
{
    public boolean classTank;
    public boolean classSwordsman;
    public boolean classAssassin;

    //constructors
    public playerClasses(String playerName, int playerLevel, int health, int attackDamage, int defense, int speed, int currentBalance, boolean classTank, boolean classSwordsman, boolean classAssassin)
    {
        super(playerName, playerLevel, health, attackDamage, defense, speed, currentBalance);
        this.classTank = classTank;
        this.classSwordsman = classSwordsman;
        this.classAssassin = classAssassin;
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
