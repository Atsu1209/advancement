package com.sted.rinkumod.advancements;

import net.minecraft.advancements.Advancement;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.server.ServerStartingEvent;

public class GoBedBro {
    public static final ResourceLocation ID = new ResourceLocation("rinkumod", "go_bed_bro");

    public static void register(ServerStartingEvent event) {
        Advancement advancement = Advancement.Builder.advancement()
            .display(... /* Display properties here */)
            .addCriterion("kill_phantoms", ... /* Criterion properties here */)
            .build(ID);
    }
}
