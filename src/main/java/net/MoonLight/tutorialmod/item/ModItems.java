package net.MoonLight.tutorialmod.item;

import net.MoonLight.tutorialmod.TutorialMod;

import net.MoonLight.tutorialmod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item>  uselessitem = ITEMS.register("uselessitem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>  METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }



}
