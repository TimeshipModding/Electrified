package com.timeshipmodding.electrified.event.registries;

import com.timeshipmodding.electrified.Electrified;
import com.timeshipmodding.electrified.content.fluid.BaseFluidType;
import com.timeshipmodding.electrified.content.fluid.registries.ModFluidTypes;
import com.timeshipmodding.electrified.content.fluid.registries.ModFluids;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;

@EventBusSubscriber(modid = Electrified.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_CRUDE_OIL.get(), RenderType.solid());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_CRUDE_OIL.get(), RenderType.solid());
        });
    }

    @SubscribeEvent
    public static void onClientExtensions(RegisterClientExtensionsEvent event) {
        event.registerFluidType(((BaseFluidType) ModFluidTypes.CRUDE_OIL_FLUID_TYPE.get()).getClientFluidTypeExtensions(),
                ModFluidTypes.CRUDE_OIL_FLUID_TYPE.get());
    }
}


