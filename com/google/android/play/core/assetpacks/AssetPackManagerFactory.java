/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.d;

public final class AssetPackManagerFactory {
    private AssetPackManagerFactory() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AssetPackManager getInstance(Context object) {
        Class<AssetPackManagerFactory> clazz = AssetPackManagerFactory.class;
        synchronized (clazz) {
            object = d.a((Context)object);
            return object.a();
        }
    }
}

