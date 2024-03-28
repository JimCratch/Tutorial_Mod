package net.MoonLight.tutorialmod.item;

import net.MoonLight.tutorialmod.TutorialMod;
import net.MoonLight.tutorialmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {

    public static final Tier USELESS = TierSortingRegistry.registerTier(
            new ForgeTier(5,1000,5f,10f,25,
                    ModTags.Blocks.NEEDS_USELESS_TOOL, () -> Ingredient.of(ModItems.uselessitem.get())),
            new ResourceLocation(TutorialMod.MOD_ID, "useless"), List.of(Tiers.NETHERITE), List.of());

}
