package com.kekecreations.carpentry_and_chisels;


import com.kekecreations.carpentry_and_chisels.core.registry.CCBlocks;
import com.kekecreations.carpentry_and_chisels.core.registry.CCItems;

public class CarpentryAndChisels {



    public static void init() {
        CCItems.register();
        CCBlocks.register();
    }
}