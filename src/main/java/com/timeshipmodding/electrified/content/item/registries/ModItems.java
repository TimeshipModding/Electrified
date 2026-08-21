package com.timeshipmodding.electrified.content.item.registries;

import com.timeshipmodding.electrified.Electrified;
import com.timeshipmodding.electrified.content.item.MagnetItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Electrified.MODID);

    // Items
    public static final DeferredItem<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINIUM_SHEET = ITEMS.register("aluminium_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_SHEET = ITEMS.register("copper_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_SHEET = ITEMS.register("iron_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_WIRE_SPOOL = ITEMS.register("copper_wire_spool", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BEARING = ITEMS.register("bearing", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COUPLING = ITEMS.register("coupling", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GEAR = ITEMS.register("gear", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPRING = ITEMS.register("spring", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_NICKEL = ITEMS.register("raw_nickel", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MECHANICAL_CORE = ITEMS.register("mechanical_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRICAL_CORE = ITEMS.register("electrical_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CAPACITOR = ITEMS.register("capacitor", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FUSE = ITEMS.register("fuse", () -> new Item(new Item.Properties()));;
    public static final DeferredItem<Item> MAGNET = ITEMS.register("magnet", () -> new MagnetItem(new Item.Properties()));
}