package com.guithub.TeThoLaPot.reore.data.lang;

import com.guithub.TeThoLaPot.reore.RE_Ore;
import com.guithub.TeThoLaPot.reore.init.block.ModBlocks;
import com.guithub.TeThoLaPot.reore.item.Items;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Locale;

public class ENUSLangProvider extends LanguageProvider {
    public ENUSLangProvider(PackOutput output) {
        super(output, RE_Ore.MOD_ID, Locale.US.toString().toLowerCase());
    }

    @Override
    protected void addTranslations() {
        //Items
        addItem(Items.TORE, "Raw Test Ore");

        //Blocks
        addBlock(ModBlocks.REGEN_IRON_ORE_ENTITY, "Regening Iron Ore");
        addBlock(ModBlocks.REGENED_IRON_ORE, "Regened Iron Ore");
        addBlock(ModBlocks.REGEN_DEEPSLATE_IRON_ORE_ENTITY, "Regening Deepslate Iron Ore");
        addBlock(ModBlocks.REGENED_DEEPSLATE_IRON_ORE, "Regened Deepslate Iron Ore");
        addBlock(ModBlocks.REGEN_COPPER_ORE_ENTITY, "Regening Copper Ore");
        addBlock(ModBlocks.REGENED_COPPER_ORE, "Regened Copper Ore");
        addBlock(ModBlocks.REGEN_DEEPSLATE_COPPER_ORE_ENTITY, "Regening Deepslate Copper Ore");
        addBlock(ModBlocks.REGENED_DEEPSLATE_COPPER_ORE, "Regened Deepslate Copper Ore");
        addBlock(ModBlocks.REGEN_GOLD_ORE_ENTITY, "Regening Gold Ore");
        addBlock(ModBlocks.REGENED_GOLD_ORE, "Regened Gold Ore");
        addBlock(ModBlocks.REGEN_DEEPSLATE_GOLD_ORE_ENTITY, "Regening Deepslate Gold Ore");
        addBlock(ModBlocks.REGENED_DEEPSLATE_GOLD_ORE, "Regened Deepslate Gold Ore");
        addBlock(ModBlocks.REGEN_NETHER_GOLD_ORE_ENTITY, "Regening Nether Gold Ore");
        addBlock(ModBlocks.REGENED_NETHER_GOLD_ORE, "Regened NEther Gold Ore");
        addBlock(ModBlocks.REGEN_DIAMOND_ORE_ENTITY, "Regening Diamond Ore");
        addBlock(ModBlocks.REGENED_DIAMOND_ORE, "Regened Diamond Ore");
        addBlock(ModBlocks.REGEN_DEEPSLATE_DIAMOND_ORE_ENTITY, "Regening Deepslate Diamond Ore");
        addBlock(ModBlocks.REGENED_DEEPSLATE_DIAMOND_ORE, "Regened Deepslate Diamond Ore");
        addBlock(ModBlocks.REGEN_EMERALD_ORE_ENTITY, "Regening Emerald Ore");
        addBlock(ModBlocks.REGENED_EMERALD_ORE, "Regened Emerald Ore");
        addBlock(ModBlocks.REGEN_DEEPSLATE_EMERALD_ORE_ENTITY, "Regening Deepslate Emerald Ore");
        addBlock(ModBlocks.REGENED_DEEPSLATE_EMERALD_ORE, "Regened Deepslate Emerald Ore");
        addBlock(ModBlocks.REGEN_COAL_ORE_ENTITY, "Regening Coal Ore");
        addBlock(ModBlocks.REGENED_COAL_ORE, "Regened Coal Ore");
        addBlock(ModBlocks.REGEN_DEEPSLATE_COAL_ORE_ENTITY, "Regening Deepslate Coal Ore");
        addBlock(ModBlocks.REGENED_DEEPSLATE_COAL_ORE, "Regened Deepslate Coal Ore");
        addBlock(ModBlocks.REGEN_LAPIS_ORE_ENTITY, "Regening Lapis Lazuli Ore");
        addBlock(ModBlocks.REGENED_LAPIS_ORE, "Regened Lapis Lazuli Ore");
        addBlock(ModBlocks.REGEN_DEEPSLATE_LAPIS_ORE_ENTITY, "Regening Deepslate Lapis Lazuli Ore");
        addBlock(ModBlocks.REGENED_DEEPSLATE_LAPIS_ORE, "Regened Deepslate Lapis Lazuli Ore");
        addBlock(ModBlocks.REGEN_REDSTONE_ORE_ENTITY, "Regening Redstone Ore");
        addBlock(ModBlocks.REGENED_REDSTONE_ORE, "Regened Redstone Ore");
        addBlock(ModBlocks.REGEN_DEEPSLATE_REDSTONE_ORE_ENTITY, "Regening Deepslate Redstone Ore");
        addBlock(ModBlocks.REGENED_DEEPSLATE_REDSTONE_ORE, "Regened Deepslate Redstone Ore");
        addBlock(ModBlocks.REGEN_NETHER_QUARTZ_ORE_ENTITY, "Regening Nether Quartz Ore");
        addBlock(ModBlocks.REGENED_NETHER_QUARTZ_ORE, "Regened NEther Quartz Ore");
        addBlock(ModBlocks.TEST_ORE, "Test Ore");

        //CreativeTabs
        add("Creativetabs.reore_tab", "Regen Ore");
    }
}
