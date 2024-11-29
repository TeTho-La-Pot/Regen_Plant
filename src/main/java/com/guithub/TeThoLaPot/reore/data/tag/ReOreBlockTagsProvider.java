package com.guithub.TeThoLaPot.reore.data.tag;

import com.guithub.TeThoLaPot.reore.RE_Ore;
import com.guithub.TeThoLaPot.reore.init.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ReOreBlockTagsProvider extends BlockTagsProvider {
    public ReOreBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, RE_Ore.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ModBlocks.REGENED_IRON_ORE.get(),
                ModBlocks.REGEN_IRON_ORE_ENTITY.get(),
                ModBlocks.REGENED_DEEPSLATE_IRON_ORE.get(),
                ModBlocks.REGEN_DEEPSLATE_IRON_ORE_ENTITY.get(),
                ModBlocks.REGENED_COPPER_ORE.get(),
                ModBlocks.REGEN_COPPER_ORE_ENTITY.get(),
                ModBlocks.REGENED_DEEPSLATE_COPPER_ORE.get(),
                ModBlocks.REGEN_DEEPSLATE_COPPER_ORE_ENTITY.get(),
                ModBlocks.REGENED_GOLD_ORE.get(),
                ModBlocks.REGEN_GOLD_ORE_ENTITY.get(),
                ModBlocks.REGENED_DEEPSLATE_GOLD_ORE.get(),
                ModBlocks.REGEN_DEEPSLATE_GOLD_ORE_ENTITY.get(),
                ModBlocks.REGENED_NETHER_GOLD_ORE.get(),
                ModBlocks.REGEN_NETHER_GOLD_ORE_ENTITY.get(),
                ModBlocks.REGENED_DIAMOND_ORE.get(),
                ModBlocks.REGEN_DIAMOND_ORE_ENTITY.get(),
                ModBlocks.REGENED_DEEPSLATE_DIAMOND_ORE.get(),
                ModBlocks.REGEN_DEEPSLATE_DIAMOND_ORE_ENTITY.get(),
                ModBlocks.REGENED_EMERALD_ORE.get(),
                ModBlocks.REGEN_EMERALD_ORE_ENTITY.get(),
                ModBlocks.REGENED_DEEPSLATE_EMERALD_ORE.get(),
                ModBlocks.REGEN_DEEPSLATE_EMERALD_ORE_ENTITY.get(),
                ModBlocks.REGENED_COAL_ORE.get(),
                ModBlocks.REGEN_COAL_ORE_ENTITY.get(),
                ModBlocks.REGENED_DEEPSLATE_COAL_ORE.get(),
                ModBlocks.REGEN_DEEPSLATE_COAL_ORE_ENTITY.get(),
                ModBlocks.REGENED_LAPIS_ORE.get(),
                ModBlocks.REGEN_LAPIS_ORE_ENTITY.get(),
                ModBlocks.REGENED_DEEPSLATE_LAPIS_ORE.get(),
                ModBlocks.REGEN_DEEPSLATE_LAPIS_ORE_ENTITY.get(),
                ModBlocks.REGENED_REDSTONE_ORE.get(),
                ModBlocks.REGEN_REDSTONE_ORE_ENTITY.get(),
                ModBlocks.REGENED_DEEPSLATE_REDSTONE_ORE.get(),
                ModBlocks.REGEN_DEEPSLATE_REDSTONE_ORE_ENTITY.get(),
                ModBlocks.REGENED_NETHER_QUARTZ_ORE.get(),
                ModBlocks.REGEN_NETHER_QUARTZ_ORE_ENTITY.get(),

                ModBlocks.V_REGEN_IRON_ORE_ENTITY.get(),
                ModBlocks.V_REGEN_DEEPSLATE_IRON_ORE_ENTITY.get(),
                ModBlocks.V_REGEN_COPPER_ORE_ENTITY.get(),
                ModBlocks.V_REGEN_DEEPSLATE_COPPER_ORE_ENTITY.get(),
                ModBlocks.V_REGEN_GOLD_ORE_ENTITY.get(),
                ModBlocks.V_REGEN_DEEPSLATE_GOLD_ORE_ENTITY.get(),
                ModBlocks.V_REGEN_NETHER_GOLD_ORE_ENTITY.get(),
                ModBlocks.V_REGEN_DIAMOND_ORE_ENTITY.get(),
                ModBlocks.V_REGEN_DEEPSLATE_DIAMOND_ORE_ENTITY.get(),
                ModBlocks.V_REGEN_EMERALD_ORE_ENTITY.get(),
                ModBlocks.V_REGEN_DEEPSLATE_EMERALD_ORE_ENTITY.get(),
                ModBlocks.V_REGEN_COAL_ORE_ENTITY.get(),
                ModBlocks.V_REGEN_DEEPSLATE_COAL_ORE_ENTITY.get(),
                ModBlocks.V_REGEN_LAPIS_ORE_ENTITY.get(),
                ModBlocks.V_REGEN_DEEPSLATE_LAPIS_ORE_ENTITY.get(),
                ModBlocks.V_REGEN_REDSTONE_ORE_ENTITY.get(),
                ModBlocks.V_REGEN_DEEPSLATE_REDSTONE_ORE_ENTITY.get(),
                ModBlocks.V_REGEN_NETHER_QUARTZ_ORE_ENTITY.get()
        );

        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                ModBlocks.REGENED_IRON_ORE.get(),
                ModBlocks.REGENED_DEEPSLATE_IRON_ORE.get(),
                ModBlocks.REGENED_COPPER_ORE.get(),
                ModBlocks.REGENED_DEEPSLATE_COPPER_ORE.get(),
                ModBlocks.REGENED_LAPIS_ORE.get(),
                ModBlocks.REGENED_DEEPSLATE_LAPIS_ORE.get()
        );

        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                ModBlocks.REGENED_GOLD_ORE.get(),
                ModBlocks.REGENED_DEEPSLATE_GOLD_ORE.get(),
                ModBlocks.REGENED_DIAMOND_ORE.get(),
                ModBlocks.REGENED_DEEPSLATE_DIAMOND_ORE.get(),
                ModBlocks.REGENED_EMERALD_ORE.get(),
                ModBlocks.REGENED_DEEPSLATE_EMERALD_ORE.get(),
                ModBlocks.REGENED_REDSTONE_ORE.get(),
                ModBlocks.REGENED_DEEPSLATE_REDSTONE_ORE.get()
        );

    }
}
