package com.timeshipmodding.electrified.content.block.registries;

import com.timeshipmodding.electrified.Electrified;
import com.timeshipmodding.electrified.content.item.registries.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.WeatheringCopperFullBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Electrified.MODID);

    // Blocks
    public static final DeferredBlock<Block> RAW_ALUMINIUM_BLOCK = registerBlock("raw_aluminium_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final DeferredBlock<Block> ALUMINIUM_BLOCK = registerBlock("aluminium_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final DeferredBlock<Block> BAUXITE_ORE = registerBlock("bauxite_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> DEEPSLATE_BAUXITE_ORE = registerBlock("deepslate_bauxite_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops().strength(4.5F, 3.0F)));
    public static final DeferredBlock<Block> ALUMINIUM_FRAME = registerBlock("aluminium_frame", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).noOcclusion().requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final DeferredBlock<Block> COPPER_FRAME = registerBlock("copper_frame", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK).noOcclusion().requiresCorrectToolForDrops().strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> EXPOSED_COPPER_FRAME = registerBlock("exposed_copper_frame", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_COPPER).noOcclusion().requiresCorrectToolForDrops().strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WEATHERED_COPPER_FRAME = registerBlock("weathered_copper_frame", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_COPPER).noOcclusion().requiresCorrectToolForDrops().strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> OXIDIZED_COPPER_FRAME = registerBlock("oxidized_copper_frame", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_COPPER).noOcclusion().requiresCorrectToolForDrops().strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_COPPER_FRAME = registerBlock("waxed_copper_frame", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK).noOcclusion().requiresCorrectToolForDrops().strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_FRAME = registerBlock("waxed_exposed_copper_frame", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_COPPER).noOcclusion().requiresCorrectToolForDrops().strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_FRAME = registerBlock("waxed_weathered_copper_frame", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_COPPER).noOcclusion().requiresCorrectToolForDrops().strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_FRAME = registerBlock("waxed_oxidized_copper_frame", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_COPPER).noOcclusion().requiresCorrectToolForDrops().strength(3.0F, 6.0F)));
    public static final DeferredBlock<Block> RAW_NICKEL_BLOCK = registerBlock("raw_nickel_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final DeferredBlock<Block> NICKEL_BLOCK = registerBlock("nickel_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final DeferredBlock<Block> NICKEL_ORE = registerBlock("nickel_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> DEEPSLATE_NICKEL_ORE = registerBlock("deepslate_nickel_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops().strength(4.5F, 3.0F)));

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
