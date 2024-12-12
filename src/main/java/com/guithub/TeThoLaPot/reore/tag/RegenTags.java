package com.guithub.TeThoLaPot.reore.tag;

import com.guithub.TeThoLaPot.reore.RE_Plant;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class RegenTags {
    public static class Blocks{
        public static final TagKey<Block> CAN_REGEN = tag("can_regen");
        public static final TagKey<Block> DONE_REGEN = tag("done_regen");
        public static final TagKey<Block> V_REGEN = tag("v_regen");


        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(RE_Plant.MOD_ID, name));
        }

    }
}
