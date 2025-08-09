package com.timeshipmodding.electrified.util.tags.registries;

import com.timeshipmodding.electrified.Electrified;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    public static TagKey<Item> FRAME_COMPONENTS = createTag("frame_components");

    private static TagKey<Item> createTag(String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Electrified.MODID, name));
    }
}