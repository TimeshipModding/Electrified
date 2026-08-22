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
        basicItem(RAW_ALUMINIUM.get());
        basicItem(ALUMINIUM_INGOT.get());
        basicItem(RAW_NICKEL.get());
        basicItem(NICKEL_INGOT.get());
        basicItem(IRON_SHEET.get());
        basicItem(ALUMINIUM_SHEET.get());
        basicItem(COPPER_SHEET.get());
        basicItem(GOLD_SHEET.get());
        basicItem(ALUMINIUM_WIRE_SPOOL.get());
        basicItem(COPPER_WIRE_SPOOL.get());
        basicItem(GOLD_WIRE_SPOOL.get());
        basicItem(FUSE.get());
        basicItem(MECHANICAL_CORE.get());
        basicItem(ELECTRICAL_CORE.get());
        basicItem(BEARING.get());
        basicItem(COUPLING.get());
        basicItem(GEAR.get());
        basicItem(SPRING.get());
        basicItem(CAPACITOR.get());
        basicItem(MAGNET.get());
    }
}