package com.kekecreations.carpentry_and_chisels.common.block;

import com.kekecreations.carpentry_and_chisels.core.registry.CCBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class CCSlabBlock extends SlabBlock {

    public CCSlabBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getItemInHand(hand);
        if (!level.isClientSide()) {
            if (itemStack.getItem() instanceof AxeItem) {
                if(state.is(CCBlocks.OAK_LOG_SLAB.get())) {
                    level.setBlockAndUpdate(pos, CCBlocks.STRIPPED_OAK_LOG_SLAB.get().defaultBlockState().setValue(CCSlabBlock.TYPE, state.getValue(CCSlabBlock.TYPE)));
                    itemStack.hurtAndBreak(1, player, (entity) -> entity.broadcastBreakEvent(hand));
                    level.playSound(null, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
                    return InteractionResult.SUCCESS;
                }
            }
        }
        return InteractionResult.PASS;
    }
}
