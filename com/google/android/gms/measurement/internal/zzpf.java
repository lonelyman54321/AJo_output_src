/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

public final class zzpf {
    final Context zza;

    public zzpf(Context context) {
        Preconditions.checkNotNull(context);
        context = context.getApplicationContext();
        Preconditions.checkNotNull(context);
        this.zza = context;
    }
}

