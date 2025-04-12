/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;

public class NativeAssetPackStateUpdateListener
implements AssetPackStateUpdateListener {
    public native void onStateUpdate(AssetPackState var1);
}

