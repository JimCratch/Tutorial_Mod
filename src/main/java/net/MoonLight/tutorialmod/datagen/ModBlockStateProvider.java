package net.MoonLight.tutorialmod.datagen;

import net.MoonLight.tutorialmod.TutorialMod;
import net.MoonLight.tutorialmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {

        super(output, TutorialMod.MOD_ID, exFileHelper);

    }
    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlocks.UGLY_BLOCK);
        blockWithItem(ModBlocks.USELESS_BLOCK);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {

        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));

    }

}
