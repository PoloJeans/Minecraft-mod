package net.dylan.felix_and_dylan.item;

import net.dylan.felix_and_dylan.Felix_And_Dylan;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS = //D.R = Long list of items
            DeferredRegister.create(ForgeRegistries.ITEMS, Felix_And_Dylan.MODID);

    public static final RegistryObject<Item> KFC = ITEMS.register("kfc",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
