/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;

public final class zzit {
    private final Context zza;

    public zzit(Context context) {
        this.zza = context;
    }

    public final String[] zza() {
        return this.zza.getAssets().list("");
    }

    public final String[] zzb(String string2) {
        return this.zza.getAssets().list("containers");
    }
}

