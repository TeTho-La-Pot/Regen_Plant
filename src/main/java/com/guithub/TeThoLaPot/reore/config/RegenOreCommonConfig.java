package com.guithub.TeThoLaPot.reore.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class RegenOreCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> IRON_ORE_REGEN_TICK;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_IRON_ORE_REGEN_TICK;
    public static final ForgeConfigSpec.ConfigValue<Integer> COPPER_ORE_REGEN_TICK;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_COPPER_ORE_REGEN_TICK;
    public static final ForgeConfigSpec.ConfigValue<Integer> GOLD_ORE_REGEN_TICK;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_GOLD_ORE_REGEN_TICK;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_GOLD_ORE_REGEN_TICK;
    public static final ForgeConfigSpec.ConfigValue<Integer> DIAMOND_ORE_REGEN_TICK;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_DIAMOND_ORE_REGEN_TICK;
    public static final ForgeConfigSpec.ConfigValue<Integer> EMERALD_ORE_REGEN_TICK;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_EMERALD_ORE_REGEN_TICK;
    public static final ForgeConfigSpec.ConfigValue<Integer> COAL_ORE_REGEN_TICK;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_COAL_ORE_REGEN_TICK;
    public static final ForgeConfigSpec.ConfigValue<Integer> LAPIS_ORE_REGEN_TICK;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_LAPIS_ORE_REGEN_TICK;
    public static final ForgeConfigSpec.ConfigValue<Integer> REDSTONE_ORE_REGEN_TICK;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_REDSTONE_ORE_REGEN_TICK;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_QUARTZ_ORE_REGEN_TICK;
    public static final ForgeConfigSpec.BooleanValue CAN_VANILLA_REGEN;

    static {
        BUILDER.push("Configs for RegenOre Mod");

        IRON_ORE_REGEN_TICK = BUILDER.comment("How long is  regen for Iron ore.")
                .define("Iron Regen Tick", 2000);
        DEEPSLATE_IRON_ORE_REGEN_TICK = BUILDER.comment("How long is  regen for Deepslate Iron ore.")
                .define("Deepslate Iron Regen Tick", 2000);
        COPPER_ORE_REGEN_TICK = BUILDER.comment("How long is  regen for Copper ore.")
                .define("Copper Regen Tick", 2000);
        DEEPSLATE_COPPER_ORE_REGEN_TICK = BUILDER.comment("How long is  regen for Deepslate Copper ore.")
                .define("Deepslate Copper Regen Tick", 2000);
        GOLD_ORE_REGEN_TICK = BUILDER.comment("How long is  regen for Gold ore.")
                .define("Gold Regen Tick", 2000);
        DEEPSLATE_GOLD_ORE_REGEN_TICK = BUILDER.comment("How long is  regen for Deepslate Gold ore.")
                .define("Deepslate Gold Regen Tick", 2000);
        NETHER_GOLD_ORE_REGEN_TICK = BUILDER.comment("How long is  regen for Nether Gold ore.")
                .define("Nether Gold Regen Tick", 2000);
        DIAMOND_ORE_REGEN_TICK = BUILDER.comment("How long is  regen for Diamond ore.")
                .define("Diamond Regen Tick", 2000);
        DEEPSLATE_DIAMOND_ORE_REGEN_TICK = BUILDER.comment("How long is  regen for Deepslate Diamond ore.")
                .define("Deepslate Diamond Regen Tick", 2000);
        EMERALD_ORE_REGEN_TICK = BUILDER.comment("How long is  regen for Emerald ore.")
                .define("Emerald Regen Tick", 2000);
        DEEPSLATE_EMERALD_ORE_REGEN_TICK = BUILDER.comment("How long is  regen for Deepslate Emerald ore.")
                .define("Deepslate Emerald Regen Tick", 2000);
        COAL_ORE_REGEN_TICK = BUILDER.comment("How long is  regen for Coal ore.")
                .define("Coal Regen Tick", 2000);
        DEEPSLATE_COAL_ORE_REGEN_TICK = BUILDER.comment("How long is  regen for Deepslate Coal ore.")
                .define("Deepslate Coal Regen Tick", 2000);
        LAPIS_ORE_REGEN_TICK = BUILDER.comment("How long is  regen for Lapis ore.")
                .define("Lapis Regen Tick", 2000);
        DEEPSLATE_LAPIS_ORE_REGEN_TICK = BUILDER.comment("How long is  regen for Deepslate Lapis ore.")
                .define("Deepslate Lapis Regen Tick", 2000);
        REDSTONE_ORE_REGEN_TICK = BUILDER.comment("How long is  regen for Redstone ore.")
                .define("Redstone Regen Tick", 2000);
        DEEPSLATE_REDSTONE_ORE_REGEN_TICK = BUILDER.comment("How long is  regen for Deepslate Redstone ore.")
                .define("Deepslate Redstone Regen Tick", 2000);
        NETHER_QUARTZ_ORE_REGEN_TICK = BUILDER.comment("How long is  regen for Deepslate Iron ore.")
                .define("Nether Quartz Regen Tick", 2000);

        CAN_VANILLA_REGEN = BUILDER.comment("Can regen ores that are already in the world.")
                .define("Can Vanilla Regen", false);




        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
