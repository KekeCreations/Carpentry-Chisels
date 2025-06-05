package com.kekecreations.carpentry_and_chisels.core.registry;

import com.kekecreations.carpentry_and_chisels.Constants;
import com.kekecreations.carpentry_and_chisels.common.item.ChiselItem;
import com.kekecreations.jinxedlib.core.util.JinxedRegistryHelper;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class CCItems {

    public static final Supplier<Item> CHISEL = registerItem("chisel", () -> new ChiselItem(2, new Item.Properties().stacksTo(1).durability(250)));

    private static <T extends Item> Supplier<T> registerItem(String name, java.util.function.Supplier<T> itemSupplier) {
        return JinxedRegistryHelper.registerItem(Constants.MOD_ID, name, itemSupplier);
    }

    public static void register() {}
}
