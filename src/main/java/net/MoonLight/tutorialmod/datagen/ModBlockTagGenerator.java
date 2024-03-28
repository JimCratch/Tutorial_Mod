package net.MoonLight.tutorialmod.datagen;

import net.MoonLight.tutorialmod.TutorialMod;
import net.MoonLight.tutorialmod.block.ModBlocks;
import net.MoonLight.tutorialmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.UGLY_BLOCK.get(),
                        ModBlocks.USELESS_BLOCK.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.UGLY_BLOCK.get(),
                ModBlocks.USELESS_BLOCK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.UGLY_BLOCK.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.USELESS_BLOCK.get(),(ModBlocks.UGLY_BLOCK.get()));

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.USELESS_BLOCK.get());

        this.tag(ModTags.Blocks.NEEDS_USELESS_TOOL)
                .add(ModBlocks.USELESS_BLOCK.get());

    }
}
