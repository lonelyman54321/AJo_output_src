/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzee;
import com.google.android.gms.internal.vision.zzef;
import com.google.android.gms.internal.vision.zzej;
import com.google.android.gms.internal.vision.zzeu;
import com.google.android.gms.internal.vision.zzfa;
import java.util.Iterator;
import java.util.Map;

final class zzer
extends zzej {
    private final transient zzef zza;
    private final transient Object[] zzb;
    private final transient int zzc;
    private final transient int zzd;

    public zzer(zzef zzef2, Object[] objectArray, int n3, int n4) {
        this.zza = zzef2;
        this.zzb = objectArray;
        this.zzc = 0;
        this.zzd = n4;
    }

    public static /* synthetic */ int zza(zzer zzer2) {
        return zzer2.zzd;
    }

    public static /* synthetic */ Object[] zzb(zzer zzer2) {
        return zzer2.zzb;
    }

    public final boolean contains(Object object) {
        boolean bl2 = object instanceof Map.Entry;
        if (bl2) {
            zzef zzef2;
            boolean bl3;
            object = (Map.Entry)object;
            Object object2 = object.getKey();
            if ((object = object.getValue()) != null && (bl3 = object.equals(object2 = (zzef2 = this.zza).get(object2)))) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zza();
    }

    public final int size() {
        return this.zzd;
    }

    public final int zza(Object[] objectArray, int n3) {
        return this.zze().zza(objectArray, n3);
    }

    public final zzfa zza() {
        return (zzfa)this.zze().iterator();
    }

    public final boolean zzf() {
        return true;
    }

    public final zzee zzh() {
        zzeu zzeu2 = new zzeu(this);
        return zzeu2;
    }
}

