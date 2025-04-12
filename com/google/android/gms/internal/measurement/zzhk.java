/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.ContentObserver
 *  android.os.Handler
 */
package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.measurement.zzhi;

final class zzhk
extends ContentObserver {
    private final /* synthetic */ zzhi zza;

    public zzhk(zzhi zzhi2, Handler handler) {
        this.zza = zzhi2;
        super(null);
    }

    public final void onChange(boolean bl2) {
        this.zza.zzc();
    }
}

