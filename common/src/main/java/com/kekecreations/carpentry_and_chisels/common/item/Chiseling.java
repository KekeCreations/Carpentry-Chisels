package com.kekecreations.carpentry_and_chisels.common.item;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.RegistryFixedCodec;
import net.minecraft.world.level.block.Block;

import java.util.Map;

public record Chiseling(Map<Holder<Block>, Holder<Block>> mappings) {
    public static final Codec<Chiseling> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.unboundedMap(RegistryFixedCodec.create(Registries.BLOCK), RegistryFixedCodec.create(Registries.BLOCK)).fieldOf("chiseling").forGetter(Chiseling::mappings)
    ).apply(instance, Chiseling::new));

    public Chiseling(Map<Holder<Block>, Holder<Block>> mappings) {
        this.mappings = mappings;
    }
}
