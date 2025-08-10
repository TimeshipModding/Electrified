package com.timeshipmodding.electrified.content.creativetab;

import com.timeshipmodding.electrified.Electrified;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.timeshipmodding.electrified.content.item.registries.ModItems.*;
import static com.timeshipmodding.electrified.content.block.registries.ModBlocks.*;

public class IngredientsTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Electrified.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> INGREDIENTS_TAB = CREATIVE_MODE_TABS.register("ingredients_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativemodetab.electrified.ingredients_tab"))
            .icon(() -> new ItemStack(ALUMINIUM_INGOT.get()))
            .displayItems((parameters, pOutput) -> {
                pOutput.accept(ALUMINIUM_BLOCK);
                pOutput.accept(BAUXITE_ORE);
                pOutput.accept(DEEPSLATE_BAUXITE_ORE);
                pOutput.accept(RAW_ALUMINIUM_BLOCK);
                pOutput.accept(NICKEL_BLOCK);
                pOutput.accept(NICKEL_ORE);
                pOutput.accept(DEEPSLATE_NICKEL_ORE);
                pOutput.accept(RAW_NICKEL_BLOCK);
                pOutput.accept(RAW_ALUMINIUM);
                pOutput.accept(ALUMINIUM_INGOT);
                pOutput.accept(RAW_NICKEL);
                pOutput.accept(NICKEL_INGOT);
                pOutput.accept(IRON_SHEET);
                pOutput.accept(ALUMINIUM_SHEET);
                pOutput.accept(COPPER_SHEET);
                pOutput.accept(COPPER_WIRE);
                pOutput.accept(MECHANICAL_CORE);
                pOutput.accept(ELECTRICAL_CORE);
                pOutput.accept(BEARING);
                pOutput.accept(COUPLING);
                pOutput.accept(GEAR);
                pOutput.accept(MAGNET);
                pOutput.accept(NUT);
                pOutput.accept(SCREW);
                pOutput.accept(SPRING);
                pOutput.accept(CAPACITOR);
                pOutput.accept(FUSE);
            }).build());
}