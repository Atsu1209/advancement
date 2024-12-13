package com.sted.rinkumod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.event.server.ServerStoppingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import com.sted.rinkumod.advancements.GoBedBro;
import com.sted.rinkumod.advancements.ThisIsProfessional;
import com.sted.rinkumod.advancements.IWantACake;

@Mod("rinkumod")
public class RinkuMod {
    public RinkuMod() {
        // Mod initialization
    }

    @EventBusSubscriber(modid = "rinkumod", bus = Bus.MOD)
    public static class Events {
        @SubscribeEvent
        public static void onCommonSetup(FMLCommonSetupEvent event) {
            // Common setup
        }

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Client setup
        }

        @SubscribeEvent
        public static void onServerStarting(FMLServerStartingEvent event) {
            GoBedBro.register(event);
            ThisIsProfessional.register(event);
            IWantACake.register(event);
        }
    }
}
