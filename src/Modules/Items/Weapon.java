package Modules.Items;

public class Weapon extends Item
{
    int strengthModifier; // How much it increases or decreases strength by.
    int magicModifier; // How much it increases or decreases magic by.
    int durability; // If -1, invincible.
    int minimumLevel; // Minimum level needed to equip

    boolean twoHanded;

    public Weapon(String name, String description, int itemID, int str, int mag)
    {
        super(name, description, itemID);
        strengthModifier = str;
        magicModifier = mag;
    }


    // Getters
    public int getStrength()
    {
        return strengthModifier;
    }
    public int getMagic()
    {
        return magicModifier;
    }
    public int getDurability()
    {
        return durability;
    }
    public int getMinimumLevel()
    {
        return minimumLevel;
    }
    public boolean isTwoHanded()
    {
        return twoHanded;
    }
}
