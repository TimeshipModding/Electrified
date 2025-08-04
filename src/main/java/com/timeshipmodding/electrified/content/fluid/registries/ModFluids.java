package com.timeshipmodding.electrified.content.fluid.registries;

import com.timeshipmodding.electrified.Electrified;
import com.timeshipmodding.electrified.content.block.registries.ModBlocks;
import com.timeshipmodding.electrified.content.item.registries.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(BuiltInRegistries.FLUID, Electrified.MODID);

    public static final Supplier<FlowingFluid> SOURCE_CRUDE_OIL = FLUIDS.register("source_crude_oil_water", () -> new BaseFlowingFluid.Source(ModFluids.CRUDE_OIL_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_CRUDE_OIL = FLUIDS.register("flowing_crude_oil_water", () -> new BaseFlowingFluid.Flowing(ModFluids.CRUDE_OIL_PROPERTIES));

    public static final BaseFlowingFluid.Properties CRUDE_OIL_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.CRUDE_OIL_FLUID_TYPE, SOURCE_CRUDE_OIL, FLOWING_CRUDE_OIL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).tickRate(15)
            .block(ModBlocks.CRUDE_OIL_BLOCK).bucket(ModItems.CRUDE_OIL_BUCKET);
}
