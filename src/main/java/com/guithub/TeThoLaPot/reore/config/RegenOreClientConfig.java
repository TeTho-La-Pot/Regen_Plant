package com.guithub.TeThoLaPot.reore.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class RegenOreClientConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Config for RegenOre Mod");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
