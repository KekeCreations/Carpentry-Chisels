package com.kekecreations.carpentry_and_chisels.common.item;

import com.kekecreations.carpentry_and_chisels.common.block.CarvedWoodBlock;
import com.kekecreations.carpentry_and_chisels.core.registry.CCDataComponents;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ChiselItem extends Item {

    private final float attackDamage;

    public ChiselItem(float attackDamage, Properties properties) {
        super(properties.component(CCDataComponents.CHISEL_PATTERN.get(), 0));
        this.attackDamage = attackDamage;
        ItemAttributeModifiers.builder().add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID,  this.attackDamage, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).build();
    }

    public float getDamage() {
        return this.attackDamage;
    }

    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        return true;
    }

    public void postHurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.hurtAndBreak(1, attacker, EquipmentSlot.MAINHAND);
    }


    public int getPattern(ItemStack itemStack) {
        return itemStack.getOrDefault(CCDataComponents.CHISEL_PATTERN.get(), 0);
    }
    public void setPattern(ItemStack itemStack, int pattern) {
        itemStack.set(CCDataComponents.CHISEL_PATTERN.get(), pattern);
    }

    @Override
    public InteractionResult useOn(UseOnContext useOnContext) {
        Player player = useOnContext.getPlayer();
        BlockPos blockPos = useOnContext.getClickedPos();
        Level level = useOnContext.getLevel();
        BlockState blockState = level.getBlockState(blockPos);
        ItemStack itemStack = useOnContext.getItemInHand();
        InteractionHand hand = useOnContext.getHand();

        if (!level.isClientSide() && ChiselUtils.getFinalBlock(level.registryAccess(), blockState) != null) {
            level.setBlockAndUpdate(blockPos, ChiselUtils.getFinalBlock(level.registryAccess(), blockState).defaultBlockState());
            itemStack.hurtAndBreak(1, player, EquipmentSlot.MAINHAND);
            level.playSound(null, blockPos, blockState.getSoundType().getPlaceSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
            return InteractionResult.sidedSuccess(true);
        }

        if (!level.isClientSide() && player != null) {
            if (player.isSecondaryUseActive()) {
                if (blockState.getBlock() instanceof CarvedWoodBlock) {
                    if (getPattern(itemStack) != blockState.getValue(CarvedWoodBlock.PATTERN)) {
                        setPattern(itemStack, blockState.getValue(CarvedWoodBlock.PATTERN));
                        level.playSound(null, blockPos, SoundEvents.VILLAGER_WORK_FLETCHER, SoundSource.BLOCKS, 1.0F, 0.5F);
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
                        itemStack.hurtAndBreak(1, player, EquipmentSlot.MAINHAND);
                        level.playSound(null, blockPos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
                        return InteractionResult.sidedSuccess(true);
                    } else {
                        if (getPattern(itemStack) != blockState.getValue(CarvedWoodBlock.PATTERN)) {
                            level.setBlockAndUpdate(blockPos, blockState.setValue(CarvedWoodBlock.PATTERN, getPattern(itemStack)));
                            itemStack.hurtAndBreak(1, player, EquipmentSlot.MAINHAND);
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
                    level.playSound(null, player.getOnPos(), SoundEvents.VILLAGER_WORK_FLETCHER, SoundSource.BLOCKS, 1.0F, 0.5F);
                }
            }
        }
        return InteractionResultHolder.fail(itemStack);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack itemStack, TooltipContext tooltipContext, @NotNull List<Component> toolTipComponents, @NotNull TooltipFlag flag) {
        super.appendHoverText(itemStack, tooltipContext, toolTipComponents, flag);
        switch (getPattern(itemStack)) {
            case 0 ->
                    toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.pattern_0").withStyle(ChatFormatting.GRAY));
            case 1 ->
                    toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.pattern_1").withStyle(ChatFormatting.GRAY));
            case 2 ->
                    toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.pattern_2").withStyle(ChatFormatting.GRAY));
            case 3 ->
                    toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.pattern_3").withStyle(ChatFormatting.GRAY));
            case 4 ->
                    toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.pattern_4").withStyle(ChatFormatting.GRAY));
            case 5 ->
                    toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.pattern_5").withStyle(ChatFormatting.GRAY));
            case 6 ->
                    toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.pattern_6").withStyle(ChatFormatting.GRAY));
            case 7 ->
                    toolTipComponents.add(Component.translatable("tooltip.carpentry_and_chisels.pattern_7").withStyle(ChatFormatting.GRAY));
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
