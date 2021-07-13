package com.feetobandito.eatgluemod.init;

import com.feetobandito.eatgluemod.EatGlueMod;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {

    public static Item glueitem;

    public static void registerAll(RegistryEvent.Register<Item> event) {
        if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName()))
            return;

        glueitem = register("glueitem", new Item(new Item.Properties().tab(EatGlueMod.ITEM_GROUP).food(FoodBuilderRegistry.GLUEITEM)));

    }

    private static <T extends Item> T register(String name, T item) {
        ResourceLocation id = EatGlueMod.getId(name);
        item.setRegistryName(id);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }
}
