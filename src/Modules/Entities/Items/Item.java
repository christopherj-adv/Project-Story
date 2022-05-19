package Modules.Entities.Items;

import Modules.Entities.Entity;

enum itemRarity { COMMON, UNCOMMON, RARE, EPIC, LEGENDARY, HOLY}
public class Item extends Entity
{
    int itemID;
    String description;
    itemRarity rarity;

    public Item(String name, String description, int itemID)
    {
        super(name);
        this.itemID = itemID;
        this.description = description;
        this.rarity = itemRarity.COMMON;
    }
    public Item(String name, String description, int itemID, itemRarity rarity)
    {
        super(name);
        this.itemID = itemID;
        this.description = description;
        this.rarity = rarity;
    }

    // Must be changed to fit GUI components later.
    public String rarityAsColor(itemRarity rarity)
    {
        String col;

        switch (rarity) {
            case COMMON:
                col = "BLACK";
                break;
            case UNCOMMON:
                col = "GREEN";     
                break;
            case RARE:
                col = "BLUE";
                break;
            case EPIC:
                col = "PURPLE";
                break;
            case LEGENDARY:
                col = "GOLD";
                break;
            case HOLY:
                col = "GREY";
                break;
            default:
                col = "UNDEFINED";
                break;
        }

        return col;
    }

    // Getters:
    public String getDescription()
    {
        return description;
    }
    public itemRarity getRarity()
    {
        return rarity;
    }
}
