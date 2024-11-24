package com.guithub.TeThoLaPot.reore.init.block;

import com.guithub.TeThoLaPot.reore.RE_Ore;
import com.guithub.TeThoLaPot.reore.init.block.Coal.RegenCoal;
import com.guithub.TeThoLaPot.reore.init.block.Coal.RegenDeepslateCoal;
import com.guithub.TeThoLaPot.reore.init.block.Coal.RegenedCoal;
import com.guithub.TeThoLaPot.reore.init.block.Coal.RegenedDeepslateCoal;
import com.guithub.TeThoLaPot.reore.init.block.Copper.RegenCopper;
import com.guithub.TeThoLaPot.reore.init.block.Copper.RegenDeepslateCopper;
import com.guithub.TeThoLaPot.reore.init.block.Copper.RegenedCopper;
import com.guithub.TeThoLaPot.reore.init.block.Copper.RegenedDeepslateCopper;
import com.guithub.TeThoLaPot.reore.init.block.Diamond.RegenDeepslateDiamond;
import com.guithub.TeThoLaPot.reore.init.block.Diamond.RegenDiamond;
import com.guithub.TeThoLaPot.reore.init.block.Diamond.RegenedDeepslateDiamond;
import com.guithub.TeThoLaPot.reore.init.block.Diamond.RegenedDiamond;
import com.guithub.TeThoLaPot.reore.init.block.Emerald.RegenDeepslateEmerald;
import com.guithub.TeThoLaPot.reore.init.block.Emerald.RegenEmerald;
import com.guithub.TeThoLaPot.reore.init.block.Emerald.RegenedDeepslateEmerald;
import com.guithub.TeThoLaPot.reore.init.block.Emerald.RegenedEmerald;
import com.guithub.TeThoLaPot.reore.init.block.Gold.*;
import com.guithub.TeThoLaPot.reore.init.block.Iron.RegenDeepslateIron;
import com.guithub.TeThoLaPot.reore.init.block.Iron.RegenIron;
import com.guithub.TeThoLaPot.reore.init.block.Iron.RegenedDeepslateIron;
import com.guithub.TeThoLaPot.reore.init.block.Iron.RegenedIron;
import com.guithub.TeThoLaPot.reore.init.block.Lapis.RegenDeepslateLapis;
import com.guithub.TeThoLaPot.reore.init.block.Lapis.RegenLapis;
import com.guithub.TeThoLaPot.reore.init.block.Lapis.RegenedDeepslateLapis;
import com.guithub.TeThoLaPot.reore.init.block.Lapis.RegenedLapis;
import com.guithub.TeThoLaPot.reore.init.block.NetherQuartz.RegenNetherQuartz;
import com.guithub.TeThoLaPot.reore.init.block.NetherQuartz.RegenedNetherQuartz;
import com.guithub.TeThoLaPot.reore.init.block.Redstone.RegenDeepslateRedstone;
import com.guithub.TeThoLaPot.reore.init.block.Redstone.RegenRedstone;
import com.guithub.TeThoLaPot.reore.init.block.Redstone.RegenedDeepslateRedstone;
import com.guithub.TeThoLaPot.reore.init.block.Redstone.RegenedRedstone;
import com.guithub.TeThoLaPot.reore.item.Items;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, RE_Ore.MOD_ID);

    public static final RegistryObject<Block> TEST_ORE = registerBlock("test_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noLootTable()));


    //鉄鉱石
    public static final RegistryObject<Block> REGEN_IRON_ORE_ENTITY = registerBlock("regen_iron_ore",
            () -> new RegenIron(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noLootTable()));

    public static final RegistryObject<Block> REGENED_IRON_ORE = registerBlock("regened_iron_ore",
            () -> new RegenedIron(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> REGEN_DEEPSLATE_IRON_ORE_ENTITY = registerBlock("regen_deepslate_iron_ore",
            () -> new RegenDeepslateIron(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).noLootTable()));

    public static final RegistryObject<Block> REGENED_DEEPSLATE_IRON_ORE = registerBlock("regened_deepslate_iron_ore",
            () -> new RegenedDeepslateIron(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)));


    //銅鉱石
    public static final RegistryObject<Block> REGEN_COPPER_ORE_ENTITY = registerBlock("regen_copper_ore",
            () -> new RegenCopper(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noLootTable()));

    public static final RegistryObject<Block> REGENED_COPPER_ORE = registerBlock("regened_copper_ore",
            () -> new RegenedCopper(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));

    public static final RegistryObject<Block> REGEN_DEEPSLATE_COPPER_ORE_ENTITY = registerBlock("regen_deepslate_copper_ore",
            () -> new RegenDeepslateCopper(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).noLootTable()));

    public static final RegistryObject<Block> REGENED_DEEPSLATE_COPPER_ORE = registerBlock("regened_deepslate_copper_ore",
            () -> new RegenedDeepslateCopper(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE)));


    //金鉱石・ネザー金鉱石
    public static final RegistryObject<Block> REGEN_GOLD_ORE_ENTITY = registerBlock("regen_gold_ore",
            () -> new RegenGold(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noLootTable()));

    public static final RegistryObject<Block> REGENED_GOLD_ORE = registerBlock("regened_gold_ore",
            () -> new RegenedGold(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));

    public static final RegistryObject<Block> REGEN_DEEPSLATE_GOLD_ORE_ENTITY = registerBlock("regen_deepslate_gold_ore",
            () -> new RegenDeepslateGold(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).noLootTable()));

    public static final RegistryObject<Block> REGENED_DEEPSLATE_GOLD_ORE = registerBlock("regened_deepslate_gold_ore",
            () -> new RegenedDeepslateGold(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)));

    public static final RegistryObject<Block> REGEN_NETHER_GOLD_ORE_ENTITY = registerBlock("regen_nether_gold_ore",
            () -> new RegenNetherGold(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).noLootTable()));

    public static final RegistryObject<Block> REGENED_NETHER_GOLD_ORE = registerBlock("regened_nether_gold_ore",
            () -> new RegenedNetherGold(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE)));


    //ダイヤモンド
    public static final RegistryObject<Block> REGEN_DIAMOND_ORE_ENTITY = registerBlock("regen_diamond_ore",
            () -> new RegenDiamond(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noLootTable()));

    public static final RegistryObject<Block> REGENED_DIAMOND_ORE = registerBlock("regened_diamond_ore",
            () -> new RegenedDiamond(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));

    public static final RegistryObject<Block> REGEN_DEEPSLATE_DIAMOND_ORE_ENTITY = registerBlock("regen_deepslate_diamond_ore",
            () -> new RegenDeepslateDiamond(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).noLootTable()));

    public static final RegistryObject<Block> REGENED_DEEPSLATE_DIAMOND_ORE = registerBlock("regened_deepslate_diamond_ore",
            () -> new RegenedDeepslateDiamond(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));


    //エメラルド
    public static final RegistryObject<Block> REGEN_EMERALD_ORE_ENTITY = registerBlock("regen_emerald_ore",
            () -> new RegenEmerald(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noLootTable()));

    public static final RegistryObject<Block> REGENED_EMERALD_ORE = registerBlock("regened_emerald_ore",
            () -> new RegenedEmerald(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)));

    public static final RegistryObject<Block> REGEN_DEEPSLATE_EMERALD_ORE_ENTITY = registerBlock("regen_deepslate_emerald_ore",
            () -> new RegenDeepslateEmerald(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).noLootTable()));

    public static final RegistryObject<Block> REGENED_DEEPSLATE_EMERALD_ORE = registerBlock("regened_deepslate_emerald_ore",
            () -> new RegenedDeepslateEmerald(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_EMERALD_ORE)));


    //石炭
    public static final RegistryObject<Block> REGEN_COAL_ORE_ENTITY = registerBlock("regen_coal_ore",
            () -> new RegenCoal(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noLootTable()));

    public static final RegistryObject<Block> REGENED_COAL_ORE = registerBlock("regened_coal_ore",
            () -> new RegenedCoal(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));

    public static final RegistryObject<Block> REGEN_DEEPSLATE_COAL_ORE_ENTITY = registerBlock("regen_deepslate_coal_ore",
            () -> new RegenDeepslateCoal(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).noLootTable()));

    public static final RegistryObject<Block> REGENED_DEEPSLATE_COAL_ORE = registerBlock("regened_deepslate_coal_ore",
            () -> new RegenedDeepslateCoal(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE)));


    //ラピスラズリ
    public static final RegistryObject<Block> REGEN_LAPIS_ORE_ENTITY = registerBlock("regen_lapis_ore",
            () -> new RegenLapis(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noLootTable()));

    public static final RegistryObject<Block> REGENED_LAPIS_ORE = registerBlock("regened_lapis_ore",
            () -> new RegenedLapis(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)));

    public static final RegistryObject<Block> REGEN_DEEPSLATE_LAPIS_ORE_ENTITY = registerBlock("regen_deepslate_lapis_ore",
            () -> new RegenDeepslateLapis(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).noLootTable()));

    public static final RegistryObject<Block> REGENED_DEEPSLATE_LAPIS_ORE = registerBlock("regened_deepslate_lapis_ore",
            () -> new RegenedDeepslateLapis(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE)));


    //レッドストーン
    public static final RegistryObject<Block> REGEN_REDSTONE_ORE_ENTITY = registerBlock("regen_redstone_ore",
            () -> new RegenRedstone(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noLootTable()));

    public static final RegistryObject<Block> REGENED_REDSTONE_ORE = registerBlock("regened_redstone_ore",
            () -> new RegenedRedstone(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE)));

    public static final RegistryObject<Block> REGEN_DEEPSLATE_REDSTONE_ORE_ENTITY = registerBlock("regen_deepslate_redstone_ore",
            () -> new RegenDeepslateRedstone(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).noLootTable()));

    public static final RegistryObject<Block> REGENED_DEEPSLATE_REDSTONE_ORE = registerBlock("regened_deepslate_redstone_ore",
            () -> new RegenedDeepslateRedstone(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_REDSTONE_ORE)));


    //ネザークォーツ
    public static final RegistryObject<Block> REGEN_NETHER_QUARTZ_ORE_ENTITY = registerBlock("regen_nether_quartz_ore",
            () -> new RegenNetherQuartz(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).noLootTable()));

    public static final RegistryObject<Block> REGENED_NETHER_QUARTZ_ORE = registerBlock("regened_nether_quartz_ore",
            () -> new RegenedNetherQuartz(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name,toReturn);
        return toReturn;
    }

    private  static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return Items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
