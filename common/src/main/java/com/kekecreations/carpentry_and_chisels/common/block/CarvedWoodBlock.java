package com.kekecreations.carpentry_and_chisels.common.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class CarvedWoodBlock extends Block {

    public static final IntegerProperty PATTERN = IntegerProperty.create("pattern", 0, 7);


    public CarvedWoodBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(PATTERN);
        super.createBlockStateDefinition(builder);
    }
}
