package net.MoonLight.tutorialmod;

import net.MoonLight.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item>  Useless_Item = ITEMS.register("Useless Item",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }



}
