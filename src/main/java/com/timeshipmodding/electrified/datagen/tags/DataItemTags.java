package com.timeshipmodding.electrified.datagen.tags;

import com.timeshipmodding.electrified.Electrified;
import com.timeshipmodding.electrified.util.tags.registries.ModItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

import static com.timeshipmodding.electrified.content.item.registries.ModItems.*;

public class DataItemTags extends ItemTagsProvider {
    public DataItemTags(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, Electrified.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        // Electrified Tags
        this.tag(ModItemTags.FRAME_COMPONENTS)
                .add(BEARING.get())
                .add(COUPLING.get())
                .add(GEAR.get())
                .add(SPRING.get())
                .add(MAGNET.get())
                .add(FUSE.get())
                .add(CAPACITOR.get());

        this.tag(ModItemTags.CORES)
                .add(MECHANICAL_CORE.get())
                .add(ELECTRICAL_CORE.get());
    }
}