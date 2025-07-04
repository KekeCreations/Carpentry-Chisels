package com.kekecreations.carpentry_and_chisels.core.registry;

import com.kekecreations.carpentry_and_chisels.Constants;
import net.mehvahdjukaar.every_compat.EveryCompat;

public class CCAddModules {

    public static void init() {
        EveryCompat.addIfLoaded(Constants.MOD_ID, () -> EveryCompatModule::new);
    }
}
