package com.guithub.TeThoLaPot.reore.data.loot;

import com.guithub.TeThoLaPot.reore.init.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
