package net.smile.smilemod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.smile.smilemod.SmileMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SmileMod.MOD_ID);


    //BAREBONES ITEM
    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties().setId(ITEMS.key("alexandrite")))
    );


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
