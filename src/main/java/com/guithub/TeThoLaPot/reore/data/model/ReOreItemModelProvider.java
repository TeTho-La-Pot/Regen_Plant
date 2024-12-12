package com.guithub.TeThoLaPot.reore.data.model;


import com.guithub.TeThoLaPot.reore.RE_Plant;
import com.guithub.TeThoLaPot.reore.item.Items;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ReOreItemModelProvider extends ItemModelProvider {
    public ReOreItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RE_Plant.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(Items.TORE.get());
    }
}