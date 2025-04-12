/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.play.core.splitinstall.internal;

import android.content.Context;

public final class zzbr {
    public static Context zza(Context context) {
        Context context2 = context.getApplicationContext();
        if (context2 != null) {
            return context2;
        }
        return context;
    }
}

