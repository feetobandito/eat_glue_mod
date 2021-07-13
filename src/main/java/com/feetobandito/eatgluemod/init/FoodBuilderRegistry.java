package com.feetobandito.eatgluemod.init;

import net.minecraft.item.Food;

public class FoodBuilderRegistry {
    public static final Food GLUEITEM = (new Food.Builder()).nutrition(4).saturationMod(1.2F).build();
}
