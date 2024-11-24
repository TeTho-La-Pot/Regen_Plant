package com.guithub.TeThoLaPot.reore.init.block.Emerald;

import com.guithub.TeThoLaPot.reore.init.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class RegenedEmerald extends Block{
    public RegenedEmerald(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void destroy(LevelAccessor pLevel, BlockPos pPos, BlockState pState) {
        super.destroy(pLevel, pPos, pState);
            if (!pLevel.isClientSide()) {
                pLevel.setBlock(pPos, ModBlocks.REGEN_EMERALD_ORE_ENTITY.get().defaultBlockState(), 3);
        }
    }
}
