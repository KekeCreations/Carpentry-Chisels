package com.kekecreations.carpentry_and_chisels.common.block;

import com.kekecreations.carpentry_and_chisels.core.registry.CCItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;

public class CarvedWoodBlock extends Block {

    public static final IntegerProperty PATTERN = IntegerProperty.create("pattern", 0, 7);


    public CarvedWoodBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState blockState, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult blockHitResult) {
        ItemStack itemStack = player.getItemInHand(hand);
        if (!level.isClientSide()) {
            /*
            if (itemStack.is(CCItems.CHISEL.get())) {
                if (blockState.getValue(PATTERN) != 7) {
                    level.setBlockAndUpdate(pos, blockState.setValue(PATTERN, blockState.getValue(PATTERN) + 1));
                } else {
                    level.setBlockAndUpdate(pos, blockState.setValue(PATTERN, 0));
                }
                itemStack.hurtAndBreak(1, player, (entity) -> entity.broadcastBreakEvent(hand));
                level.playSound(null, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
                return InteractionResult.sidedSuccess(true);
            }

             */
        }
        return InteractionResult.FAIL;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(PATTERN);
        super.createBlockStateDefinition(builder);
    }
}
