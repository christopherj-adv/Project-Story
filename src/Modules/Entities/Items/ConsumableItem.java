package Modules.Entities.Items;

import Modules.Exceptions.ItemCreationException;

// This class will represents items that can be consumed such as food, potions, etc.
public class ConsumableItem extends Item
{
    int quantity;
    final int maxQuantity;

    Object effect;

    public ConsumableItem(String name, String description, int itemID, int quantity, int maxQuantity, Object effect) throws ItemCreationException
    {
        super(name, description, itemID);

        this.quantity = quantity;
        this.maxQuantity = maxQuantity;
        this.rarity = itemRarity.COMMON;
        this.effect = effect;
    }
}
