package com.timeshipmodding.electrified.datagen.tags;

import com.timeshipmodding.electrified.Electrified;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static com.timeshipmodding.electrified.content.block.registries.ModBlocks.*;

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
                .add(ALUMINIUM_FRAME.get())
                .add(COPPER_FRAME.get())
                .add(EXPOSED_COPPER_FRAME.get())
                .add(WEATHERED_COPPER_FRAME.get())
                .add(OXIDIZED_COPPER_FRAME.get())
                .add(WAXED_COPPER_FRAME.get())
                .add(WAXED_EXPOSED_COPPER_FRAME.get())
                .add(WAXED_WEATHERED_COPPER_FRAME.get())
                .add(WAXED_OXIDIZED_COPPER_FRAME.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(RAW_ALUMINIUM_BLOCK.get())
                .add(ALUMINIUM_BLOCK.get())
                .add(BAUXITE_ORE.get())
                .add(DEEPSLATE_BAUXITE_ORE.get())
                .add(ALUMINIUM_FRAME.get())
                .add(COPPER_FRAME.get())
                .add(EXPOSED_COPPER_FRAME.get())
                .add(WEATHERED_COPPER_FRAME.get())
                .add(OXIDIZED_COPPER_FRAME.get())
                .add(WAXED_COPPER_FRAME.get())
                .add(WAXED_EXPOSED_COPPER_FRAME.get())
                .add(WAXED_WEATHERED_COPPER_FRAME.get())
                .add(WAXED_OXIDIZED_COPPER_FRAME.get());
    }
}