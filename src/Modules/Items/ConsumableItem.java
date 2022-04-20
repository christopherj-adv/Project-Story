package Modules.Items;

import Modules.Effects.Buff;
import Modules.Effects.Debuff;
import Modules.Exceptions.ItemCreationException;

// This class will represents items that can be consumed such as food, potions, etc.
public class ConsumableItem extends Item
{
    int quantity;
    final int maxQuantity;

    Object effect;

    public ConsumableItem(String name, String description, int quantity, int maxQuantity, Object effect) throws ItemCreationException
    {
        super(name, description);

        this.quantity = quantity;
        this.maxQuantity = maxQuantity;
        this.rarity = itemRarity.COMMON;

        // Check if the effect this item has is not an instance of either effect classes
        if (!(effect instanceof Buff || effect instanceof Debuff))
        {
            throw new ItemCreationException("Effect for ConsumableItem \"" + name + "\" not an instance of either Buff or Debuff");
        }

        this.effect = effect;
    }
}
