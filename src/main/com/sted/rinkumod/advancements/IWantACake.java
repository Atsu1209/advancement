package com.sted.rinkumod.advancements;

import net.minecraft.advancements.Advancement;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.server.ServerStartingEvent;

public class IWantACake {
    public static final ResourceLocation ID = new ResourceLocation("rinkumod", "i_want_a_cake");

    public static void register(ServerStartingEvent event) {
        Advancement advancement = Advancement.Builder.advancement()
            .display(... /* Display properties here */)
            .addCriterion("place_cake_on_bed", ... /* Criterion properties here */)
            .build(ID);
    }
}
