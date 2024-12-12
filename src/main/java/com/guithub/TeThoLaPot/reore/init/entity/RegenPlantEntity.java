package com.guithub.TeThoLaPot.reore.init.entity;

import com.guithub.TeThoLaPot.reore.init.block.ModBlocks;
import com.guithub.TeThoLaPot.reore.util.TickaleBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import static com.guithub.TeThoLaPot.reore.util.RegenCooldownUtils.*;

public class RegenPlantEntity extends BlockEntity implements TickaleBlockEntity {
    private int ticks;


    public RegenPlantEntity(BlockPos blockPos, BlockState blockState) {
        super(BlockEntities.REGEN_PLANT_ENTITY.get(), blockPos, blockState);
    }

    @Override
    public void tick() {
        BlockState state = getBlockState();
        BlockPos pos = getBlockPos();


        if (this.level == null || this.level.isClientSide()) {
            this.level.sendBlockUpdated(this.worldPosition, getBlockState(), getBlockState(), Block.UPDATE_ALL);
            return;
        }

//追加鉱石

        if (state.is(ModBlocks.REGEN_OAK_ENTITY.get())) {
            if (this.ticks++ >= tickOak) {
                this.level.setBlock(pos, ModBlocks.REGENED_OAK.get().defaultBlockState(), 3);
            }
        }


//バニラ鉱石

//        if (state.is(ModBlocks.V_REGEN_IRON_ORE_ENTITY.get())) {
//            if (this.ticks++ >= tickIron) {
//                this.level.setBlock(pos, Blocks.IRON_ORE.defaultBlockState(), 3);
//            }
//        }
    }



    @Override
    public int ticker() {
        return ticks++;
    }



    @Nullable
    @Override
    public CompoundTag getUpdateTag() {
        CompoundTag nbt = super.getUpdateTag();
        saveAdditional(nbt);
        return nbt;
    }

    @Override
    public void handleUpdateTag(CompoundTag tag) {
        super.handleUpdateTag(tag);
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt) {
        handleUpdateTag(pkt.getTag());
    }
}

