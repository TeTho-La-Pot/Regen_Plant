package com.guithub.TeThoLaPot.reore.item;

import com.guithub.TeThoLaPot.reore.RE_Plant;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RE_Plant.MOD_ID);

    public static final RegistryObject<Item> TORE = ITEMS.register("tore",
            () -> new BreakStaff(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}