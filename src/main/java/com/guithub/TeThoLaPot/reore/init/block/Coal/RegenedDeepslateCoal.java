package com.guithub.TeThoLaPot.reore.init.block.Coal;

import com.guithub.TeThoLaPot.reore.init.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class RegenedDeepslateCoal extends Block{
    public RegenedDeepslateCoal(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void destroy(LevelAccessor pLevel, BlockPos pPos, BlockState pState) {
        super.destroy(pLevel, pPos, pState);
            if (!pLevel.isClientSide()) {
                pLevel.setBlock(pPos, ModBlocks.REGEN_DEEPSLATE_COAL_ORE_ENTITY.get().defaultBlockState(), 3);
        }
    }
}
