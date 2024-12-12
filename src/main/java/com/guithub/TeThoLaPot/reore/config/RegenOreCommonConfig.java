package com.guithub.TeThoLaPot.reore.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class RegenOreCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> OAK_REGEN_TICK;


    public static final ForgeConfigSpec.BooleanValue CAN_VANILLA_REGEN;

    static {
        BUILDER.push("Configs for RegenOre Mod");

    //Template
//        _REGEN_TICK = BUILDER.comment("How long is  regen for  ore.")
//                .define(" Regen Tick", 2000);

        OAK_REGEN_TICK = BUILDER.comment("How long is  regen for Oak.")
                .define("Iron Regen Tick", 2000);


        CAN_VANILLA_REGEN = BUILDER.comment("Can regen Plants that are already in the world.")
                .define("Can Vanilla Regen", false);




        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
