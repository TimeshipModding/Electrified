package com.timeshipmodding.electrified.datagen;

import com.timeshipmodding.electrified.Electrified;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import static com.timeshipmodding.electrified.content.blocks.registries.ModBlocks.*;

public class DataBlockStates extends BlockStateProvider {
    public DataBlockStates(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Electrified.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Block with Item
        blockWithItem(RAW_ALUMINIUM_BLOCK);
        blockWithItem(ALUMINIUM_BLOCK);
        blockWithItem(STEEL_BLOCK);
        blockWithItem(BAUXITE_ORE);
        blockWithItem(DEEPSLATE_BAUXITE_ORE);
    }

    // Generate Methods
    private void blockWithItem(DeferredBlock<Block> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void dropExperienceBlockWithItem(DeferredBlock<DropExperienceBlock> dropExperienceBlockRegistryObject) {
        simpleBlockWithItem(dropExperienceBlockRegistryObject.get(), cubeAll(dropExperienceBlockRegistryObject.get()));
    }
}