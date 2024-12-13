package com.sted.rinkumod.advancements;

import net.minecraft.advancements.Advancement;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.server.ServerStartingEvent;

public class ThisIsProfessional {
    public static final ResourceLocation ID = new ResourceLocation("rinkumod", "this_is_professional");

    public static void register(ServerStartingEvent event) {
        Advancement advancement = Advancement.Builder.advancement()
            .display(... /* Display properties here */)
            .addCriterion("die_from_creeper", ... /* Criterion properties here */)
            .build(ID);
    }
}
