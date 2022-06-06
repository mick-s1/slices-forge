package com.mick.slices;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Slices {

    public static final DeferredRegister<Item> REG_ITEM = 
        DeferredRegister.create(ForgeRegistries.ITEMS, "slices");

    public static final RegistryObject<Item> SLICES = 
        REG_ITEM.register("slice", () -> new Item(new Item.Properties().
        tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(2).
        saturationMod(0.4f).build())));
    
}
