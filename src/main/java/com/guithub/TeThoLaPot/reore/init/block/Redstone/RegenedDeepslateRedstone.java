package com.guithub.TeThoLaPot.reore.init.block.Redstone;

import com.guithub.TeThoLaPot.reore.init.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.state.BlockState;

public class RegenedDeepslateRedstone extends RedStoneOreBlock {
    public RegenedDeepslateRedstone(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void destroy(LevelAccessor pLevel, BlockPos pPos, BlockState pState) {
        super.destroy(pLevel, pPos, pState);
            if (!pLevel.isClientSide()) {
                pLevel.setBlock(pPos, ModBlocks.REGEN_DEEPSLATE_REDSTONE_ORE_ENTITY.get().defaultBlockState(), 3);
        }
    }
}
