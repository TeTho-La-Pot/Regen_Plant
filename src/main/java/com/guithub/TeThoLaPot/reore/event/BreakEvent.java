package com.guithub.TeThoLaPot.reore.event;

import com.guithub.TeThoLaPot.reore.RE_Plant;
import com.guithub.TeThoLaPot.reore.init.block.ModBlocks;
import com.guithub.TeThoLaPot.reore.util.RegenCooldownUtils;
import com.guithub.TeThoLaPot.reore.util.RegenTickUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = RE_Plant.MOD_ID)
public class BreakEvent {


    @SubscribeEvent
    public static void blockBreak(BlockEvent.BreakEvent event) {

        LevelAccessor levelAccessor = event.getLevel();
        ServerLevel level = (ServerLevel) levelAccessor;
        Player player = event.getPlayer();
        ItemStack mainHand = player.getMainHandItem();
        ItemStack offHand = player.getOffhandItem();
        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);


        if (player.isCreative()) {
            if (RegenTickUtils.isCanRegen(levelAccessor.getBlockState(pos)) || RegenTickUtils.isDoneRegen(levelAccessor.getBlockState(pos))) {
                level.removeBlock(pos, false);
            }
            if (RegenCooldownUtils.vanillaRegen == true && RegenTickUtils.vRegen(levelAccessor.getBlockState(pos))){
                level.removeBlock(pos, false);
            }
        }

        if (!player.isCreative()) {
            if (offHand.isEmpty() || offHand.getTag().getInt("mode") == 0 || offHand.getTag() == null) {
                if (state.is(ModBlocks.REGENED_OAK.get()) || state.is(ModBlocks.REGEN_OAK_ENTITY.get())) {
                    if (mainHand.isCorrectToolForDrops(state)) {
                        state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                        state.getBlock().popExperience(level, pos, event.getExpToDrop());
                    }
                    level.removeBlock(pos, false);
                    level.setBlock(pos, ModBlocks.REGEN_OAK_ENTITY.get().defaultBlockState(), 3);
                    event.setCanceled(true);
                }

            } else if (offHand.getTag().getInt("mode") == 1){
                if (RegenTickUtils.isCanRegen(levelAccessor.getBlockState(pos)) || RegenTickUtils.isDoneRegen(levelAccessor.getBlockState(pos))) {
                    if (mainHand.isCorrectToolForDrops(state)) {
                        state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                        state.getBlock().popExperience(level, pos, event.getExpToDrop());
                    }
                    level.removeBlock(pos, false);
                }
                if (RegenCooldownUtils.vanillaRegen == true && RegenTickUtils.vRegen(levelAccessor.getBlockState(pos))){
                    if (mainHand.isCorrectToolForDrops(state)) {
                        state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                        state.getBlock().popExperience(level, pos, event.getExpToDrop());
                    }
                    level.removeBlock(pos, false);
                }
            }
        }
    }
}