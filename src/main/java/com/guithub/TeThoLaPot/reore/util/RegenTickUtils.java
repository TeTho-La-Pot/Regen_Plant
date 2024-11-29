package com.guithub.TeThoLaPot.reore.util;

import com.guithub.TeThoLaPot.reore.tag.RegenTags;
import com.mojang.datafixers.types.templates.Tag;
import net.minecraft.world.level.block.state.BlockState;

import java.util.*;

public class RegenTickUtils {

    public static boolean isCanRegen(BlockState state){
        return state.is(RegenTags.Blocks.CAN_REGEN);
    }

    public static boolean isDoneRegen(BlockState state){
        return state.is(RegenTags.Blocks.DONE_REGEN);
    }

    public static boolean vRegen(BlockState state){
        return state.is(RegenTags.Blocks.V_REGEN);
    }
}
