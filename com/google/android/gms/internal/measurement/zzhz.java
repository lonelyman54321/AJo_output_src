/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzhx;
import com.google.common.base.Supplier;

public final class zzhz
implements Supplier {
    private /* synthetic */ Context zza;

    public /* synthetic */ zzhz(Context context) {
        this.zza = context;
    }

    public final Object get() {
        return zzhx.zza(this.zza);
    }
}

