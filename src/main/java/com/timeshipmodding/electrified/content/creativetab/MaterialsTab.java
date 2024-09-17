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
import static com.timeshipmodding.electrified.content.blocks.registries.ModBlocks.*;

public class MaterialsTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Electrified.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ESSENTIALS_TAB = CREATIVE_MODE_TABS.register("materials_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativemodetab.electrified.materials_tab"))
            .icon(() -> new ItemStack(ModItems.ALUMINIUM_INGOT.get()))
            .displayItems((parameters, pOutput) -> {
                pOutput.accept(ALUMINIUM_BLOCK);
                pOutput.accept(NICKEL_BLOCK);
                pOutput.accept(STEEL_BLOCK);
                pOutput.accept(BAUXITE_ORE);
                pOutput.accept(DEEPSLATE_BAUXITE_ORE);
                pOutput.accept(NICKEL_ORE);
                pOutput.accept(DEEPSLATE_NICKEL_ORE);
                pOutput.accept(RAW_ALUMINIUM_BLOCK);
                pOutput.accept(RAW_NICKEL_BLOCK);
                pOutput.accept(RAW_ALUMINIUM);
                pOutput.accept(RAW_NICKEL);
                pOutput.accept(ALUMINIUM_INGOT);
                pOutput.accept(NICKEL_INGOT);
                pOutput.accept(STEEL_INGOT);
            }).build());
}

