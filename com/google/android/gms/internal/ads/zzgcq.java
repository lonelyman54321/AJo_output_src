/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgbf;
import com.google.android.gms.internal.ads.zzgbh;
import com.google.android.gms.internal.ads.zzgcp;
import com.google.android.gms.internal.ads.zzgdi;
import java.util.Iterator;
import java.util.Map;

final class zzgcq
extends zzgbh {
    private final transient zzgbf zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzgcq(zzgbf zzgbf2, Object[] objectArray, int n3, int n4) {
        this.zza = zzgbf2;
        this.zzb = objectArray;
        this.zzc = n4;
    }

    public static /* bridge */ /* synthetic */ int zzv(zzgcq zzgcq2) {
        return zzgcq2.zzc;
    }

    public static /* bridge */ /* synthetic */ Object[] zzw(zzgcq zzgcq2) {
        return zzgcq2.zzb;
    }

    public final boolean contains(Object object) {
        boolean bl2 = object instanceof Map.Entry;
        if (bl2) {
            zzgbf zzgbf2;
            boolean bl3;
            object = (Map.Entry)object;
            Object object2 = object.getKey();
            if ((object = object.getValue()) != null && (bl3 = object.equals(object2 = (zzgbf2 = this.zza).get(object2)))) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzd().zzu(0);
    }

    public final int size() {
        return this.zzc;
    }

    public final int zza(Object[] objectArray, int n3) {
        return this.zzd().zza(objectArray, n3);
    }

    public final zzgdi zze() {
        return this.zzd().zzu(0);
    }

    public final boolean zzf() {
        return true;
    }

    public final zzgbc zzi() {
        zzgcp zzgcp2 = new zzgcp(this);
        return zzgcp2;
    }
}

