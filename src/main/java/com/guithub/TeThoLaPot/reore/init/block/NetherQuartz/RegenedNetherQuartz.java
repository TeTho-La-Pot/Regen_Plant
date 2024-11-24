package com.guithub.TeThoLaPot.reore.init.block.NetherQuartz;

import com.guithub.TeThoLaPot.reore.init.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class RegenedNetherQuartz extends Block{
    public RegenedNetherQuartz(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void destroy(LevelAccessor pLevel, BlockPos pPos, BlockState pState) {
        super.destroy(pLevel, pPos, pState);
            if (!pLevel.isClientSide()) {
                pLevel.setBlock(pPos, ModBlocks.REGEN_NETHER_QUARTZ_ORE_ENTITY.get().defaultBlockState(), 3);
        }
    }
}
