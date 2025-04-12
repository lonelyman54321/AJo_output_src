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
import com.google.android.gms.internal.measurement.zzgx;

final class zzgz
extends ContentObserver {
    private final /* synthetic */ zzgx zza;

    public zzgz(zzgx zzgx2, Handler handler) {
        this.zza = zzgx2;
        super(null);
    }

    public final void onChange(boolean bl2) {
        zzgx.zza(this.zza).set(true);
    }
}

