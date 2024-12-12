package com.guithub.TeThoLaPot.reore.jade;

import com.guithub.TeThoLaPot.reore.RE_Plant;
import com.guithub.TeThoLaPot.reore.init.block.ModBlocks;
import com.guithub.TeThoLaPot.reore.util.RegenTickUtils;
import com.guithub.TeThoLaPot.reore.util.TickaleBlockEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.BlockState;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IBlockComponentProvider;
import snownee.jade.api.IServerDataProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;

import static com.guithub.TeThoLaPot.reore.util.RegenCooldownUtils.*;

public enum RegenTickComponentProvider implements IBlockComponentProvider, IServerDataProvider<BlockAccessor> {
    INSTANCE;

    @Override
    public void appendTooltip(ITooltip tooltip, BlockAccessor accessor, IPluginConfig config){
        if (RegenTickUtils.isCanRegen(accessor.getBlockState())) {
            if (accessor.getServerData().contains("Tick")) {
                tooltip.add(Component.translatable("re_ore.regen", accessor.getServerData().getInt("Tick"))
                        .append("%"));
            }
        }
    }

    @Override
    public void appendServerData(CompoundTag data, BlockAccessor accessor) {
        TickaleBlockEntity tickale = (TickaleBlockEntity) accessor.getBlockEntity();
        BlockState state = accessor.getBlockState();
        if (state.is(ModBlocks.REGEN_OAK_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickOak * tickale.ticker()));
//        }else if (state.is(ModBlocks.REGEN_DEEPSLATE_IRON_ORE_ENTITY.get())){
//            data.putInt("Tick", (int) (100 / tickDIron * tickale.ticker()));
        }
    }

    @Override
    public ResourceLocation getUid(){
        return new ResourceLocation(RE_Plant.MOD_ID, "regen_tick");
    }
}
