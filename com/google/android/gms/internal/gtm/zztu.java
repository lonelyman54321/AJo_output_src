/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zztl;
import com.google.android.gms.internal.gtm.zzto;
import com.google.android.gms.internal.gtm.zztp;
import com.google.android.gms.internal.gtm.zzua;
import java.util.Iterator;

final class zztu
extends zztp {
    private final transient zzto zza;
    private final transient zztl zzb;

    public zztu(zzto zzto2, zztl zztl2) {
        this.zza = zzto2;
        this.zzb = zztl2;
    }

    public final boolean contains(Object object) {
        zzto zzto2 = this.zza;
        return (object = zzto2.get(object)) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzb.zzh(0);
    }

    public final int size() {
        return 6;
    }

    public final int zza(Object[] objectArray, int n3) {
        return this.zzb.zza(objectArray, 0);
    }

    public final zzua zzd() {
        return this.zzb.zzh(0);
    }
}

