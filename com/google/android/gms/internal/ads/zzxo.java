/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzdb;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzvc;

public final class zzxo
extends zzvc {
    private final zzbu zzd;

    public zzxo(zzdc zzdc2, zzbu zzbu2) {
        super(zzdc2);
        this.zzd = zzbu2;
    }

    public final zzdb zze(int n3, zzdb zzdb2, long l2) {
        this.zzc.zze(n3, zzdb2, l2);
        Object object = this.zzd;
        zzdb2.zze = object;
        object = ((zzbu)object).zzd;
        zzdb2.zzd = null;
        return zzdb2;
    }
}

