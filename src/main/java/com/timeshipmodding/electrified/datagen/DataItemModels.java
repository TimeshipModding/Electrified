package com.timeshipmodding.electrified.datagen;

import com.timeshipmodding.electrified.Electrified;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static com.timeshipmodding.electrified.content.item.registries.ModItems.*;

public class DataItemModels extends ItemModelProvider {
    public DataItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Electrified.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Items
        basicItem(STEEL_INGOT.get());
        basicItem(RAW_ALUMINIUM.get());
        basicItem(ALUMINIUM_INGOT.get());
    }
}
