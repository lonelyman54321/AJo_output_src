/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.usecase;

import com.affise.attribution.usecase.StoreUseCase$Companion;

public interface StoreUseCase {
    public static final String AMAZON = "Amazon";
    public static final String APK = "Apk";
    public static final StoreUseCase$Companion Companion = StoreUseCase$Companion.$$INSTANCE;
    public static final String GOOGLE = "GooglePlay";
    public static final String HUAWEI = "AppGallery";
    public static final String PREINSTALL = "Preinstall";
    public static final String RUSTORE = "RuStore";

    public String getStore();
}

