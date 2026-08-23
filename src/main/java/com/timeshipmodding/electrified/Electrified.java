package com.timeshipmodding.electrified;

import com.timeshipmodding.electrified.content.block.registries.ModBlocks;
import com.timeshipmodding.electrified.content.creativetab.ElectrifiedTab;
import com.timeshipmodding.electrified.content.item.registries.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(Electrified.MODID)
public class Electrified
{
    public static final String MODID = "electrified";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Electrified(IEventBus modEventBus, ModContainer modContainer) {
        // Register registry classes
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        // Register creative mode tab
        ElectrifiedTab.registerCreativeTab(modEventBus);
    }
}