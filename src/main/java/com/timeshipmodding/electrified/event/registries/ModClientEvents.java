package com.timeshipmodding.electrified.event.registries;

import com.timeshipmodding.electrified.content.ponder.ElectrifiedPonderPlugin;
import net.createmod.ponder.foundation.PonderIndex;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber
public class ModClientEvents {
    @SubscribeEvent
    private void onClientSetup(FMLClientSetupEvent event) {
        // Register Ponders
        PonderIndex.addPlugin(new ElectrifiedPonderPlugin());
    }
}
