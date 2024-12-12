package com.guithub.TeThoLaPot.reore.data.model;

import com.guithub.TeThoLaPot.reore.RE_Plant;
import com.guithub.TeThoLaPot.reore.init.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ReOreBlockStateProvider extends BlockStateProvider {
    public ReOreBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, RE_Plant.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(ModBlocks.TEST_ORE);

    }

    private void simpleBlockWithItem(RegistryObject<Block> block){
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
}
