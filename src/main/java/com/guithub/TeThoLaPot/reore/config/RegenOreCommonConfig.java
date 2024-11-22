package com.guithub.TeThoLaPot.reore.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class RegenOreCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> IRON_ORE_REGEN_TICK;

    static {
        BUILDER.push("Configs for RegenOre Mod");

        IRON_ORE_REGEN_TICK = BUILDER.comment("How long is  regen for iron ore.")
                .define("Regen Tick", 100);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
