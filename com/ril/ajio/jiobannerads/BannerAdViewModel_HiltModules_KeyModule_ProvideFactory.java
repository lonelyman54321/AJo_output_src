/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads;

import com.ril.ajio.jiobannerads.BannerAdViewModel_HiltModules$KeyModule;
import com.ril.ajio.jiobannerads.BannerAdViewModel_HiltModules_KeyModule_ProvideFactory$InstanceHolder;

public final class BannerAdViewModel_HiltModules_KeyModule_ProvideFactory
implements nb2_2 {
    public static BannerAdViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return BannerAdViewModel_HiltModules_KeyModule_ProvideFactory$InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return BannerAdViewModel_HiltModules$KeyModule.provide();
    }

    public Boolean get() {
        return BannerAdViewModel_HiltModules_KeyModule_ProvideFactory.provide();
    }
}

