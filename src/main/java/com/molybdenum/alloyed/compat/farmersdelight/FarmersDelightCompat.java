package com.molybdenum.alloyed.compat.farmersdelight;

import com.molybdenum.alloyed.items.ModItemTiers;
import net.minecraft.item.Item;

public class FarmersDelightCompat {
    public static Item newSteelKnife(Item.Properties properties) {
        return new SteelKnife(ModItemTiers.STEEL, 0.5F, -2.0F, properties);
    }
}