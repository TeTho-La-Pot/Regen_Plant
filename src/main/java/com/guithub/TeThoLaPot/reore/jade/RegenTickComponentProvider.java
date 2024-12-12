package com.guithub.TeThoLaPot.reore.jade;

import com.guithub.TeThoLaPot.reore.RE_Ore;
import com.guithub.TeThoLaPot.reore.init.block.ModBlocks;
import com.guithub.TeThoLaPot.reore.init.entity.RegenOreEntity;
import com.guithub.TeThoLaPot.reore.util.RegenCooldownUtils;
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
        if (state.is(ModBlocks.REGEN_IRON_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickIron * tickale.ticker()));
        }else if (state.is(ModBlocks.REGEN_DEEPSLATE_IRON_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickDIron * tickale.ticker()));
        }else if (state.is(ModBlocks.REGEN_COPPER_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickCopper * tickale.ticker()));
        }else if (state.is(ModBlocks.REGEN_DEEPSLATE_COPPER_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickDCopper * tickale.ticker()));
        }else if (state.is(ModBlocks.REGEN_GOLD_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickGold * tickale.ticker()));
        }else if (state.is(ModBlocks.REGEN_DEEPSLATE_GOLD_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickDGold * tickale.ticker()));
        }else if (state.is(ModBlocks.REGEN_NETHER_GOLD_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickNGold * tickale.ticker()));
        }else if (state.is(ModBlocks.REGEN_DIAMOND_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickDiamond * tickale.ticker()));
        }else if (state.is(ModBlocks.REGEN_DEEPSLATE_DIAMOND_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickDDiamond * tickale.ticker()));
        }else if (state.is(ModBlocks.REGEN_EMERALD_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickEmerald * tickale.ticker()));
        }else if (state.is(ModBlocks.REGEN_DEEPSLATE_EMERALD_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickDEmerald * tickale.ticker()));
        }else if (state.is(ModBlocks.REGEN_COAL_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickCoal * tickale.ticker()));
        }else if (state.is(ModBlocks.REGEN_DEEPSLATE_COAL_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickDCoal * tickale.ticker()));
        }else if (state.is(ModBlocks.REGEN_LAPIS_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickLapis * tickale.ticker()));
        }else if (state.is(ModBlocks.REGEN_DEEPSLATE_LAPIS_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickDLapis * tickale.ticker()));
        }else if (state.is(ModBlocks.REGEN_REDSTONE_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickRedstone * tickale.ticker()));
        }else if (state.is(ModBlocks.REGEN_DEEPSLATE_REDSTONE_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickDRedstone * tickale.ticker()));
        }else if (state.is(ModBlocks.REGEN_NETHER_QUARTZ_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickNQuartz * tickale.ticker()));
        }else if (state.is(ModBlocks.V_REGEN_IRON_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickIron * tickale.ticker()));
        }else if (state.is(ModBlocks.V_REGEN_DEEPSLATE_IRON_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickDIron * tickale.ticker()));
        }else if (state.is(ModBlocks.V_REGEN_COPPER_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickCopper * tickale.ticker()));
        }else if (state.is(ModBlocks.V_REGEN_DEEPSLATE_COPPER_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickDCopper * tickale.ticker()));
        }else if (state.is(ModBlocks.V_REGEN_GOLD_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickGold * tickale.ticker()));
        }else if (state.is(ModBlocks.V_REGEN_DEEPSLATE_GOLD_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickDGold * tickale.ticker()));
        }else if (state.is(ModBlocks.V_REGEN_NETHER_GOLD_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickNGold * tickale.ticker()));
        }else if (state.is(ModBlocks.V_REGEN_DIAMOND_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickDiamond * tickale.ticker()));
        }else if (state.is(ModBlocks.V_REGEN_DEEPSLATE_DIAMOND_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickDDiamond * tickale.ticker()));
        }else if (state.is(ModBlocks.V_REGEN_EMERALD_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickEmerald * tickale.ticker()));
        }else if (state.is(ModBlocks.V_REGEN_DEEPSLATE_EMERALD_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickDEmerald * tickale.ticker()));
        }else if (state.is(ModBlocks.V_REGEN_COAL_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickCoal * tickale.ticker()));
        }else if (state.is(ModBlocks.V_REGEN_DEEPSLATE_COAL_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickDCoal * tickale.ticker()));
        }else if (state.is(ModBlocks.V_REGEN_LAPIS_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickLapis * tickale.ticker()));
        }else if (state.is(ModBlocks.V_REGEN_DEEPSLATE_LAPIS_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickDLapis * tickale.ticker()));
        }else if (state.is(ModBlocks.V_REGEN_REDSTONE_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickRedstone * tickale.ticker()));
        }else if (state.is(ModBlocks.V_REGEN_DEEPSLATE_REDSTONE_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickDRedstone * tickale.ticker()));
        }else if (state.is(ModBlocks.V_REGEN_NETHER_QUARTZ_ORE_ENTITY.get())) {
            data.putInt("Tick", (int) (100 / tickNQuartz * tickale.ticker()));
        }else if (state.is(ModBlocks.CREATE_ZINC_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickZinc * tickale.ticker()));
        }else if (state.is(ModBlocks.CREATE_DEEPSLATE_ZINC_ORE_ENTITY.get())) {
            data.putInt("Tick", (int) (100 / tickDZinc * tickale.ticker()));
        }else if (state.is(ModBlocks.MEKANISM_TIN_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickTin * tickale.ticker()));
        }else if (state.is(ModBlocks.MEKANISM_DEEPSLATE_TIN_ORE_ENTITY.get())) {
            data.putInt("Tick", (int) (100 / tickDTin * tickale.ticker()));
        }else if (state.is(ModBlocks.MEKANISM_OSUMIUM_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickOsumium * tickale.ticker()));
        }else if (state.is(ModBlocks.MEKANISM_DEEPSLATE_OSUMIUM_ORE_ENTITY.get())) {
            data.putInt("Tick", (int) (100 / tickDOsumium * tickale.ticker()));
        }else if (state.is(ModBlocks.MEKANISM_URANIUM_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickUranium * tickale.ticker()));
        }else if (state.is(ModBlocks.MEKANISM_DEEPSLATE_URANIUM_ORE_ENTITY.get())) {
            data.putInt("Tick", (int) (100 / tickDUranium * tickale.ticker()));
        }else if (state.is(ModBlocks.MEKANISM_FLUORITE_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickFluorite * tickale.ticker()));
        }else if (state.is(ModBlocks.MEKANISM_DEEPSLATE_FLUORITE_ORE_ENTITY.get())) {
            data.putInt("Tick", (int) (100 / tickDFluorite * tickale.ticker()));
        }else if (state.is(ModBlocks.MEKANISM_LEAD_ORE_ENTITY.get())){
            data.putInt("Tick", (int) (100 / tickLead * tickale.ticker()));
        }else if (state.is(ModBlocks.MEKANISM_DEEPSLATE_LEAD_ORE_ENTITY.get())) {
            data.putInt("Tick", (int) (100 / tickDLead * tickale.ticker()));
        }
    }

    @Override
    public ResourceLocation getUid(){
        return new ResourceLocation(RE_Ore.MOD_ID, "regen_tick");
    }
}
