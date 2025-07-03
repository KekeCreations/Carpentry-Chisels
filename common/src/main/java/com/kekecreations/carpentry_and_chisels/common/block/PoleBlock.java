package com.kekecreations.carpentry_and_chisels.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class PoleBlock extends Block {

    private static final VoxelShape AABB = Block.box(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);


    @Nullable
    Block strippedVariant;


    public PoleBlock(@Nullable Block strippedVariant, Properties properties) {
        super(properties);
        this.strippedVariant = strippedVariant;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return AABB;
    }

    @Override
    public ItemInteractionResult useItemOn(ItemStack itemStack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult blockHitResult) {
        if (!level.isClientSide()) {
            if (itemStack.getItem() instanceof AxeItem) {
                if (strippedVariant != null) {
                    stripAxe(level, itemStack, player, hand, pos, state, strippedVariant);
                    return ItemInteractionResult.SUCCESS;
                }
            }
        }
        return ItemInteractionResult.FAIL;
    }

    public void stripAxe(Level level, ItemStack itemStack, Player player, InteractionHand hand, BlockPos pos, BlockState state, Block strippedAxe) {
        level.setBlockAndUpdate(pos, strippedAxe.defaultBlockState());
        if (hand == InteractionHand.MAIN_HAND) {
            itemStack.hurtAndBreak(1, player, EquipmentSlot.MAINHAND);
        } else {
            itemStack.hurtAndBreak(1, player, EquipmentSlot.OFFHAND);
        }
        level.playSound(null, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
    }
}
