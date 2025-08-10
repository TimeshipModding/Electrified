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

public class MultiblockBlocksTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Electrified.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MULTIBLOCK_BLOCKS_TAB = CREATIVE_MODE_TABS.register("multiblock_blocks_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativemodetab.electrified.multiblock_blocks_tab"))
            .icon(() -> new ItemStack(COPPER_FRAME.get()))
            .displayItems((parameters, pOutput) -> {
                pOutput.accept(ALUMINIUM_FRAME);
                pOutput.accept(REDSTONE_CONTROL_BLOCK);
                pOutput.accept(COPPER_FRAME);
                pOutput.accept(EXPOSED_COPPER_FRAME);
                pOutput.accept(WEATHERED_COPPER_FRAME);
                pOutput.accept(OXIDIZED_COPPER_FRAME);
                pOutput.accept(WAXED_COPPER_FRAME);
                pOutput.accept(WAXED_EXPOSED_COPPER_FRAME);
                pOutput.accept(WAXED_WEATHERED_COPPER_FRAME);
                pOutput.accept(WAXED_OXIDIZED_COPPER_FRAME);
                pOutput.accept(POWER_SUPPLY);
            }).build());
}