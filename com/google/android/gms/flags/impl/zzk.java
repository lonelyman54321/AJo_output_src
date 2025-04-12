/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.flags.impl;

import android.content.Context;
import java.util.concurrent.Callable;

final class zzk
implements Callable {
    private final /* synthetic */ Context val$context;

    public zzk(Context context) {
        this.val$context = context;
    }

    public final /* synthetic */ Object call() {
        return this.val$context.getSharedPreferences("google_sdk_flags", 0);
    }
}

