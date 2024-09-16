package com.timeshipmodding.electrified.datagen.loot;

import com.timeshipmodding.electrified.content.blocks.registries.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

import static com.timeshipmodding.electrified.content.item.registries.ModItems.*;
import static com.timeshipmodding.electrified.content.blocks.registries.ModBlocks.*;

public class DataBlockLootTables extends BlockLootSubProvider {
    public DataBlockLootTables(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }

    @Override
    protected void generate() {
        // Drop Self
        dropSelf(STEEL_BLOCK.get());
        dropSelf(RAW_ALUMINIUM_BLOCK.get());
        dropSelf(ALUMINIUM_BLOCK.get());

        // Ore Drops
        this.add(BAUXITE_ORE.get(), block -> createOreDrop(BAUXITE_ORE.get(), RAW_ALUMINIUM.get()));
        this.add(DEEPSLATE_BAUXITE_ORE.get(), block -> createOreDrop(DEEPSLATE_BAUXITE_ORE.get(), RAW_ALUMINIUM.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}