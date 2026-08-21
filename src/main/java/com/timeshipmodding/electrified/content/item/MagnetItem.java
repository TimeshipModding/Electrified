package com.timeshipmodding.electrified.content.item;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class MagnetItem extends Item {
    public MagnetItem(Properties properties) {
        super(properties);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        if (isSelected) {
            AABB magnetRange = new AABB(entity.blockPosition()).inflate(2, 2, 2);
            List<Entity> droppedItemList = level.getEntities((ItemEntity) null, magnetRange, entity1 -> entity1 instanceof ItemEntity);

            for (Entity droppedItem : droppedItemList) {
                droppedItem.moveTo(entity.position());
            }
        }
    }
}
