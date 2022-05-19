package Modules.Entities.Characters;

import java.util.ArrayList;

import Modules.Entities.Entity;
import Modules.Entities.Items.Equipment;
import Modules.Entities.Items.Item;
import Modules.Entities.Items.Weapon;

public class Player extends Entity
{
    // Stats
    int health, maxHealth, level,
        strength, magic, defense, resistance;        

    int[] sceneTrail; // Tracks where character has been

    float experience; // Current experience.
    float maxExperience; // Experience needed to level up.

    Weapon mainHand; // The equipped weapon
    Item offHand; // Stuff the character has in their off hand or back. Can only be used if not using a two-handed weapon. Null for empty.

    Equipment Armor;

    ArrayList<Item> inventory;


    public Player(String name, int health, int maxHealth, int level, int strength, int magic, int defense, int resistance)
    {
        super(name);

        this.health = health;
        this.maxHealth = maxHealth;
        this.level = level;
        this.strength = strength;
        this.magic = magic;
        this.defense = defense;
        this.resistance = resistance;

        experience = 0;
        maxExperience = (level * level * 75);

        mainHand = null;
        offHand = null;
        Armor = null;

        inventory = new ArrayList<Item>();
    }

    void addToInventory(Item item)
    {
        inventory.add(item);
    }

    void disarmMainHand()
    {
        // Will automatically shuffles over offHand to mainHand if offHand has a weapon.

        Weapon wp = mainHand;
        
        if (offHand instanceof Weapon)
        {
            mainHand = (Weapon)offHand;
        }
        else
        {
            mainHand = null;
        }
        
        addToInventory(wp);
    }
    void disarmOffHand()
    {
        Item oh = offHand;
        offHand = null;
        addToInventory(oh);
    }
    
    int equipWeapon(Weapon wp) // 0 if successfuly equipped, 1 if unsuccessful because of level, 2 if unsuccessful because offHand is obstructing.
    {
        if (level < wp.getMinimumLevel())
        {
            return 1;
        }
        else if (wp.isTwoHanded() && offHand != null)
        {
            return 2;
        }

        return 0;
    }

    // Getters:
    public String getStatsAsString()
    {
        String str = "";
        
        str += getName() + ", Lv. " + getLevel();

        String mh = "";
        String oh = "";

        if (mainHand == null)
        {
            mh = "empty";
        }
        if (offHand == null)
        {
            oh = "empty";
        }

        str += "\nMain Hand: " + mh;
        str += "\nOff Hand: " + oh;

        str += "\nHealth: " + getHealth() + "/" + getMaxHealth();
        str += "\nExp: " + getExperience() + "/" + getMaxExperience();
        str += "\nStr: " + getStrength();
        str += "\nMag: " + getMagic();
        str += "\nDef: " + getDefense();
        str += "\nRes: " + getResistance();


        return str;
    }

    public int getHealth()
    {
        return health;
    }
    public int getMaxHealth()
    {
        return maxHealth;
    }
    public int getLevel()
    {
        return level;
    }
    public int getStrength()
    {
        return strength;
    }
    public int getMagic()
    {
        return magic;
    }
    public int getDefense()
    {
        return defense;
    }
    public int getResistance()
    {
        return resistance;
    }
    public float getExperience()
    {
        return experience;
    }
    public float getMaxExperience()
    {
        return maxExperience;
    }
    public Weapon getMainHand()
    {
        return mainHand;
    }
    public Item getOffHand()
    {
        return offHand;
    }
    public Equipment getArmor()
    {
        return Armor;
    }
    public ArrayList<Item> getInventory()
    {
        return inventory;
    }    

    // Inventory Getters:
    public Item getInventoryIdxItem(int idx)
    {
        if (idx < 0 || idx >= inventory.size())
        {
            return null;
        }
        
        return inventory.get(idx);
    }
}
