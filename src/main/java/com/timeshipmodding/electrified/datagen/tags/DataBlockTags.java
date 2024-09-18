package com.timeshipmodding.electrified.datagen.tags;

import com.timeshipmodding.electrified.Electrified;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static com.timeshipmodding.electrified.content.blocks.registries.ModBlocks.*;

public class DataBlockTags extends BlockTagsProvider {
    public DataBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Electrified.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // Minecraft Tags
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(RAW_ALUMINIUM_BLOCK.get())
                .add(ALUMINIUM_BLOCK.get())
                .add(BAUXITE_ORE.get())
                .add(DEEPSLATE_BAUXITE_ORE.get())
                .add(STEEL_BLOCK.get())
                .add(RAW_NICKEL_BLOCK.get())
                .add(NICKEL_BLOCK.get())
                .add(NICKEL_ORE.get())
                .add(DEEPSLATE_NICKEL_ORE.get())
                .add(SILICON_BLOCK.get())
                .add(SILICON_ORE.get())
                .add(DEEPSLATE_SILICON_ORE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(STEEL_BLOCK.get())
                .add(RAW_NICKEL_BLOCK.get())
                .add(NICKEL_BLOCK.get())
                .add(NICKEL_ORE.get())
                .add(DEEPSLATE_NICKEL_ORE.get())
                .add(SILICON_BLOCK.get())
                .add(SILICON_ORE.get())
                .add(DEEPSLATE_SILICON_ORE.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(RAW_ALUMINIUM_BLOCK.get())
                .add(ALUMINIUM_BLOCK.get())
                .add(BAUXITE_ORE.get())
                .add(DEEPSLATE_BAUXITE_ORE.get());
    }
}