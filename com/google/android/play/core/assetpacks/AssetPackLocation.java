/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.br;

public abstract class AssetPackLocation {
    public static final /* synthetic */ int a;
    private static final AssetPackLocation b;

    static {
        br br4 = new br(1, null, null);
        b = br4;
    }

    public static AssetPackLocation a() {
        return b;
    }

    public abstract String assetsPath();

    public abstract int packStorageMethod();

    public abstract String path();
}

