package com.timeshipmodding.electrified.datagen.loot;

import com.timeshipmodding.electrified.content.blocks.registries.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

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
        dropSelf(RAW_NICKEL_BLOCK.get());
        dropSelf(NICKEL_BLOCK.get());
        dropSelf(SILICON_BLOCK.get());

        // Ore Drops
        this.add(BAUXITE_ORE.get(), block -> createOreDrop(BAUXITE_ORE.get(), RAW_ALUMINIUM.get()));
        this.add(DEEPSLATE_BAUXITE_ORE.get(), block -> createOreDrop(DEEPSLATE_BAUXITE_ORE.get(), RAW_ALUMINIUM.get()));
        this.add(NICKEL_ORE.get(), block -> createOreDrop(NICKEL_ORE.get(), RAW_NICKEL.get()));
        this.add(DEEPSLATE_NICKEL_ORE.get(), block -> createOreDrop(DEEPSLATE_NICKEL_ORE.get(), RAW_NICKEL.get()));
        this.add(SILICON_ORE.get(), block -> createMultipleOreDrops(SILICON_ORE.get(), SILICON.get(), 3, 5));
        this.add(DEEPSLATE_SILICON_ORE.get(), block -> createMultipleOreDrops(DEEPSLATE_SILICON_ORE.get(), SILICON.get(), 3, 5));
    }

    // Generate Methods
    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}