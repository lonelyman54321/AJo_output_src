/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbv {
    private final Context zza;
    private final Context zzb;

    public zzbv(Context context) {
        Preconditions.checkNotNull(context);
        context = context.getApplicationContext();
        Preconditions.checkNotNull(context, "Application context can't be null");
        this.zza = context;
        this.zzb = context;
    }

    public final Context zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }
}

