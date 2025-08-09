package com.timeshipmodding.electrified.content.item.registries;

import com.timeshipmodding.electrified.Electrified;
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
    public static final DeferredItem<Item> COPPER_WIRE = ITEMS.register("copper_wire", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SCREW = ITEMS.register("screw", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NUT = ITEMS.register("nut", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BEARING = ITEMS.register("bearing", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COUPLING = ITEMS.register("coupling", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GEAR = ITEMS.register("gear", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPRING = ITEMS.register("spring", () -> new Item(new Item.Properties()));
}
