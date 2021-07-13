package com.feetobandito.eatgluemod;

import com.feetobandito.eatgluemod.init.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;

@Mod("eatgluemod")
public class EatGlueMod {
    public static final String MOD_ID = "eatgluemod";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final ItemGroup ITEM_GROUP = new ItemGroup("eatgluemod") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.glueitem);
        }
    };
    public EatGlueMod() {
        DistExecutor.safeRunForDist(() -> () -> new SideProxy.Client(), () -> () -> new SideProxy.Server());
    }

    @Nonnull
    public static ResourceLocation getId(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}