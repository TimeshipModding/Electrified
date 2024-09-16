package com.timeshipmodding.electrified.content.blocks.registries;

import com.timeshipmodding.electrified.Electrified;
import com.timeshipmodding.electrified.content.item.registries.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Electrified.MODID);

    // Blocks
    public static final DeferredBlock<Block> STEEL_BLOCK = registerBlock("steel_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final DeferredBlock<Block> RAW_ALUMINIUM_BLOCK = registerBlock("raw_aluminium_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final DeferredBlock<Block> ALUMINIUM_BLOCK = registerBlock("aluminium_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final DeferredBlock<Block> BAUXITE_ORE = registerBlock("bauxite_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> DEEPSLATE_BAUXITE_ORE = registerBlock("deepslate_bauxite_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops().strength(4.5F, 3.0F)));

    // Register Methods
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredItem<Item> registerBlockItem(String name, DeferredBlock<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
