package com.timeshipmodding.electrified.content.creativetab;

import com.timeshipmodding.electrified.Electrified;
import net.mcexpanded.fancytabsections.FancyTabSections;
import net.mcexpanded.fancytabsections.Section.SectionTextured;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;

import static com.timeshipmodding.electrified.content.item.registries.ModItems.*;
import static com.timeshipmodding.electrified.content.block.registries.ModBlocks.*;

public interface ElectrifiedTab {
    static void registerCreativeTab(IEventBus modEventBus) {
        FancyTabSections.registerCreativeModeTab(modEventBus, modResourceLocation("electrified_tab"), ALUMINIUM_INGOT);

        FancyTabSections.addSection(modResourceLocation("electrified_tab"),
                new SectionTextured(modResourceLocation("mechanical_section"))
                        .setTitle(Component.translatable("section.electrified.mechanical"))
                        .setDisplayItem((registryAccess) -> MECHANICAL_CORE.get().getDefaultInstance())
                        .add(ALUMINIUM_FRAME)
                        .add(REDSTONE_CONTROL_BLOCK)
                        .add(ALUMINIUM_BLOCK)
                        .add(BAUXITE_ORE)
                        .add(DEEPSLATE_BAUXITE_ORE)
                        .add(RAW_ALUMINIUM_BLOCK)
                        .add(RAW_ALUMINIUM)
                        .add(ALUMINIUM_INGOT)
                        .add(ALUMINIUM_SHEET)
                        .add(IRON_SHEET)
                        .add(COPPER_SHEET)
                        .add(GOLD_SHEET)
                        .add(MECHANICAL_CORE)
                        .add(BEARING)
                        .add(COUPLING)
                        .add(GEAR)
                        .add(SPRING)
        );

        FancyTabSections.addSection(modResourceLocation("electrified_tab"),
                new SectionTextured(modResourceLocation("electrical_section"))
                        .setTitle(Component.translatable("section.electrified.electrical"))
                        .setDisplayItem((registryAccess) -> ELECTRICAL_CORE.get().getDefaultInstance())
                        .add(COPPER_FRAME)
                        .add(EXPOSED_COPPER_FRAME)
                        .add(WEATHERED_COPPER_FRAME)
                        .add(OXIDIZED_COPPER_FRAME)
                        .add(WAXED_COPPER_FRAME)
                        .add(WAXED_EXPOSED_COPPER_FRAME)
                        .add(WAXED_WEATHERED_COPPER_FRAME)
                        .add(WAXED_OXIDIZED_COPPER_FRAME)
                        .add(POWER_SUPPLY)
                        .add(NICKEL_BLOCK)
                        .add(NICKEL_ORE)
                        .add(DEEPSLATE_NICKEL_ORE)
                        .add(RAW_NICKEL_BLOCK)
                        .add(RAW_NICKEL)
                        .add(NICKEL_INGOT)
                        .add(ALUMINIUM_WIRE_SPOOL)
                        .add(COPPER_WIRE_SPOOL)
                        .add(GOLD_WIRE_SPOOL)
                        .add(ELECTRICAL_CORE)
                        .add(CAPACITOR)
                        .add(MAGNET)
                        .add(FUSE)
        );
    }

    static ResourceLocation modResourceLocation(String path)
    {
        return ResourceLocation.fromNamespaceAndPath(Electrified.MODID, path);
    }
}
