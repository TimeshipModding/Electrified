package com.timeshipmodding.electrified.content.creativetab;

import com.timeshipmodding.electrified.Electrified;
import com.timeshipmodding.electrified.content.item.registries.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.timeshipmodding.electrified.content.item.registries.ModItems.*;
import static com.timeshipmodding.electrified.content.block.registries.ModBlocks.*;

public class MaterialsTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Electrified.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MATERIALS_TAB = CREATIVE_MODE_TABS.register("materials_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativemodetab.electrified.materials_tab"))
            .icon(() -> new ItemStack(ModItems.ALUMINIUM_INGOT.get()))
            .displayItems((parameters, pOutput) -> {
                pOutput.accept(COPPER_FRAME);
                pOutput.accept(EXPOSED_COPPER_FRAME);
                pOutput.accept(WEATHERED_COPPER_FRAME);
                pOutput.accept(OXIDIZED_COPPER_FRAME);
                pOutput.accept(WAXED_COPPER_FRAME);
                pOutput.accept(WAXED_EXPOSED_COPPER_FRAME);
                pOutput.accept(WAXED_WEATHERED_COPPER_FRAME);
                pOutput.accept(WAXED_OXIDIZED_COPPER_FRAME);
                pOutput.accept(ALUMINIUM_FRAME);
                pOutput.accept(ALUMINIUM_BLOCK);
                pOutput.accept(BAUXITE_ORE);
                pOutput.accept(DEEPSLATE_BAUXITE_ORE);
                pOutput.accept(RAW_ALUMINIUM_BLOCK);
                pOutput.accept(RAW_ALUMINIUM);
                pOutput.accept(ALUMINIUM_INGOT);
                pOutput.accept(IRON_SHEET);
                pOutput.accept(COPPER_SHEET);
                pOutput.accept(ALUMINIUM_SHEET);
                pOutput.accept(COPPER_WIRE);
                pOutput.accept(BEARING);
                pOutput.accept(COUPLING);
                pOutput.accept(GEAR);
                pOutput.accept(NUT);
                pOutput.accept(SCREW);
                pOutput.accept(SPRING);
            }).build());
}

