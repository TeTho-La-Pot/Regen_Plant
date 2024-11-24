package com.guithub.TeThoLaPot.reore.init.entity;

import com.guithub.TeThoLaPot.reore.config.RegenOreCommonConfig;
import com.guithub.TeThoLaPot.reore.init.block.ModBlocks;
import com.guithub.TeThoLaPot.reore.init.entity.util.TickaleBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class RegenOreEntity extends BlockEntity implements TickaleBlockEntity {
    private int ticks;

    public RegenOreEntity(BlockPos blockPos, BlockState blockState) {
        super(BlockEntities.REGEN_ORE_ENTITY.get(), blockPos, blockState);
    }

    @Override
    public void tick() {
        BlockState state = getBlockState();

            int x = worldPosition.getX();
            int y = worldPosition.getY();
            int z = worldPosition.getZ();

        if (this.level == null || this.level.isClientSide()) {
            return;
        }

        if (state.is(ModBlocks.REGEN_IRON_ORE_ENTITY.get())) {
            if (this.ticks++ == RegenOreCommonConfig.IRON_ORE_REGEN_TICK.get()) {
                this.level.removeBlock(new BlockPos(x, y, z), false);
                this.level.setBlock(new BlockPos(x, y, z), ModBlocks.REGENED_IRON_ORE.get().defaultBlockState(), 3);
            }
        }else if(state.is(ModBlocks.REGEN_DEEPSLATE_IRON_ORE_ENTITY.get())) {
            if (this.ticks++ == RegenOreCommonConfig.DEEPSLATE_IRON_ORE_REGEN_TICK.get()) {
                this.level.removeBlock(new BlockPos(x, y, z), false);
                this.level.setBlock(new BlockPos(x, y, z), ModBlocks.REGENED_DEEPSLATE_IRON_ORE.get().defaultBlockState(), 3);
            }
        }else if (state.is(ModBlocks.REGEN_COPPER_ORE_ENTITY.get())) {
            if (this.ticks++ == RegenOreCommonConfig.COPPER_ORE_REGEN_TICK.get()) {
                this.level.removeBlock(new BlockPos(x, y, z), false);
                this.level.setBlock(new BlockPos(x, y, z), ModBlocks.REGENED_COPPER_ORE.get().defaultBlockState(), 3);
            }
        }else if(state.is(ModBlocks.REGEN_DEEPSLATE_COPPER_ORE_ENTITY.get())) {
            if (this.ticks++ == RegenOreCommonConfig.DEEPSLATE_COPPER_ORE_REGEN_TICK.get()) {
                this.level.removeBlock(new BlockPos(x, y, z), false);
                this.level.setBlock(new BlockPos(x, y, z), ModBlocks.REGENED_DEEPSLATE_COPPER_ORE.get().defaultBlockState(), 3);
            }
        }else if (state.is(ModBlocks.REGEN_GOLD_ORE_ENTITY.get())) {
            if (this.ticks++ == RegenOreCommonConfig.GOLD_ORE_REGEN_TICK.get()) {
                this.level.removeBlock(new BlockPos(x, y, z), false);
                this.level.setBlock(new BlockPos(x, y, z), ModBlocks.REGENED_GOLD_ORE.get().defaultBlockState(), 3);
            }
        }else if(state.is(ModBlocks.REGEN_DEEPSLATE_GOLD_ORE_ENTITY.get())) {
            if (this.ticks++ == RegenOreCommonConfig.DEEPSLATE_GOLD_ORE_REGEN_TICK.get()) {
                this.level.removeBlock(new BlockPos(x, y, z), false);
                this.level.setBlock(new BlockPos(x, y, z), ModBlocks.REGENED_DEEPSLATE_GOLD_ORE.get().defaultBlockState(), 3);
            }
        }else if (state.is(ModBlocks.REGEN_NETHER_GOLD_ORE_ENTITY.get())) {
            if (this.ticks++ == RegenOreCommonConfig.NETHER_GOLD_ORE_REGEN_TICK.get()) {
                this.level.removeBlock(new BlockPos(x, y, z), false);
                this.level.setBlock(new BlockPos(x, y, z), ModBlocks.REGENED_NETHER_GOLD_ORE.get().defaultBlockState(), 3);
            }
        }else if (state.is(ModBlocks.REGEN_DIAMOND_ORE_ENTITY.get())) {
            if (this.ticks++ == RegenOreCommonConfig.DIAMOND_ORE_REGEN_TICK.get()) {
                this.level.removeBlock(new BlockPos(x, y, z), false);
                this.level.setBlock(new BlockPos(x, y, z), ModBlocks.REGENED_DIAMOND_ORE.get().defaultBlockState(), 3);
            }
        }else if(state.is(ModBlocks.REGEN_DEEPSLATE_DIAMOND_ORE_ENTITY.get())) {
            if (this.ticks++ == RegenOreCommonConfig.DEEPSLATE_DIAMOND_ORE_REGEN_TICK.get()) {
                this.level.removeBlock(new BlockPos(x, y, z), false);
                this.level.setBlock(new BlockPos(x, y, z), ModBlocks.REGENED_DEEPSLATE_DIAMOND_ORE.get().defaultBlockState(), 3);
            }
        }else if (state.is(ModBlocks.REGEN_EMERALD_ORE_ENTITY.get())) {
            if (this.ticks++ == RegenOreCommonConfig.EMERALD_ORE_REGEN_TICK.get()) {
                this.level.removeBlock(new BlockPos(x, y, z), false);
                this.level.setBlock(new BlockPos(x, y, z), ModBlocks.REGENED_EMERALD_ORE.get().defaultBlockState(), 3);
            }
        }else if(state.is(ModBlocks.REGEN_DEEPSLATE_EMERALD_ORE_ENTITY.get())) {
            if (this.ticks++ == RegenOreCommonConfig.DEEPSLATE_EMERALD_ORE_REGEN_TICK.get()) {
                this.level.removeBlock(new BlockPos(x, y, z), false);
                this.level.setBlock(new BlockPos(x, y, z), ModBlocks.REGENED_DEEPSLATE_EMERALD_ORE.get().defaultBlockState(), 3);
            }
        }else if (state.is(ModBlocks.REGEN_COAL_ORE_ENTITY.get())) {
            if (this.ticks++ == RegenOreCommonConfig.COAL_ORE_REGEN_TICK.get()) {
                this.level.removeBlock(new BlockPos(x, y, z), false);
                this.level.setBlock(new BlockPos(x, y, z), ModBlocks.REGENED_COAL_ORE.get().defaultBlockState(), 3);
            }
        }else if(state.is(ModBlocks.REGEN_DEEPSLATE_COAL_ORE_ENTITY.get())) {
            if (this.ticks++ == RegenOreCommonConfig.DEEPSLATE_COAL_ORE_REGEN_TICK.get()) {
                this.level.removeBlock(new BlockPos(x, y, z), false);
                this.level.setBlock(new BlockPos(x, y, z), ModBlocks.REGENED_DEEPSLATE_COAL_ORE.get().defaultBlockState(), 3);
            }
        }else if (state.is(ModBlocks.REGEN_LAPIS_ORE_ENTITY.get())) {
            if (this.ticks++ == RegenOreCommonConfig.LAPIS_ORE_REGEN_TICK.get()) {
                this.level.removeBlock(new BlockPos(x, y, z), false);
                this.level.setBlock(new BlockPos(x, y, z), ModBlocks.REGENED_LAPIS_ORE.get().defaultBlockState(), 3);
            }
        }else if(state.is(ModBlocks.REGEN_DEEPSLATE_LAPIS_ORE_ENTITY.get())) {
            if (this.ticks++ == RegenOreCommonConfig.DEEPSLATE_LAPIS_ORE_REGEN_TICK.get()) {
                this.level.removeBlock(new BlockPos(x, y, z), false);
                this.level.setBlock(new BlockPos(x, y, z), ModBlocks.REGENED_DEEPSLATE_LAPIS_ORE.get().defaultBlockState(), 3);
            }
        }else if (state.is(ModBlocks.REGEN_REDSTONE_ORE_ENTITY.get())) {
            if (this.ticks++ == RegenOreCommonConfig.REDSTONE_ORE_REGEN_TICK.get()) {
                this.level.removeBlock(new BlockPos(x, y, z), false);
                this.level.setBlock(new BlockPos(x, y, z), ModBlocks.REGENED_REDSTONE_ORE.get().defaultBlockState(), 3);
            }
        }else if(state.is(ModBlocks.REGEN_DEEPSLATE_REDSTONE_ORE_ENTITY.get())) {
            if (this.ticks++ == RegenOreCommonConfig.DEEPSLATE_REDSTONE_ORE_REGEN_TICK.get()) {
                this.level.removeBlock(new BlockPos(x, y, z), false);
                this.level.setBlock(new BlockPos(x, y, z), ModBlocks.REGENED_DEEPSLATE_REDSTONE_ORE.get().defaultBlockState(), 3);
            }
        }else if (state.is(ModBlocks.REGEN_NETHER_QUARTZ_ORE_ENTITY.get())) {
            if (this.ticks++ == RegenOreCommonConfig.NETHER_QUARTZ_ORE_REGEN_TICK.get()) {
                this.level.removeBlock(new BlockPos(x, y, z), false);
                this.level.setBlock(new BlockPos(x, y, z), ModBlocks.REGENED_NETHER_QUARTZ_ORE.get().defaultBlockState(), 3);
            }
        }
    }
}

