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
        basicItem(ALUMINIUM_SHEET.get());
        basicItem(COPPER_SHEET.get());
        basicItem(IRON_SHEET.get());
        basicItem(COPPER_WIRE.get());
        basicItem(SCREW.get());
        basicItem(NUT.get());
        basicItem(BEARING.get());
        basicItem(COUPLING.get());
        basicItem(GEAR.get());
        basicItem(SPRING.get());
        basicItem(MAGNET.get());
        basicItem(RAW_NICKEL.get());
        basicItem(NICKEL_INGOT.get());
        basicItem(MECHANICAL_CORE.get());
        basicItem(ELECTRICAL_CORE.get());
    }
}