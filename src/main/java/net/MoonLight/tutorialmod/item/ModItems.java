package net.MoonLight.tutorialmod.item;

import net.MoonLight.tutorialmod.TutorialMod;

import net.MoonLight.tutorialmod.item.custom.FuelItem;
import net.MoonLight.tutorialmod.item.custom.MetalDetectorItem;
import net.MoonLight.tutorialmod.item.custom.ModArmorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
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

    public static final RegistryObject<Item> RUBIX_CUBE = ITEMS.register("rubix_cube",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));

    public static final RegistryObject<Item> BURNING_FUEL = ITEMS.register("burning_fuel",
            () -> new FuelItem(new Item.Properties(), 100));

    public static final RegistryObject<Item> USELESS_SWORD = ITEMS.register("useless_sword",
            () -> new SwordItem(ModToolTiers.USELESS,3, 5, new Item.Properties()));
    public static final RegistryObject<Item> USELESS_AXE = ITEMS.register("useless_axe",
            () -> new AxeItem(ModToolTiers.USELESS,3, 5, new Item.Properties()));
    public static final RegistryObject<Item> USELESS_PICKAXE = ITEMS.register("useless_pickaxe",
            () -> new PickaxeItem(ModToolTiers.USELESS,3, 5, new Item.Properties()));
    public static final RegistryObject<Item> USELESS_HOE = ITEMS.register("useless_hoe",
            () -> new HoeItem(ModToolTiers.USELESS,3, 5, new Item.Properties()));
    public static final RegistryObject<Item> USELESS_SHOVEL = ITEMS.register("useless_shovel",
            () -> new ShovelItem(ModToolTiers.USELESS,3, 5, new Item.Properties()));

    public static final RegistryObject<Item> USELESS_HELMET = ITEMS.register("useless_helmet",
            () -> new ModArmorItem(ModArmorMaterials.USELESS, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> USELESS_CHESTPLATE = ITEMS.register("useless_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.USELESS, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> USELESS_LEGGINGS = ITEMS.register("useless_leggings",
            () -> new ModArmorItem(ModArmorMaterials.USELESS, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> USELESS_BOOTS = ITEMS.register("useless_boots",
            () -> new ModArmorItem(ModArmorMaterials.USELESS, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }



}
