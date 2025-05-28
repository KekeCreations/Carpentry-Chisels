package com.kekecreations.carpentry_and_chisels.core.registry;

import com.kekecreations.carpentry_and_chisels.common.item.ChiselItem;
import com.kekecreations.carpentry_and_chisels.core.platform.Services;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class CCItems {

    public static final Supplier<Item> CHISEL = registerItem("chisel", () -> new ChiselItem(new Item.Properties().stacksTo(1).durability(130)));

    private static <T extends Item> Supplier<T> registerItem(String name, java.util.function.Supplier<T> itemSupplier) {
        return Services.REGISTRY.registerItem(name, itemSupplier);
    }

    public static void register() {}
}
