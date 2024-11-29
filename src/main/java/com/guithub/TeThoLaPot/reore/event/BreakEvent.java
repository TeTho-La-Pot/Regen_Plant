package com.guithub.TeThoLaPot.reore.event;

import com.guithub.TeThoLaPot.reore.RE_Ore;
import com.guithub.TeThoLaPot.reore.init.block.ModBlocks;
import com.guithub.TeThoLaPot.reore.util.RegenCooldownUtils;
import com.guithub.TeThoLaPot.reore.util.RegenTickUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RE_Ore.MOD_ID)
public class BreakEvent {


    @SubscribeEvent
    public static void blockBreak(BlockEvent.BreakEvent event) {

        LevelAccessor levelAccessor = event.getLevel();
        ServerLevel level = (ServerLevel) levelAccessor;
        Player player = event.getPlayer();
        ItemStack mainHand = player.getMainHandItem();
        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);

        if (player.isCreative()) {
            if (RegenTickUtils.isCanRegen(levelAccessor.getBlockState(pos)) || RegenTickUtils.isDoneRegen(levelAccessor.getBlockState(pos))) {
                level.removeBlock(pos, false);
            }
            if (RegenCooldownUtils.vanillaRegen == true || RegenTickUtils.vRegen(levelAccessor.getBlockState(pos))){
                level.removeBlock(pos, false);
            }
        }

        if (!player.isCreative()) {
            if (state.is(ModBlocks.REGENED_COAL_ORE.get()) || state.is(ModBlocks.REGEN_COAL_ORE_ENTITY.get())) {
                state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                level.removeBlock(pos, false);
                level.setBlock(pos, ModBlocks.REGEN_COAL_ORE_ENTITY.get().defaultBlockState(), 3);
                state.getBlock().popExperience(level, pos, event.getExpToDrop());
                event.setCanceled(true);
            }
            if (state.is(ModBlocks.REGENED_DEEPSLATE_COAL_ORE.get()) || state.is(ModBlocks.REGEN_DEEPSLATE_COAL_ORE_ENTITY.get())) {
                state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                level.removeBlock(pos, false);
                level.setBlock(pos, ModBlocks.REGEN_DEEPSLATE_COAL_ORE_ENTITY.get().defaultBlockState(), 3);
                state.getBlock().popExperience(level, pos, event.getExpToDrop());
                event.setCanceled(true);
            }
            if (state.is(ModBlocks.REGENED_IRON_ORE.get()) || state.is(ModBlocks.REGEN_IRON_ORE_ENTITY.get())) {
                state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                level.removeBlock(pos, false);
                level.setBlock(pos, ModBlocks.REGEN_IRON_ORE_ENTITY.get().defaultBlockState(), 3);
                event.setCanceled(true);
            }
            if (state.is(ModBlocks.REGENED_DEEPSLATE_IRON_ORE.get()) || state.is(ModBlocks.REGEN_DEEPSLATE_IRON_ORE_ENTITY.get())) {
                state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                level.removeBlock(pos, false);
                level.setBlock(pos, ModBlocks.REGEN_DEEPSLATE_IRON_ORE_ENTITY.get().defaultBlockState(), 3);
                event.setCanceled(true);
            }
            if (state.is(ModBlocks.REGENED_COPPER_ORE.get()) || state.is(ModBlocks.REGEN_COPPER_ORE_ENTITY.get())) {
                state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                level.removeBlock(pos, false);
                level.setBlock(pos, ModBlocks.REGEN_COPPER_ORE_ENTITY.get().defaultBlockState(), 3);
                event.setCanceled(true);
            }
            if (state.is(ModBlocks.REGENED_DEEPSLATE_COPPER_ORE.get()) || state.is(ModBlocks.REGEN_DEEPSLATE_COPPER_ORE_ENTITY.get())) {
                state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                level.removeBlock(pos, false);
                level.setBlock(pos, ModBlocks.REGEN_DEEPSLATE_COAL_ORE_ENTITY.get().defaultBlockState(), 3);
                event.setCanceled(true);
            }
            if (state.is(ModBlocks.REGENED_GOLD_ORE.get()) || state.is(ModBlocks.REGEN_GOLD_ORE_ENTITY.get())) {
                state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                level.removeBlock(pos, false);
                level.setBlock(pos, ModBlocks.REGEN_GOLD_ORE_ENTITY.get().defaultBlockState(), 3);
                event.setCanceled(true);
            }
            if (state.is(ModBlocks.REGENED_DEEPSLATE_GOLD_ORE.get()) || state.is(ModBlocks.REGEN_DEEPSLATE_GOLD_ORE_ENTITY.get())) {
                state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                level.removeBlock(pos, false);
                level.setBlock(pos, ModBlocks.REGEN_DEEPSLATE_GOLD_ORE_ENTITY.get().defaultBlockState(), 3);
                event.setCanceled(true);
            }
            if (state.is(ModBlocks.REGENED_NETHER_GOLD_ORE.get()) || state.is(ModBlocks.REGEN_NETHER_GOLD_ORE_ENTITY.get())) {
                state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                level.removeBlock(pos, false);
                level.setBlock(pos, ModBlocks.REGEN_NETHER_GOLD_ORE_ENTITY.get().defaultBlockState(), 3);
                event.setCanceled(true);
            }
            if (state.is(ModBlocks.REGENED_DIAMOND_ORE.get()) || state.is(ModBlocks.REGEN_DIAMOND_ORE_ENTITY.get())) {
                state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                level.removeBlock(pos, false);
                level.setBlock(pos, ModBlocks.REGEN_DIAMOND_ORE_ENTITY.get().defaultBlockState(), 3);
                state.getBlock().popExperience(level, pos, event.getExpToDrop());
                event.setCanceled(true);
            }
            if (state.is(ModBlocks.REGENED_DEEPSLATE_DIAMOND_ORE.get()) || state.is(ModBlocks.REGEN_DEEPSLATE_DIAMOND_ORE_ENTITY.get())) {
                state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                level.removeBlock(pos, false);
                level.setBlock(pos, ModBlocks.REGEN_DEEPSLATE_DIAMOND_ORE_ENTITY.get().defaultBlockState(), 3);
                state.getBlock().popExperience(level, pos, event.getExpToDrop());
                event.setCanceled(true);
            }
            if (state.is(ModBlocks.REGENED_EMERALD_ORE.get()) || state.is(ModBlocks.REGEN_EMERALD_ORE_ENTITY.get())) {
                state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                level.removeBlock(pos, false);
                level.setBlock(pos, ModBlocks.REGEN_EMERALD_ORE_ENTITY.get().defaultBlockState(), 3);
                state.getBlock().popExperience(level, pos, event.getExpToDrop());
                event.setCanceled(true);
            }
            if (state.is(ModBlocks.REGENED_DEEPSLATE_EMERALD_ORE.get()) || state.is(ModBlocks.REGEN_DEEPSLATE_EMERALD_ORE_ENTITY.get())) {
                state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                level.removeBlock(pos, false);
                level.setBlock(pos, ModBlocks.REGEN_DEEPSLATE_EMERALD_ORE_ENTITY.get().defaultBlockState(), 3);
                state.getBlock().popExperience(level, pos, event.getExpToDrop());
                event.setCanceled(true);
            }
            if (state.is(ModBlocks.REGENED_REDSTONE_ORE.get()) || state.is(ModBlocks.REGEN_REDSTONE_ORE_ENTITY.get())) {
                state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                level.removeBlock(pos, false);
                level.setBlock(pos, ModBlocks.REGEN_REDSTONE_ORE_ENTITY.get().defaultBlockState(), 3);
                state.getBlock().popExperience(level, pos, event.getExpToDrop());
                event.setCanceled(true);
            }
            if (state.is(ModBlocks.REGENED_DEEPSLATE_REDSTONE_ORE.get()) || state.is(ModBlocks.REGEN_DEEPSLATE_REDSTONE_ORE_ENTITY.get())) {
                state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                level.removeBlock(pos, false);
                level.setBlock(pos, ModBlocks.REGEN_DEEPSLATE_REDSTONE_ORE_ENTITY.get().defaultBlockState(), 3);
                state.getBlock().popExperience(level, pos, event.getExpToDrop());
                event.setCanceled(true);
            }
            if (state.is(ModBlocks.REGENED_LAPIS_ORE.get()) || state.is(ModBlocks.REGEN_LAPIS_ORE_ENTITY.get())) {
                state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                level.removeBlock(pos, false);
                level.setBlock(pos, ModBlocks.REGEN_LAPIS_ORE_ENTITY.get().defaultBlockState(), 3);
                state.getBlock().popExperience(level, pos, event.getExpToDrop());
                event.setCanceled(true);
            }
            if (state.is(ModBlocks.REGENED_DEEPSLATE_LAPIS_ORE.get()) || state.is(ModBlocks.REGEN_DEEPSLATE_LAPIS_ORE_ENTITY.get())) {
                state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                level.removeBlock(pos, false);
                level.setBlock(pos, ModBlocks.REGEN_DEEPSLATE_LAPIS_ORE_ENTITY.get().defaultBlockState(), 3);
                state.getBlock().popExperience(level, pos, event.getExpToDrop());
                event.setCanceled(true);
            }
            if (state.is(ModBlocks.REGENED_NETHER_QUARTZ_ORE.get()) || state.is(ModBlocks.REGEN_NETHER_QUARTZ_ORE_ENTITY.get())) {
                state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                level.removeBlock(pos, false);
                level.setBlock(pos, ModBlocks.REGEN_NETHER_QUARTZ_ORE_ENTITY.get().defaultBlockState(), 3);
                state.getBlock().popExperience(level, pos, event.getExpToDrop());
                event.setCanceled(true);
            }

            if (RegenCooldownUtils.vanillaRegen == true) {
                if (state.is(Blocks.COAL_ORE) || state.is(ModBlocks.V_REGEN_COAL_ORE_ENTITY.get())) {
                    state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                    level.removeBlock(pos, false);
                    level.setBlock(pos, ModBlocks.V_REGEN_COAL_ORE_ENTITY.get().defaultBlockState(), 3);
                    state.getBlock().popExperience(level, pos, event.getExpToDrop());
                    event.setCanceled(true);
                }
                if (state.is(Blocks.DEEPSLATE_COAL_ORE) || state.is(ModBlocks.V_REGEN_DEEPSLATE_COAL_ORE_ENTITY.get())) {
                    state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                    level.removeBlock(pos, false);
                    level.setBlock(pos, ModBlocks.V_REGEN_DEEPSLATE_COAL_ORE_ENTITY.get().defaultBlockState(), 3);
                    state.getBlock().popExperience(level, pos, event.getExpToDrop());
                    event.setCanceled(true);
                }
                if (state.is(Blocks.IRON_ORE) || state.is(ModBlocks.V_REGEN_IRON_ORE_ENTITY.get())) {
                    state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                    level.removeBlock(pos, false);
                    level.setBlock(pos, ModBlocks.V_REGEN_IRON_ORE_ENTITY.get().defaultBlockState(), 3);
                    event.setCanceled(true);
                }
                if (state.is(Blocks.DEEPSLATE_IRON_ORE) || state.is(ModBlocks.V_REGEN_DEEPSLATE_IRON_ORE_ENTITY.get())) {
                    state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                    level.removeBlock(pos, false);
                    level.setBlock(pos, ModBlocks.V_REGEN_DEEPSLATE_IRON_ORE_ENTITY.get().defaultBlockState(), 3);
                    event.setCanceled(true);
                }
                if (state.is(Blocks.COPPER_ORE) || state.is(ModBlocks.V_REGEN_COPPER_ORE_ENTITY.get())) {
                    state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                    level.removeBlock(pos, false);
                    level.setBlock(pos, ModBlocks.V_REGEN_COPPER_ORE_ENTITY.get().defaultBlockState(), 3);
                    event.setCanceled(true);
                }
                if (state.is(Blocks.DEEPSLATE_COPPER_ORE) || state.is(ModBlocks.V_REGEN_DEEPSLATE_COPPER_ORE_ENTITY.get())) {
                    state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                    level.removeBlock(pos, false);
                    level.setBlock(pos, ModBlocks.V_REGEN_DEEPSLATE_COPPER_ORE_ENTITY.get().defaultBlockState(), 3);
                    event.setCanceled(true);
                }
                if (state.is(Blocks.GOLD_ORE) || state.is(ModBlocks.V_REGEN_GOLD_ORE_ENTITY.get())) {
                    state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                    level.removeBlock(pos, false);
                    level.setBlock(pos, ModBlocks.V_REGEN_GOLD_ORE_ENTITY.get().defaultBlockState(), 3);
                    event.setCanceled(true);
                }
                if (state.is(Blocks.DEEPSLATE_GOLD_ORE) || state.is(ModBlocks.V_REGEN_DEEPSLATE_GOLD_ORE_ENTITY.get())) {
                    state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                    level.removeBlock(pos, false);
                    level.setBlock(pos, ModBlocks.V_REGEN_DEEPSLATE_GOLD_ORE_ENTITY.get().defaultBlockState(), 3);
                    event.setCanceled(true);
                }
                if (state.is(Blocks.NETHER_GOLD_ORE) || state.is(ModBlocks.V_REGEN_NETHER_GOLD_ORE_ENTITY.get())) {
                    state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                    level.removeBlock(pos, false);
                    level.setBlock(pos, ModBlocks.V_REGEN_NETHER_GOLD_ORE_ENTITY.get().defaultBlockState(), 3);
                    event.setCanceled(true);
                }
                if (state.is(Blocks.DIAMOND_ORE) || state.is(ModBlocks.V_REGEN_DIAMOND_ORE_ENTITY.get())) {
                    state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                    level.removeBlock(pos, false);
                    level.setBlock(pos, ModBlocks.V_REGEN_DIAMOND_ORE_ENTITY.get().defaultBlockState(), 3);
                    state.getBlock().popExperience(level, pos, event.getExpToDrop());
                    event.setCanceled(true);
                }
                if (state.is(Blocks.DEEPSLATE_DIAMOND_ORE) || state.is(ModBlocks.V_REGEN_DEEPSLATE_DIAMOND_ORE_ENTITY.get())) {
                    state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                    level.removeBlock(pos, false);
                    level.setBlock(pos, ModBlocks.V_REGEN_DEEPSLATE_DIAMOND_ORE_ENTITY.get().defaultBlockState(), 3);
                    state.getBlock().popExperience(level, pos, event.getExpToDrop());
                    event.setCanceled(true);
                }
                if (state.is(Blocks.EMERALD_ORE) || state.is(ModBlocks.V_REGEN_EMERALD_ORE_ENTITY.get())) {
                    state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                    level.removeBlock(pos, false);
                    level.setBlock(pos, ModBlocks.V_REGEN_EMERALD_ORE_ENTITY.get().defaultBlockState(), 3);
                    state.getBlock().popExperience(level, pos, event.getExpToDrop());
                    event.setCanceled(true);
                }
                if (state.is(Blocks.DEEPSLATE_EMERALD_ORE) || state.is(ModBlocks.V_REGEN_DEEPSLATE_EMERALD_ORE_ENTITY.get())) {
                    state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                    level.removeBlock(pos, false);
                    level.setBlock(pos, ModBlocks.V_REGEN_DEEPSLATE_EMERALD_ORE_ENTITY.get().defaultBlockState(), 3);
                    state.getBlock().popExperience(level, pos, event.getExpToDrop());
                    event.setCanceled(true);
                }
                if (state.is(Blocks.REDSTONE_ORE) || state.is(ModBlocks.V_REGEN_REDSTONE_ORE_ENTITY.get())) {
                    state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                    level.removeBlock(pos, false);
                    level.setBlock(pos, ModBlocks.V_REGEN_REDSTONE_ORE_ENTITY.get().defaultBlockState(), 3);
                    state.getBlock().popExperience(level, pos, event.getExpToDrop());
                    event.setCanceled(true);
                }
                if (state.is(Blocks.DEEPSLATE_REDSTONE_ORE) || state.is(ModBlocks.V_REGEN_DEEPSLATE_REDSTONE_ORE_ENTITY.get())) {
                    state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                    level.removeBlock(pos, false);
                    level.setBlock(pos, ModBlocks.V_REGEN_DEEPSLATE_REDSTONE_ORE_ENTITY.get().defaultBlockState(), 3);
                    state.getBlock().popExperience(level, pos, event.getExpToDrop());
                    event.setCanceled(true);
                }
                if (state.is(Blocks.LAPIS_ORE) || state.is(ModBlocks.V_REGEN_LAPIS_ORE_ENTITY.get())) {
                    state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                    level.removeBlock(pos, false);
                    level.setBlock(pos, ModBlocks.V_REGEN_LAPIS_ORE_ENTITY.get().defaultBlockState(), 3);
                    state.getBlock().popExperience(level, pos, event.getExpToDrop());
                    event.setCanceled(true);
                }
                if (state.is(Blocks.DEEPSLATE_LAPIS_ORE) || state.is(ModBlocks.V_REGEN_DEEPSLATE_LAPIS_ORE_ENTITY.get())) {
                    state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                    level.removeBlock(pos, false);
                    level.setBlock(pos, ModBlocks.V_REGEN_DEEPSLATE_LAPIS_ORE_ENTITY.get().defaultBlockState(), 3);
                    state.getBlock().popExperience(level, pos, event.getExpToDrop());
                    event.setCanceled(true);
                }
                if (state.is(Blocks.NETHER_QUARTZ_ORE) || state.is(ModBlocks.V_REGEN_NETHER_QUARTZ_ORE_ENTITY.get())) {
                    state.getBlock().playerDestroy(player.level(), player, pos, state, null, mainHand);
                    level.removeBlock(pos, false);
                    level.setBlock(pos, ModBlocks.V_REGEN_NETHER_QUARTZ_ORE_ENTITY.get().defaultBlockState(), 3);
                    state.getBlock().popExperience(level, pos, event.getExpToDrop());
                    event.setCanceled(true);
                }
            }
        }
    }
}