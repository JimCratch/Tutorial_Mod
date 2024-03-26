package net.MoonLight.tutorialmod.datagen;

import net.MoonLight.tutorialmod.TutorialMod;
import net.MoonLight.tutorialmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.uselessitem);
        simpleItem(ModItems.BURNING_FUEL);
        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.STRAWBERRY);
        handheldItem(ModItems.USELESS_SWORD);
        handheldItem(ModItems.USELESS_AXE);
        handheldItem(ModItems.USELESS_HOE);
        handheldItem(ModItems.USELESS_SHOVEL);
        handheldItem(ModItems.USELESS_PICKAXE);

    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {

        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(TutorialMod.MOD_ID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {

        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TutorialMod.MOD_ID,"item/"+item.getId().getPath()));

    }
}
