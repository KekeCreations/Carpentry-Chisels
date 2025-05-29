package com.kekecreations.carpentry_and_chisels.common.item;

import com.kekecreations.carpentry_and_chisels.common.block.CarvedWoodBlock;
import com.mojang.blaze3d.platform.InputConstants;
import com.sun.jna.platform.KeyboardUtils;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.KeyboardInput;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;
import java.util.List;

public class ChiselItem extends Item {

    public static final String TAG_CHISEL_PATTERN = "ChiselPattern";

    public ChiselItem(Properties properties) {
        super(properties);
    }

    public int getPattern(ItemStack itemStack) {
        CompoundTag compoundTag = itemStack.getTag();
        if (compoundTag != null && compoundTag.contains("ChiselPattern")) {
            return compoundTag.getInt(TAG_CHISEL_PATTERN);
        } else {
            return 0;
        }
    }
    public void setPattern(ItemStack itemStack, int pattern) {
        itemStack.getOrCreateTag().putInt(TAG_CHISEL_PATTERN, pattern);
    }

    @Override
    public InteractionResult useOn(UseOnContext useOnContext) {
        Player player = useOnContext.getPlayer();
        BlockPos blockPos = useOnContext.getClickedPos();
        Level level = useOnContext.getLevel();
        BlockState blockState = level.getBlockState(blockPos);
        Block block = blockState.getBlock();
        RandomSource random = level.getRandom();
        Vec3 clickLocation = useOnContext.getClickLocation();
        ItemStack itemStack = useOnContext.getItemInHand();
        InteractionHand hand = useOnContext.getHand();

        if (!level.isClientSide() && player != null) {
            if (player.isSecondaryUseActive()) {
                if (blockState.getBlock() instanceof CarvedWoodBlock) {
                    if (getPattern(itemStack) != blockState.getValue(CarvedWoodBlock.PATTERN)) {
                        setPattern(itemStack, blockState.getValue(CarvedWoodBlock.PATTERN));
                        level.playSound(null, blockPos, SoundEvents.ANVIL_USE, SoundSource.BLOCKS, 0.8F, 0.8F);
                    }
                }
            } else {
                if (blockState.getBlock() instanceof CarvedWoodBlock) {
                    if (getPattern(itemStack) == 0) {
                        if (blockState.getValue(CarvedWoodBlock.PATTERN) != 7) {
                            level.setBlockAndUpdate(blockPos, blockState.setValue(CarvedWoodBlock.PATTERN, blockState.getValue(CarvedWoodBlock.PATTERN) + 1));
                        } else {
                            level.setBlockAndUpdate(blockPos, blockState.setValue(CarvedWoodBlock.PATTERN, 0));
                        }
                        itemStack.hurtAndBreak(1, player, (entity) -> entity.broadcastBreakEvent(hand));
                        level.playSound(null, blockPos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
                        return InteractionResult.sidedSuccess(true);
                    } else {
                        if (getPattern(itemStack) != blockState.getValue(CarvedWoodBlock.PATTERN)) {
                            level.setBlockAndUpdate(blockPos, blockState.setValue(CarvedWoodBlock.PATTERN, getPattern(itemStack)));
                            itemStack.hurtAndBreak(1, player, (entity) -> entity.broadcastBreakEvent(hand));
                            level.playSound(null, blockPos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
                            return InteractionResult.sidedSuccess(true);
                        }
                    }
                }
            }

        }
        return InteractionResult.FAIL;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        ItemStack itemStack = player.getItemInHand(usedHand);
        if (!level.isClientSide()) {
            if (player.isShiftKeyDown()) {
                if (getPattern(itemStack) != 0) {
                    setPattern(itemStack, 0);
                    level.playSound(null, player.getOnPos(), SoundEvents.ANVIL_USE, SoundSource.BLOCKS, 0.8F, 0.8F);
                }
            }
        }
        return InteractionResultHolder.fail(itemStack);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> toolTipComponents, TooltipFlag flag) {
        super.appendHoverText(itemStack, level, toolTipComponents, flag);
        if (level != null ) {
            switch (getPattern(itemStack)) {
                case 0 -> toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.pattern_0").withStyle(ChatFormatting.GRAY));
                case 1 -> toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.pattern_1").withStyle(ChatFormatting.GRAY));
                case 2 -> toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.pattern_2").withStyle(ChatFormatting.GRAY));
                case 3 -> toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.pattern_3").withStyle(ChatFormatting.GRAY));
                case 4 -> toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.pattern_4").withStyle(ChatFormatting.GRAY));
                case 5 -> toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.pattern_5").withStyle(ChatFormatting.GRAY));
                case 6 -> toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.pattern_6").withStyle(ChatFormatting.GRAY));
                case 7 -> toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.pattern_7").withStyle(ChatFormatting.GRAY));
            }
            toolTipComponents.add(Component.literal(""));
            if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), Minecraft.getInstance().options.keyShift.getDefaultKey().getValue())) {
                toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.control_1").withStyle(ChatFormatting.GRAY));
                toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.control_2").withStyle(ChatFormatting.BLUE));
                toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.control_3").withStyle(ChatFormatting.BLUE));
            } else {
                toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.show").withStyle(ChatFormatting.BLUE));
            }
        }
    }
}
