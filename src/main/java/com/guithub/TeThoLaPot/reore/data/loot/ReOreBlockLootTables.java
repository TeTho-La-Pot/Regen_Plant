package com.guithub.TeThoLaPot.reore.data.loot;

import com.guithub.TeThoLaPot.reore.init.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ReOreBlockLootTables extends BlockLootSubProvider {
    protected ReOreBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.add(ModBlocks.REGENED_IRON_ORE.get(),
                block -> this.createOreDrop(Blocks.IRON_ORE, Items.RAW_IRON));
        this.add(ModBlocks.REGENED_DEEPSLATE_IRON_ORE.get(),
                block -> this.createOreDrop(Blocks.DEEPSLATE_IRON_ORE, Items.RAW_IRON));

        this.add(ModBlocks.REGENED_COPPER_ORE.get(),
                block -> this.createCopperOreDrops(Blocks.COPPER_ORE));
        this.add(ModBlocks.REGENED_DEEPSLATE_COPPER_ORE.get(),
                block -> this.createCopperOreDrops(Blocks.DEEPSLATE_COPPER_ORE));

        this.add(ModBlocks.REGENED_GOLD_ORE.get(),
                block -> this.createOreDrop(Blocks.GOLD_ORE, Items.RAW_GOLD));
        this.add(ModBlocks.REGENED_DEEPSLATE_GOLD_ORE.get(),
                block -> this.createOreDrop(Blocks.DEEPSLATE_GOLD_ORE, Items.RAW_GOLD));
        this.add(ModBlocks.REGENED_NETHER_GOLD_ORE.get(),
                block -> this.createNetherGoldLikeOreDrops(Blocks.NETHER_GOLD_ORE, Items.GOLD_NUGGET));

        this.add(ModBlocks.REGENED_DIAMOND_ORE.get(),
                block -> this.createOreDrop(Blocks.DIAMOND_ORE, Items.DIAMOND));
        this.add(ModBlocks.REGENED_DEEPSLATE_DIAMOND_ORE.get(),
                block -> this.createOreDrop(Blocks.DEEPSLATE_DIAMOND_ORE, Items.DIAMOND));

        this.add(ModBlocks.REGENED_EMERALD_ORE.get(),
                block -> this.createOreDrop(Blocks.EMERALD_ORE, Items.EMERALD));
        this.add(ModBlocks.REGENED_DEEPSLATE_EMERALD_ORE.get(),
                block -> this.createOreDrop(Blocks.DEEPSLATE_EMERALD_ORE, Items.EMERALD));

        this.add(ModBlocks.REGENED_COAL_ORE.get(),
                block -> this.createOreDrop(Blocks.COAL_ORE, Items.COAL));
        this.add(ModBlocks.REGENED_DEEPSLATE_COAL_ORE.get(),
                block -> this.createOreDrop(Blocks.DEEPSLATE_COAL_ORE, Items.COAL));

        this.add(ModBlocks.REGENED_LAPIS_ORE.get(),
                block -> this.createLapisOreDrops(Blocks.LAPIS_ORE));
        this.add(ModBlocks.REGENED_DEEPSLATE_LAPIS_ORE.get(),
                block -> this.createLapisOreDrops(Blocks.DEEPSLATE_LAPIS_ORE));

        this.add(ModBlocks.REGENED_REDSTONE_ORE.get(),
                block -> this.createRedstoneOreDrops(Blocks.REDSTONE_ORE));
        this.add(ModBlocks.REGENED_DEEPSLATE_REDSTONE_ORE.get(),
                block -> this.createRedstoneOreDrops(Blocks.DEEPSLATE_REDSTONE_ORE));

        this.add(ModBlocks.REGENED_NETHER_QUARTZ_ORE.get(),
                block -> this.createOreDrop(Blocks.NETHER_QUARTZ_ORE, Items.QUARTZ));
    }


    protected LootTable.Builder createNetherGoldLikeOreDrops(Block pBlock, Item pItem) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(pItem)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 6.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
