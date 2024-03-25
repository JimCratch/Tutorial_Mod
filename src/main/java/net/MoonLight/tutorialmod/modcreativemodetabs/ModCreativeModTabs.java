package net.MoonLight.tutorialmod.modcreativemodetabs;

import net.MoonLight.tutorialmod.TutorialMod;
import net.MoonLight.tutorialmod.block.ModBlocks;
import net.MoonLight.tutorialmod.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.uselessitem.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.uselessitem.get());
                        pOutput.accept(ModBlocks.USELESS_BLOCK.get());
                        pOutput.accept(ModBlocks.UGLY_BLOCK.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModItems.RUBIX_CUBE.get());
                        pOutput.accept(ModItems.STRAWBERRY.get());
                        pOutput.accept(ModItems.BURNING_FUEL.get());
                        pOutput.accept(ModItems.USELESS_SWORD.get());
                        pOutput.accept(ModItems.USELESS_AXE.get());
                        pOutput.accept(ModItems.USELESS_HOE.get());
                        pOutput.accept(ModItems.USELESS_PICKAXE.get());
                        pOutput.accept(ModItems.USELESS_SHOVEL.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
