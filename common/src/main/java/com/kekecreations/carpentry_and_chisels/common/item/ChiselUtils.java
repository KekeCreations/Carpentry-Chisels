package com.kekecreations.carpentry_and_chisels.common.item;

import com.kekecreations.carpentry_and_chisels.core.registry.CCDatapackRegistries;
import net.minecraft.core.Holder;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;
import java.util.Optional;

public class ChiselUtils {

    @Nullable
    public static Block getFinalBlock(RegistryAccess access, BlockState state) {
        Optional<Chiseling> optionalPalette = access.registryOrThrow(CCDatapackRegistries.CHISELING).stream().filter(
                searchPalette -> searchPalette.mappings().containsKey(state.getBlockHolder())
        ).findFirst();
        if (optionalPalette.isEmpty()) return null;

        Chiseling palette = optionalPalette.get();
        Holder<Block> holder = palette.mappings().get(state.getBlockHolder());

        if (holder.unwrapKey().isEmpty()) return null;

        return access.registryOrThrow(Registries.BLOCK).getOrThrow(holder.unwrapKey().get());
    }
}
